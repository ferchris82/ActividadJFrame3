
import javax.swing.JOptionPane;


public class BotonesJFrame extends javax.swing.JFrame {
    
    double num1 = 0;
    double num2 = 0;
    double resultado = 0;
    
    public BotonesJFrame() {
        initComponents();
        setTitle("BotonesJFrame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(BotonesJFrame.EXIT_ON_CLOSE);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_num1 = new javax.swing.JTextField();
        txt_num2 = new javax.swing.JTextField();
        btn_sumar = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplica = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_raiz1 = new javax.swing.JButton();
        btn_raiz2 = new javax.swing.JButton();
        btn_mayor = new javax.swing.JButton();
        btn_limpia = new javax.swing.JButton();
        txt_resultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Numero 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Numero 2:");

        btn_sumar.setText("Suma");
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });

        btn_resta.setText("Resta");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplica.setText("Multiplica");
        btn_multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicaActionPerformed(evt);
            }
        });

        btn_divide.setText("Divide");
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });

        btn_raiz1.setText("Raiz de 1");
        btn_raiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raiz1ActionPerformed(evt);
            }
        });

        btn_raiz2.setText("Raiz de 2");
        btn_raiz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raiz2ActionPerformed(evt);
            }
        });

        btn_mayor.setText("Mayor");
        btn_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayorActionPerformed(evt);
            }
        });

        btn_limpia.setText("Limpia");
        btn_limpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_num1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txt_num2))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_sumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_resta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_multiplica)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_raiz2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_mayor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_limpia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_resultado)))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_divide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_raiz1)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sumar)
                    .addComponent(btn_resta)
                    .addComponent(btn_multiplica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_raiz1)
                    .addComponent(btn_divide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_raiz2)
                    .addComponent(btn_limpia)
                    .addComponent(btn_mayor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 297));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        suma();
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        resta();
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicaActionPerformed
        multiplica();
    }//GEN-LAST:event_btn_multiplicaActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        divide();
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_raiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raiz1ActionPerformed
        raiz1();
    }//GEN-LAST:event_btn_raiz1ActionPerformed

    private void btn_raiz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raiz2ActionPerformed
        raiz2();
    }//GEN-LAST:event_btn_raiz2ActionPerformed

    private void btn_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayorActionPerformed
        mayor();
    }//GEN-LAST:event_btn_mayorActionPerformed

    private void btn_limpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiaActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiaActionPerformed

    private void suma(){
        //Obtenemos los numeros ingresados en los textfields
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());
        resultado = num1+num2;
        txt_resultado.setText(Double.toString(resultado));
        
    }
    private void resta(){
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());
        resultado = num1-num2;
        txt_resultado.setText(Double.toString(resultado));
    }
    private void multiplica(){
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());
        resultado = num1*num2;
        txt_resultado.setText(Double.toString(resultado));
    }
    private void divide(){
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());
        if(num2 != 0){
            resultado = num1/num2;
            txt_resultado.setText(Double.toString(resultado));
        }else{
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
        }
        
    }
    private void raiz1(){
        resultado = Math.sqrt(num1);
        txt_resultado.setText((String.valueOf(resultado)));
    }
    private void raiz2(){
        resultado = Math.sqrt(num2);
        txt_resultado.setText((String.valueOf(resultado)));
    }
    private void mayor(){
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());
        if(num1>num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num1);
        }else if(num1==num2){
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }else{
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num2);
        }
    }
    private void limpiar(){
        txt_num1.setText("");
        txt_num2.setText("");
        txt_resultado.setText("");
    }
    
    
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
            java.util.logging.Logger.getLogger(BotonesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BotonesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BotonesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BotonesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BotonesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_limpia;
    private javax.swing.JButton btn_mayor;
    private javax.swing.JButton btn_multiplica;
    private javax.swing.JButton btn_raiz1;
    private javax.swing.JButton btn_raiz2;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextField txt_num2;
    private javax.swing.JTextField txt_resultado;
    // End of variables declaration//GEN-END:variables
}
