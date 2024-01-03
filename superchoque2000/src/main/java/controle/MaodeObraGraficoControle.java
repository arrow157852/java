package controle;

import Interface.InterfaceControle;
import Modelo.MaodeObraGraficoModelo;
import dao.MaodeObraGraficoDao;

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
             mogm.setId((int)valores[0]);
        }
        mogm.setDescricao((String)valores[1]);
        mogm.setValor(Float.parseFloat((String) valores[2]));
        
        mogd.salvarDao(mogm);
    }

    @Override
    public void excluircontrole(int id) {
    }
    
}
