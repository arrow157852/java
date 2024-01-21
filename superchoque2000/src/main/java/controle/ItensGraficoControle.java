package controle;


import Interface.InterfaceControle;
import Modelo.ItensGraficoModelo;
import dao.ItensGraficoDao;
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
public class ItensGraficoControle implements InterfaceControle {
    
    ItensGraficoModelo igm =new ItensGraficoModelo();
    ItensGraficoDao igd = new ItensGraficoDao();

    @Override
    public void salvarControle(Object... valores) {
         if("".equals(valores[0])){
       igm.setId(0);
        }else {
             igm.setId(Integer.parseInt(valores[0].toString()));
        }
       
        igm.setDescricao((String)valores[1]);
        igm.setValor(Float.parseFloat((String) valores[2]));
        
       // enviar inforções para dao
       igd.salvarDao(igm);
       
    }

    @Override
    public void excluircontrole(int id) {
        igd.excluirDao(id);
    }

    @Override
    public void consultarControle(Object... valores) {
        try {
            igd.consultarDao(valores);
        } catch (SQLException ex) {
            Logger.getLogger(ItensGraficoControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
