/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unoesc.edu.br;

import java.util.Vector;

/**
 *
 * @author D3nys
 */
public class Calculadora extends javax.swing.JFrame {

    Vector<String> resultados = new Vector<>();

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTGOPERACOES = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLTRESULTADOS = new javax.swing.JList();
        jLbVALOR1 = new javax.swing.JLabel();
        jLbVALOR2 = new javax.swing.JLabel();
        jTFVALOR1 = new javax.swing.JTextField();
        jTFVALOR2 = new javax.swing.JTextField();
        jLbOPERACAO = new javax.swing.JLabel();
        jRBSOMAR = new javax.swing.JRadioButton();
        jRBSUBTRAIR = new javax.swing.JRadioButton();
        jRBDIVIDIR = new javax.swing.JRadioButton();
        jRBMUTIPLICAR = new javax.swing.JRadioButton();
        jLbOPECAO = new javax.swing.JLabel();
        jCKRES = new javax.swing.JCheckBox();
        jCKOP = new javax.swing.JCheckBox();
        jCKVAL = new javax.swing.JCheckBox();
        jBCALCULAR = new javax.swing.JButton();
        jLbRESULTADO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jLTRESULTADOS);

        jLbVALOR1.setText("VALOR 1:");

        jLbVALOR2.setText("VALOR 2:");

        jLbOPERACAO.setText("Operaçoes: ");

        BTGOPERACOES.add(jRBSOMAR);
        jRBSOMAR.setText("SOMAR");

        BTGOPERACOES.add(jRBSUBTRAIR);
        jRBSUBTRAIR.setText("SUBTRAIR");

        BTGOPERACOES.add(jRBDIVIDIR);
        jRBDIVIDIR.setText("DIVIDIR");

        BTGOPERACOES.add(jRBMUTIPLICAR);
        jRBMUTIPLICAR.setText("MULTIPLICAR");

        jLbOPECAO.setText("Opçoes: ");

        jCKRES.setText("Somente Resultado");

        jCKOP.setText("Operacao");

        jCKVAL.setText("VALORES");

        jBCALCULAR.setText("CALCULAR");
        jBCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCALCULARActionPerformed(evt);
            }
        });

        jLbRESULTADO.setText("Resultados :");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLbOPERACAO)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jRBSOMAR)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jRBSUBTRAIR)
                                    .add(jRBMUTIPLICAR))
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(jRBDIVIDIR)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 129, Short.MAX_VALUE)
                                .add(jBCALCULAR)
                                .addContainerGap(67, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLbRESULTADO)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(jLbVALOR1)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTFVALOR1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLbVALOR2)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTFVALOR2)))
                                .add(18, 18, 18)
                                .add(jLbOPECAO)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jCKRES)
                                    .add(jCKVAL)
                                    .add(jCKOP))))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 295, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLbVALOR1)
                            .add(jTFVALOR1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLbOPECAO))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLbVALOR2)
                            .add(jTFVALOR2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(7, 7, 7)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLbOPERACAO)
                            .add(jRBSOMAR)))
                    .add(layout.createSequentialGroup()
                        .add(jCKRES)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jCKVAL)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCKOP)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jRBSUBTRAIR)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRBDIVIDIR)
                    .add(jBCALCULAR))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jRBMUTIPLICAR)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLbRESULTADO)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCALCULARActionPerformed

        String v1 = jTFVALOR1.getText();
        String v2 = jTFVALOR2.getText();
//coverte as string para float
        float n1 = Float.parseFloat(v1);
        float n2 = Float.parseFloat(v2);
        float res = 0;
        String op = "";

        if (jRBSOMAR.isSelected()) {
            res = n1 + n2;
            op = "somar";
        } else if (jRBSUBTRAIR.isSelected()) {
            res = n1 - n2;
            op = "SUBITRAIR";
        } else if (jRBDIVIDIR.isSelected()) {
            res = n1 / n2;
            op = "DIVIDIR";
        } else if (jRBMUTIPLICAR.isSelected()) {
            res = n1 * n2;
            op = "MULTIPLICAR";
        }

        String resultado = "";
        if (jCKRES.isSelected()) {
            resultado += String.valueOf(res);
        }
        if (jCKVAL.isSelected()) {
            resultado += v1 + v2;
        }
        if (jCKOP.isSelected()) {
            resultado += op;
        }
        resultados.add(resultado);

        jLTRESULTADOS.setListData(resultados);




// TODO add your handling code here:
    }//GEN-LAST:event_jBCALCULARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTGOPERACOES;
    private javax.swing.JButton jBCALCULAR;
    private javax.swing.JCheckBox jCKOP;
    private javax.swing.JCheckBox jCKRES;
    private javax.swing.JCheckBox jCKVAL;
    private javax.swing.JList jLTRESULTADOS;
    private javax.swing.JLabel jLbOPECAO;
    private javax.swing.JLabel jLbOPERACAO;
    private javax.swing.JLabel jLbRESULTADO;
    private javax.swing.JLabel jLbVALOR1;
    private javax.swing.JLabel jLbVALOR2;
    private javax.swing.JRadioButton jRBDIVIDIR;
    private javax.swing.JRadioButton jRBMUTIPLICAR;
    private javax.swing.JRadioButton jRBSOMAR;
    private javax.swing.JRadioButton jRBSUBTRAIR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFVALOR1;
    private javax.swing.JTextField jTFVALOR2;
    // End of variables declaration//GEN-END:variables
}