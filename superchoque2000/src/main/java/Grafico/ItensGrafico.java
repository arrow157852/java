package Grafico;

import controle.ItensGraficoControle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario03
 */
public class ItensGrafico extends FormPadrao{
   public ItensGrafico(){
    setTitle("cadastro de itens");
    
   }

   ItensGraficoControle igc = new ItensGraficoControle();
    @Override
    public void salvarGrafico() {
        igc.salvarControle(jtfId.getText(),jtfDescricao.getText(),jtfValor.getText());
    }
}
