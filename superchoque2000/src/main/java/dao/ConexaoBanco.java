package dao;



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


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
    private static void exibirMensagem(String mensagem, int tipoMensagem) {
        JOptionPane.showConfirmDialog(null, mensagem, "Mensagem", JOptionPane.DEFAULT_OPTION, tipoMensagem);
    }
}
