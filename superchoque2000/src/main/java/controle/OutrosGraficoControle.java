/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import Interface.InterfaceControle;
import Modelo.OutrosGraficoModelo;
import dao.OutrosGraficoDao;

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
             ogm.setId((int)valores[0]);
        }
        ogm.setDescricao((String)valores[1]);
        ogm.setValor(Float.parseFloat((String) valores[2]));
        
        ogd.salvarDao(ogm);
    }
    

    @Override
    public void excluircontrole(int id) {
    }
    
}
