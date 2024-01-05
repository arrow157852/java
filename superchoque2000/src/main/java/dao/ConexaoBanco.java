package dao;



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.example.Database;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario03
 */
public class ConexaoBanco {
    private static final String driveClass = "com.mysql.cj.jdbc.Driver";
    private static final String url ="jdbc:mysql://localhost:3306/grifo";
    private static final String user ="root";
    private static final String password = "1578";
    private String material;
    private float valorUnidade;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
    public static Connection abreConexao(){
        
        Connection con = null;
        
         try {
            Class.forName(driveClass);
            con = DriverManager.getConnection(url, user, password);
            exibirMensagem("Conectado com sucesso ao banco de dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            exibirMensagem("Erro ao conectar ao banco de dados: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        return con;
        
    }
     public void realizarConsulta(int id) {
        String sql = "SELECT material, valor_unidade FROM planilha WHERE id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            // Define o valor do parâmetro
            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    // Define os valores dos campos
                    this.setMaterial(rs.getString("material"));
                    this.setValorUnidade(rs.getFloat("valor_unidade"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro durante a consulta: " + e.getMessage());
        }
    }

      public String obterNomeMaterial(int id) {
        realizarConsulta(id);
        return getMaterial();
    }

    // Método para obter o valor da unidade
    public float obterValorUnidade(int id) {
        realizarConsulta(id);
        return getValorUnidade();
    }
    private static void exibirMensagem(String mensagem, int tipoMensagem) {
        JOptionPane.showConfirmDialog(null, mensagem, "Mensagem", JOptionPane.DEFAULT_OPTION, tipoMensagem);
    }
}
