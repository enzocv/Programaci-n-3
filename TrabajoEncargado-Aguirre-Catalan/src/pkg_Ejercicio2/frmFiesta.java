
package pkg_Ejercicio2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.omg.CORBA.portable.InputStream;
import pkg_Ejercicio2.clsFiesta;

public class frmFiesta extends javax.swing.JFrame {

    clsFiesta objfiesta = new clsFiesta();
    int menor = 0;
    
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
        setUndecorated(true);

        jLabel1.setText("FIESTA");

        jLabel3.setText("Edad:");

        txtedad.setBackground(new java.awt.Color(204, 255, 204));
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

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
        
        int personasasistentes = personasAsistentes();
        int nHombres = cantidadHombres();
        int nMujeres = cantidadMujeres();
        double promEdadSexo[] = promedioEdadSexo();
        int edadMenor = edadMenor();
        
        String resultado = "Asistentes: " + personasasistentes + 
                           "\nCantidad de Hombres: " + nHombres +
                            "\nCantidad de Mujeres: " + nMujeres +
                            "\nPromedio Edades Hombres: " + promEdadSexo[0] +
                            "\nPromedio Edades Mujeres: " + promEdadSexo[1] + 
                            "\nEdad del la persona más joven: " + edadMenor;
        
        txtresultado.setText(resultado);
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        String sexo = "";
        int edad = 0;
        //VALIDACION DE CAJA DE TEXTO EDAD
        if (!txtedad.getText().equals("")) {
            edad = Integer.parseInt(txtedad.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "Campo de Edad vacio.");
        }
        if (edad >= 18 && (rbtnH.isSelected() || rbtnM.isSelected())) {
            
            if (rbtnH.isSelected()) {
            sexo = "Hombre";
            }
            else if (rbtnM.isSelected()) {
                sexo = "Mujer";
            }


            //CREACION DEL FICHERO
            objfiesta.crearFichero();

            //OBTENER EL ÚLTIMO ID
            List<String> list = listaFichero();
            int id = 1;
            if (list.size()>=3) {
                id = Integer.parseInt(list.get(list.size()-3)) + 1;
            }
            
            objfiesta.insertarDatos(id, edad, sexo);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se permite el ingreso a menores de edad, o faltan ingresar datos");
            txtedad.setEnabled(false);
            btnagregar.setEnabled(false);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        //VALIDAR LOS CAMPOS DE TEXTO PARA SOLO PORDER INGRSAR NUMEROS
        char numero = evt.getKeyChar();
        
        if (Character.isLetter(numero)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "!Ingrese solo NUMEROS¡");
        }
    }//GEN-LAST:event_txtedadKeyTyped
    
    //LISTAR EL FICHERO PARA OBTENER TODOS LOS DATOS
    private List<String> listaFichero(){
        File archivo = new File("fiesta.txt");
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(archivo);) {
            scanner.useDelimiter("\t|\n");
            while (scanner.hasNextLine()) {
                list.add(scanner.next());
            }
        } catch (Exception e) {
        }    
        return list;
    }
    
    //NUMERO TOTAL DE PERSONAS EN LA FIESTA
    public int personasAsistentes(){
        List<String> list = listaFichero();
        int id = 1;
        if (list.size()>=3) {
            id = Integer.parseInt(list.get(list.size()-3)) + 1;
        }
        return id;
    }
    
    //SUMA DE TODAS LAS EDADES 
    public int sumaTotalEdades(){
        List<String> list = listaFichero();
        int totalEdades = 0;
        
        for (int i = 0; i < list.size(); i+=3) {
            totalEdades += Integer.parseInt(list.get(i+1));
        }
        return totalEdades;
    }
    
    //TOTAL DE MUJERES Y HOMBRES EN LA FIESTA
    private int cantidadHombres() {
        List<String> list = listaFichero();
        int hombres = 0;
        
        for (int i = 0; i < list.size(); i+=3) {
            if (list.get(i+2).trim().equals("Hombre")) {
                hombres+=1;
            }
        }
        return hombres;
    }
    
    private int cantidadMujeres() {
        List<String> list = listaFichero();
        int mujeres = 0;
        
        for (int i = 0; i < list.size(); i+=3) {
            if (list.get(i+2).trim().equals("Mujer")) {
                mujeres+=1;
            }
        }
        return mujeres;
    }
    
    //PROMEDIO DE EDADES POR SEXO
    public double[] promedioEdadSexo(){
        List<String> list = listaFichero();
        double promH = 0;
        double promM = 0;
        int total = sumaTotalEdades();
        int tHombres = cantidadHombres();
        int tMujeres = cantidadMujeres();
        
        for (int i = 0; i < list.size(); i+=3) {
            
            if (list.get(i+2).trim().equals("Hombre")) {
                promH = total / tHombres;
            }
            else{
                promM = total / tMujeres; 
            }
        }
        
        return new double[]{promH, promM};
    }
    
    //CALCULAR LA EDAD MENOR DENTRO DE LAS PERSONAS EN LA FIESTA
    public int edadMenor(){
        List<String> list = listaFichero();
        int menor = Integer.parseInt(list.get(1));
        for (int i = 0; i < list.size(); i+=3) {
            if ( menor > Integer.parseInt(list.get(i+1)) ) {
                menor = Integer.parseInt(list.get(i+1));
            }
        }
        
        return menor;
    }
    
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
