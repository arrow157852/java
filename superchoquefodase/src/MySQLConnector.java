import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnector {

    private Connection connection;

    public MySQLConnector(String host, String user, String password, String database) {
        connect(host, user, password, database);
    }

    public void connect(String host, String user, String password, String database) {
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Constrói a URL de conexão
            String url = "jdbc:mysql://" + host + "/" + database;

            // Conecta ao banco de dados
            this.connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão ao MySQL estabelecida com sucesso.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
                System.out.println("Conexão ao MySQL fechada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao fechar a conexão ao MySQL: " + e.getMessage());
        }
    }

    public void executeQuery(String query) {
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
            preparedStatement.executeUpdate();
            System.out.println("Consulta executada com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao executar a consulta: " + e.getMessage());
        }
    }

    public ResultSet fetchData(String query) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao buscar dados: " + e.getMessage());
            return null;
        }
    }
}
