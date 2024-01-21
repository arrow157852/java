package Grafico;

import controle.MaodeObraGraficoControle;
import javax.swing.table.DefaultTableModel;



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
        consultaGrafico();
    }

    MaodeObraGraficoControle mogc = new MaodeObraGraficoControle();
    @Override
    public void salvarGrafico() {
        mogc.salvarControle(jtfId.getText(),jtfDescricao.getText(),jtfValor.getText());
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(jpnConsulta,
                new Object[] {50,680,50},
                new Object[] {"centro","esquerda","direita"},
                new Object[] {"ID","nome do material","valor"}
        );
        modelo= (DefaultTableModel)tabela.getModel();    }

    @Override
    public void consultaGrafico() {
        modelo.setNumRows(0);
        mogc.consultarControle(jtfConsulta.getText(),modelo);
    }

    @Override
    public void atualizarformulario() {
        jtfId.setText(tabela.getValueAt(tabela.getSelectedRow(),0).toString());
        jtfDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(),1).toString());
        jtfValor.setText(tabela.getValueAt(tabela.getSelectedRow(),2).toString());    }

    @Override
    public void excluirVisao() {
        mogc.excluircontrole(Integer.parseInt(jtfId.getText()));
    }
}
