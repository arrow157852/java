package Grafico;

import controle.OutrosGraficoControle;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario03
 */
public class OutrosGrafico extends FormPadrao {
    public void OutrosGrafico(){
         setTitle("cadastro de  diversos ");
    }

    OutrosGraficoControle  ogc = new OutrosGraficoControle();
    
    @Override
    public void salvarGrafico() {
        ogc.salvarControle(jtfId.getText(),jtfDescricao.getText(),jtfValor.getText());
    }
}
