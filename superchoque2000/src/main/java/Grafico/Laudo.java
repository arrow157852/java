/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Grafico;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.example.Dao;

/**
 *
 * @author Usuario03
 */
public class Laudo extends javax.swing.JInternalFrame {

    private ArrayList<Float> resultados = new ArrayList<>();
    private ArrayList<Float> valor = new ArrayList<>();
    private List<Integer> indices;
    private Dao dao = new Dao();
    double soma = 0.0;

    private int nivelDeProtecao, pontosAterramento, blocos;
    private String edificacao;
    private String material, servico;
    private float perimetro, altura, perimetroCaptor;
    private double quantDescidas, quantAnel, barra, diasCaptor, diasAnel, diasDescidas, diasAterramento, diasProtecaoMecanica, aliquota;
    double valorImposto = 0.0;
    double porcemtagemMaterial = 20.0 / 100;
    double porcemtagemMaodeObra = 40.0 / 100;
    double margemMaterial = 0;
    double margemMaodeObra = 0;
    double tudo = 0;
    double comissao = 10.0 / 100;
    double valorComissao = 0;
    double total = 0.0;

    public Laudo() {
        initComponents();
        habilitaCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jbFechar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jcbEdificacao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jbCalcular = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialog3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setTitle("Laudo");

        jbFechar.setIcon(new javax.swing.ImageIcon("C:\\programacao\\java\\superchoque2000\\src\\main\\java\\img\\sair.png")); // NOI18N
        jbFechar.setText("fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbNovo.setIcon(new javax.swing.ImageIcon("C:\\programacao\\java\\superchoque2000\\src\\main\\java\\img\\novo.png")); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon("C:\\programacao\\java\\superchoque2000\\src\\main\\java\\img\\cancelar.png")); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jcbEdificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blocos", "Outros" }));
        jcbEdificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdificacaoActionPerformed(evt);
            }
        });

        jLabel2.setText("quantidade /perimetro");

        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbEdificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCalcular)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFechar)
                    .addComponent(jbNovo)
                    .addComponent(jbCancelar))
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEdificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCalcular))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jcbEdificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEdificacaoActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        calcular();
         DecimalFormat formato = new DecimalFormat("#,##0.00");
        String totalFormatado = formato.format(total);
        JOptionPane.showMessageDialog(null, "o total do serviço é " + totalFormatado);
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
       habilitaBotoes(false);
        habilitaCampos(true);
        limpaCampos();
        jtfNumero.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed
    public void habilitaCampos(boolean estado){
        jtfNumero.setEnabled(estado);
        jcbEdificacao.setEnabled(estado);
        jbCalcular.setEnabled(estado);
   
}
    public void limpaCampos() {
        jtfNumero.setText("");
    }

    public void habilitaBotoes(boolean estado) {
        jbNovo.setEnabled(estado);
   
        jbCancelar.setEnabled(!estado);
    }

    public double calcular() {
        String itemSelecionado = (String) jcbEdificacao.getSelectedItem();
        if ("Blocos".equals(itemSelecionado)) {
            String texto = jtfNumero.getText();
            double numerdeBlocos = Double.parseDouble(texto);

            if (numerdeBlocos > 4) {
                total = numerdeBlocos * 300;
            } else {
                total = 1200;
            }
        } else {
            String texto = jtfNumero.getText();
            double totalPerimetro = Double.parseDouble(texto);
            if (totalPerimetro > 140) {
                total = (totalPerimetro / 90)*800;
            } else {
                total = 1200;
            }
            
            
        }
       
        return total;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JComboBox<String> jcbEdificacao;
    private javax.swing.JTextField jtfNumero;
    // End of variables declaration//GEN-END:variables
}
