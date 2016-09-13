
package pkg_Ejercicio2;

import javax.swing.JOptionPane;
import pkg_Ejercicio2.clsFiesta;

public class frmFiesta extends javax.swing.JFrame {

    clsFiesta objfiesta = new clsFiesta();
    int contador = 0;
    String resultado = "";
    String x[][] = null;
    
    public frmFiesta() {
        initComponents();
        cargarGrupoBotones();
    }
    
    void cargarGrupoBotones(){
        grupoBotones.add(rbtnH);
        grupoBotones.add(rbtnM);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        rbtnH = new javax.swing.JRadioButton();
        rbtnM = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextArea();
        btnagregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FIESTA");

        jLabel3.setText("Edad:");

        txtedad.setBackground(new java.awt.Color(204, 255, 204));

        rbtnH.setText("Hombre");

        rbtnM.setText("Mujer");

        jLabel4.setText("Sexo:");

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        txtresultado.setBackground(new java.awt.Color(255, 255, 204));
        txtresultado.setColumns(20);
        txtresultado.setRows(5);
        jScrollPane1.setViewportView(txtresultado);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtedad)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnH, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnM, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncalcular)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtnH)
                    .addComponent(rbtnM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btncalcular)
                    .addComponent(btnlimpiar)
                    .addComponent(btnsalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtedad.setText("");
        txtresultado.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        
        //PERSONAS QUE ASISTIERON A LA FIESTA
        int total = objfiesta.npersonasAsistentes();
        
        //CANTIDAD DE HOMBRES Y DE MUJERES
        objfiesta.cantidadHombresMujeres();
        
        //PROMEDIO DE EDADES POR SEXO
        objfiesta.promEdades();
        
        //RESULTADO
        resultado = "Total de Personas: " + total +"\nCantidad de Hombres: "+ objfiesta.nHombres+
                    "\nCantidad de Mujeres: " + objfiesta.nMujeres+
                    "\nPromedio Edades por Sexo: Hombres" + objfiesta.promEdadHombres + "\tMujeres: " + 
                                                                                            objfiesta.promEdadMujeres+
                    "\nEdad de la persona más Joven: "+ objfiesta.edadMasJoven;
        txtresultado.setText(resultado);
        
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        String sexo = "";
        
        if (rbtnH.isSelected()) {
            sexo = "Hombre";
        }
        else if (rbtnM.isSelected()) {
            sexo = "Mujer";
        }
        int edad = Integer.parseInt(txtedad.getText());
        
        
        objfiesta.guardarDatosEnArray(edad,sexo, contador);
        contador++;
        
    }//GEN-LAST:event_btnagregarActionPerformed

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
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFiesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnH;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextArea txtresultado;
    // End of variables declaration//GEN-END:variables
}
