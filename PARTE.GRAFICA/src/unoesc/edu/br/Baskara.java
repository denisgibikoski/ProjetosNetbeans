/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unoesc.edu.br;

/**
 *
 * @author D3nys
 */
public class Baskara extends javax.swing.JFrame {

    /**
     * Creates new form Baskara
     */
    public Baskara() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLbA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFValorA = new javax.swing.JTextField();
        jLbB = new javax.swing.JLabel();
        jTFValorB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFValorC = new javax.swing.JTextField();
        jBttCALCULAR = new javax.swing.JButton();
        jLbX1 = new javax.swing.JLabel();
        jLbVALORX1 = new javax.swing.JLabel();
        jLbX2 = new javax.swing.JLabel();
        jLbVALORX2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\D3nys\\Downloads\\equa11.gif")); // NOI18N
        jLabel1.setText("jLabel1");

        jLbA.setText("Valor A  :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("FORMULA DE BASKARA");

        jTFValorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorAActionPerformed(evt);
            }
        });

        jLbB.setText("Valor B :");

        jLabel3.setText("Valor C :");

        jBttCALCULAR.setText("CALCULAR ");
        jBttCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttCALCULARActionPerformed(evt);
            }
        });

        jLbX1.setText("Valor X1 :");

        jLbVALORX1.setText("...");

        jLbX2.setText("Valor X2 :");

        jLbVALORX2.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFValorA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLbB)
                                .addGap(18, 18, 18)
                                .addComponent(jTFValorB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbX1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLbVALORX1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLbX2)
                                .addGap(18, 18, 18)
                                .addComponent(jLbVALORX2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTFValorC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jBttCALCULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbA)
                    .addComponent(jTFValorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbB)
                    .addComponent(jTFValorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFValorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBttCALCULAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbX1)
                    .addComponent(jLbVALORX1)
                    .addComponent(jLbX2)
                    .addComponent(jLbVALORX2))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFValorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorAActionPerformed

    private void jBttCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttCALCULARActionPerformed
        // declaracao e conferter de string para valor
       String a = jTFValorA.getText();
       int A = Integer.parseInt(a);
       String b = jTFValorB.getText();
       int B = Integer.parseInt(b);
       String c = jTFValorC.getText();
       int C = Integer.parseInt(c); 
       //fazer o calculo de baskara 
       float Delta = (float) (Math.pow(B, 2)-(4-A-C));
       float X1 = (float) ((-B + Math.sqrt(Delta))/ Math.pow(A, 2));
       float X2 = (float) ((-B - Math.sqrt(Delta))/Math.pow(A, 2));
       
       // comferter de numero para String
       String x1 = String.valueOf(X1);
       String x2 = String.valueOf(X2);
       
       //mostar  na parte grafica
       jLbVALORX1.setText(x1);
       jLbVALORX2.setText(x2);
       
       
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jBttCALCULARActionPerformed

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
            java.util.logging.Logger.getLogger(Baskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baskara().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttCALCULAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbA;
    private javax.swing.JLabel jLbB;
    private javax.swing.JLabel jLbVALORX1;
    private javax.swing.JLabel jLbVALORX2;
    private javax.swing.JLabel jLbX1;
    private javax.swing.JLabel jLbX2;
    private javax.swing.JTextField jTFValorA;
    private javax.swing.JTextField jTFValorB;
    private javax.swing.JTextField jTFValorC;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
