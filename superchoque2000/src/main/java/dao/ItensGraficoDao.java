/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.InterfaceDao;
import Modelo.ItensGraficoModelo;
import java.sql.SQLException;

/**
 *
 * @author Usuario03
 */
public class ItensGraficoDao implements InterfaceDao {

    @Override
    public void salvarDao(Object... valores) {
        ItensGraficoModelo igm = (ItensGraficoModelo) valores[0];
        System.out.println("dao"+igm.getDescricao());
    }

    @Override
    public void consultarDao(Object... valores) throws SQLException {
    }

    @Override
    public void excluirDao(int id) {
    }
    
}
