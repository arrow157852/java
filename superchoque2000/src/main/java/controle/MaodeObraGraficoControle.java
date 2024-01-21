package controle;

import Interface.InterfaceControle;
import Modelo.MaodeObraGraficoModelo;
import dao.MaodeObraGraficoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario03
 */
public class MaodeObraGraficoControle implements InterfaceControle {

    MaodeObraGraficoModelo mogm = new MaodeObraGraficoModelo();
    MaodeObraGraficoDao mogd =new MaodeObraGraficoDao();
    @Override
    public void salvarControle(Object... valores) {
        if("".equals(valores[0])){
       mogm.setId(0);
        }else {
             mogm.setId(Integer.parseInt(valores[0].toString()));
        }
        mogm.setDescricao((String)valores[1]);
        mogm.setValor(Float.parseFloat((String) valores[2]));
        
        mogd.salvarDao(mogm);
    }

    @Override
    public void excluircontrole(int id) {
         mogd.excluirDao(id);
    }

    @Override
    public void consultarControle(Object... valores) {
        try {
            mogd.consultarDao(valores);
        } catch (SQLException ex) {
            Logger.getLogger(ItensGraficoControle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
