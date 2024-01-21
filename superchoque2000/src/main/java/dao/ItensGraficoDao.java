/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.InterfaceDao;
import Modelo.ItensGraficoModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario03
 */
public class ItensGraficoDao implements InterfaceDao {

     String sql;
    PreparedStatement stm;
    ResultSet resultado;
    @Override
    public void salvarDao(Object... valores) {
        ItensGraficoModelo igm = (ItensGraficoModelo) valores[0];
        System.out.println("dao"+igm.getDescricao());
        if (igm.getId() == 0) {
    // Inserção
            sql = "INSERT INTO planilha (material, valor_unidade) VALUES (?, ?)";
        } else {
            // Atualização
            sql = "UPDATE planilha SET material = ?, valor_unidade = ? WHERE id = ?";
        }

        try {
            // Preparando a conexão
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setString(1, igm.getDescricao());
            stm.setFloat(2, igm.getValor());

            if (igm.getId() > 0) {
                // Se for uma atualização, defina o valor na posição 3 (ID)
                stm.setInt(3, igm.getId());
            }

            // ... restante do código ...

            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "registro gravado");
            
            
        } catch (SQLException e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(null, "Erro ao gravar registro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        } 
    }

    @Override
    public void consultarDao(Object... valores) throws SQLException {
        DefaultTableModel tabela = (DefaultTableModel) valores[1];
        if("".equals((String)valores[0])){
        sql = "SELECT * FROM planilha";
        }else{
        sql = "SELECT * FROM planilha where material like '%"+valores[0]+"%'";
        }
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);
        resultado = stm.executeQuery();
        while (resultado.next()) {
            tabela.addRow(
                    new Object[]{
                        resultado.getInt("id"),
                            resultado.getString("material"),
                            resultado.getFloat("valor_unidade")

                    }
            );

        }
        stm.close();
    }

    @Override
    public void excluirDao(int id) {
        sql = "delete from planilha where  id = ?";
        try {
             stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setInt(1, id);
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso !");
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir registro "+e);
        }
    }
    
}
