package controle;


import Interface.InterfaceControle;
import Modelo.ItensGraficoModelo;
import dao.ItensGraficoDao;

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
             igm.setId((int)valores[0]);
        }
       
        igm.setDescricao((String)valores[1]);
        igm.setValor(Float.parseFloat((String) valores[2]));
        
       // enviar inforções para dao
       igd.salvarDao(igm);
       
    }

    @Override
    public void excluircontrole(int id) {
    }
    
}
