/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.InterfaceDao;
import Modelo.MaodeObraGraficoModelo;
import java.sql.SQLException;

/**
 *
 * @author Usuario03
 */
public class MaodeObraGraficoDao implements InterfaceDao {

    @Override
    public void salvarDao(Object... valores) {
        MaodeObraGraficoModelo mogm = (MaodeObraGraficoModelo) valores[0];
    }

    @Override
    public void consultarDao(Object... valores) throws SQLException {
    }

    @Override
    public void excluirDao(int id) {
    }
    
}
