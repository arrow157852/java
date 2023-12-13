import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // Substitua com suas credenciais de banco de dados
        String host = "localhost";
        String user = "3306";
        String password = "1578";
        String database = "grifo";

        // Crie uma instância do MySQLConnector para conexão ao banco de dados
        MySQLConnector mySQLConnector = new MySQLConnector(host, user, password, database);
        mySQLConnector.connect(host,user,password,database);

        // Exemplo de consulta ao banco de dados
        String queryConsulta = "SELECT * FROM sua_tabela";
        mySQLConnector.executeQuery(queryConsulta);

        // Exemplo de cálculo de serviço com base nos resultados da consulta
        String queryCalculo = "SELECT valor FROM sua_tabela WHERE condição";
        ResultSet resultSet = mySQLConnector.fetchData(queryCalculo);

        double resultadoDoServico = ServicoCalculator.calcularServico(resultSet);
        System.out.println("Resultado do serviço: " + resultadoDoServico);

        // Desconecte-se do banco de dados
        mySQLConnector.disconnect();
    }
}

