package Grafico;

import controle.ItensGraficoControle;
import javax.swing.table.DefaultTableModel;

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
    consultaGrafico();
    
   }

   ItensGraficoControle igc = new ItensGraficoControle();
    @Override
    public void salvarGrafico() {
        igc.salvarControle(jtfId.getText(),jtfDescricao.getText(),jtfValor.getText());
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(jpnConsulta,
                new Object[] {50,680,50},
                new Object[] {"centro","esquerda","direita"},
                new Object[] {"ID","nome do material","valor"}
        );
        modelo= (DefaultTableModel)tabela.getModel();
        
    }

    @Override
    public void consultaGrafico() {
        modelo.setNumRows(0);
        igc.consultarControle(jtfConsulta.getText(),modelo);
    }

    @Override
    public void atualizarformulario() {
        jtfId.setText(tabela.getValueAt(tabela.getSelectedRow(),0).toString());
        jtfDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(),1).toString());
        jtfValor.setText(tabela.getValueAt(tabela.getSelectedRow(),2).toString());
    }

    @Override
    public void excluirVisao() {
        igc.excluircontrole(Integer.parseInt(jtfId.getText()));    
    }
}
