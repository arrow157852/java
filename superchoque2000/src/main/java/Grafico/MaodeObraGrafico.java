package Grafico;

import controle.MaodeObraGraficoControle;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario03
 */
public class MaodeObraGrafico extends FormPadrao {
    public MaodeObraGrafico (){
        setTitle("cadastro de mao de obra ");
    }

    MaodeObraGraficoControle mogc = new MaodeObraGraficoControle();
    @Override
    public void salvarGrafico() {
        mogc.salvarControle(jtfId.getText(),jtfDescricao.getText(),jtfValor.getText());
    }
}
