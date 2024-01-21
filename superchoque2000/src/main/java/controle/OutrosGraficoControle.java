/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import Interface.InterfaceControle;
import Modelo.OutrosGraficoModelo;
import dao.OutrosGraficoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario03
 */
public class OutrosGraficoControle implements InterfaceControle {

    OutrosGraficoModelo ogm = new OutrosGraficoModelo();
    OutrosGraficoDao ogd =new OutrosGraficoDao();
    @Override
    public void salvarControle(Object... valores) {
         if("".equals(valores[0])){
            ogm.setId(0);
        }else {
             ogm.setId(Integer.parseInt(valores[0].toString()));
        }
        ogm.setDescricao((String)valores[1]);
        ogm.setValor(Float.parseFloat((String) valores[2]));
        
        ogd.salvarDao(ogm);
    }
    

    @Override
    public void excluircontrole(int id) {
         ogd.excluirDao(id);
    }

    @Override
    public void consultarControle(Object... valores) {
        try {
            ogd.consultarDao(valores);
        } catch (SQLException ex) {
            Logger.getLogger(ItensGraficoControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
