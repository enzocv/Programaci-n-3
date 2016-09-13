package pkg_Ejercicio1;

import java.io.*;
import java.io.DataInput;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkg_Ejercicio1.clsOperaciones;

public class frmOperacionesAritmeticas extends javax.swing.JFrame {

    //MANEJAR LA TABLA
    DefaultTableModel modelo ;
    int fila = 0; //VARIABLE PARA ESTABLECER LA FILA DONDE SE UBICARAN LOS DATOS
    
    //INSTANCIA DE CLASE
    clsOperaciones objoperaciones = new clsOperaciones();
    
    public frmOperacionesAritmeticas() {
        initComponents();
        cargarGrid();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        cmboperaciones = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbbuscaOperacion = new javax.swing.JComboBox<>();
        btnleerTodos = new javax.swing.JButton();
        btnleerPorTipo = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnleerPorCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 01");

        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid);

        jLabel1.setText("OPERACIONES ARITMÉTICAS");

        jLabel2.setText("Número 1:");

        txta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaMouseClicked(evt);
            }
        });
        txta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaKeyTyped(evt);
            }
        });

        jLabel3.setText("Número 2:");

        txtb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbKeyTyped(evt);
            }
        });

        cmboperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "División" }));

        jLabel4.setText("Operación:");

        jLabel5.setText("BÚSQUEDA :");

        jLabel6.setText("Código:");

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        jLabel7.setText("Tipo:");

        cmbbuscaOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "División" }));

        btnleerTodos.setText("Leer todos");
        btnleerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerTodosActionPerformed(evt);
            }
        });

        btnleerPorTipo.setText("Leer por Operacion");
        btnleerPorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerPorTipoActionPerformed(evt);
            }
        });

        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnleerPorCodigo.setText("Leer por Código");
        btnleerPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerPorCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmboperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbbuscaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel4)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnleerPorTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnleerPorCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(btnleerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnleerTodos)
                    .addComponent(btngrabar))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnactualizar)
                            .addComponent(btnleerPorCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnleerPorTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btneliminar)
                                .addComponent(cmbbuscaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        //CREACION DEL FICHERO
        objoperaciones.crearFichero();
        
        //OBTENER EL ÚLTIMO ID
        List<String> list = listaFichero();
        int id = 1;
        if (list.size()>=5) {
            id = Integer.parseInt(list.get(list.size()-5)) + 1;
        }
        
        //EVALUACION PARA VALIDAR LA DIVISIÓN
        if (!cmboperaciones.getSelectedItem().equals("División")) {
            objoperaciones.obtenerResultado(cmboperaciones.getSelectedItem().toString(),
                                            Double.parseDouble(txta.getText()), 
                                            Double.parseDouble(txtb.getText()));
            
            objoperaciones.insertarDatos(id,Double.parseDouble(txta.getText()),
                                         Double.parseDouble(txtb.getText()),
                                         cmboperaciones.getSelectedItem().toString(), 
                                         objoperaciones.resultado);
        }
        //SI ES DIVISIÓN SE EVALUA EL DATO QUE TENGA LA CAJA DE TEXTO B
        else if (Double.parseDouble(txtb.getText()) != 0) {
            objoperaciones.obtenerResultado(cmboperaciones.getSelectedItem().toString(),
                                            Double.parseDouble(txta.getText()), 
                                            Double.parseDouble(txtb.getText()));
            
            objoperaciones.insertarDatos(id,Double.parseDouble(txta.getText()),
                                         Double.parseDouble(txtb.getText()),
                                         cmboperaciones.getSelectedItem().toString(), 
                                         objoperaciones.resultado);
        }
        else{JOptionPane
                .showMessageDialog(null, "La división entre 0 no es aceptada");}
        
        Object[] filas = {id,txta.getText(),txtb.getText(),objoperaciones.operacion,objoperaciones.resultado};
        DefaultTableModel model = (DefaultTableModel) grid.getModel();
        model.addRow(filas);  
        
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            File inputFile = new File("operaciones.txt");
            File tempFile = new File("operaciones-temp.txt");
            
            BufferedReader reader = null;
            BufferedWriter writer = null;
            
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            
            String lineToRemove = txtcodigo.getText()+"\t";
            String currentLine;
            
            while((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if(trimmedLine.startsWith(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
                
            }
            writer.close();
            reader.close();
            inputFile.delete();
            boolean successful = tempFile.renameTo(inputFile);
//            JOptionPane.showMessageDialog(null, successful);
            refrescarGrid();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    
    private List<String> listaFichero(){
        File archivo = new File("operaciones.txt");
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
    
    private void btnleerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerTodosActionPerformed
        refrescarGrid();     
    }//GEN-LAST:event_btnleerTodosActionPerformed

    private void btnleerPorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerPorTipoActionPerformed
        //AGREGANDO LOS DATOS DEL FICHERO A UN ARRAY LIST
        List<String> list = listaFichero();
               
        //lIMPIAR LA JTABLE
        cargarGrid();
        
        //MOSTRAR EN LA JTABLE
        for (int i = 0; i < list.size(); i+=5) {
            if (list.get(i+3).equals(cmbbuscaOperacion.getSelectedItem())) {
                Object[] filas = {list.get(i),list.get(i+1),list.get(i+2),list.get(i+3),list.get(i+4)};
                DefaultTableModel model = (DefaultTableModel) grid.getModel();
                model.addRow(filas);  
            }
        }
    }//GEN-LAST:event_btnleerPorTipoActionPerformed

    private void btnleerPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerPorCodigoActionPerformed
        //AGREGANDO LOS DATOS DEL FICHERO A UN ARRAY LIST
        List<String> list = listaFichero();
               
        //lIMPIAR LA JTABLE
        cargarGrid();
        
        //MOSTRAR EN LA JTABLE
        for (int i = 0; i < list.size(); i+=5) {
            if (list.get(i).equals(txtcodigo.getText())) {
                Object[] filas = {list.get(i),list.get(i+1),list.get(i+2),list.get(i+3),list.get(i+4)};
                DefaultTableModel model = (DefaultTableModel) grid.getModel();
                model.addRow(filas);  
            }
        }
    }//GEN-LAST:event_btnleerPorCodigoActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
            try {
            File inputFile = new File("operaciones.txt");
            File tempFile = new File("operaciones-temp.txt");
            
            BufferedReader reader = null;
            BufferedWriter writer = null;
            
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            
            String lineToRemove = txtcodigo.getText()+"\t";
            String currentLine;
            
            while((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if(trimmedLine.startsWith(lineToRemove)){
                    writer.write(txtcodigo.getText()+"\t"+
                                 txta.getText()+"\t"+
                                 txtb.getText()+"\t"+
                                 cmboperaciones.getSelectedItem()+"\t"+
                                 objoperaciones.obtenerResultado(String.valueOf(cmboperaciones.getSelectedItem()),Double.parseDouble(txta.getText()),Double.parseDouble(txtb.getText()))+
                                 System.getProperty("line.separator"));
                }
                else{
                    writer.write(currentLine + System.getProperty("line.separator"));
                }                
            }
            writer.close();
            reader.close();
            inputFile.delete();
            boolean successful = tempFile.renameTo(inputFile);
//            JOptionPane.showMessageDialog(null, successful);
            refrescarGrid();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaMouseClicked
//        JOptionPane.showMessageDialog(null, grid.getSelectedRow());;
        
    }//GEN-LAST:event_txtaMouseClicked

    private void gridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridMouseClicked
        int i = grid.getSelectedRow();
        txta.setText(modelo.getValueAt(i, 1).toString());
        txtb.setText(modelo.getValueAt(i, 2).toString());
        txtcodigo.setText(modelo.getValueAt(i, 0).toString());
        
        String op = String.valueOf(modelo.getValueAt(i, 3).toString());
        
        if (op.equals("Suma")) {
            cmboperaciones.setSelectedIndex(0);
        }
        else if (op.equals("Resta")) {
            cmboperaciones.setSelectedIndex(1);
        }
        else if (op.equals("Multiplicacion")) {
            cmboperaciones.setSelectedIndex(2);
        }
        else{cmboperaciones.setSelectedIndex(3); }
    }//GEN-LAST:event_gridMouseClicked

    private void txtaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaKeyTyped
        //VALIDAR LOS CAMPOS DE TEXTO PARA SOLO PORDER INGRSAR NUMEROS
        char numero = evt.getKeyChar();
        
        if (Character.isLetter(numero)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "!Ingrese solo NUMEROS¡");
        }
    }//GEN-LAST:event_txtaKeyTyped

    private void txtbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbKeyTyped
        //VALIDAR LOS CAMPOS DE TEXTO PARA SOLO PORDER INGRSAR NUMEROS
        char numero = evt.getKeyChar();
        
        if (Character.isLetter(numero)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "!Ingrese solo NUMEROS¡");
        }
    }//GEN-LAST:event_txtbKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        //VALIDAR LOS CAMPOS DE TEXTO PARA SOLO PORDER INGRSAR NUMEROS
        char numero = evt.getKeyChar();
        
        if (Character.isLetter(numero)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "!Ingrese solo NUMEROS¡");
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    
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
            java.util.logging.Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOperacionesAritmeticas().setVisible(true);
            }
        });
    }
    
    //MOSTRAR DATOS
    void mostrarDatos(){
        if (objoperaciones.datosOperaciones.size() == 0) {
            objoperaciones.ficheroAObjeto(); //CARGAR DATOS
        }
        
        //FOREACH: ITERAR EN LOS CAMPOS DEL ARRAY LIST 
        for (clsOperaciones item : objoperaciones.datosOperaciones) {
            modelo.insertRow(fila, new Object[]{}); //INSERTA LA FILA EN TIEMPO DE EJECUCION
            
            //INSERTA LOS DATOS A LA TABLA
            modelo.setValueAt(item.id, fila, 0);
            modelo.setValueAt(item.a, fila, 1);
            modelo.setValueAt(item.b, fila, 2);
            modelo.setValueAt(item.operacion, fila, 3);
            modelo.setValueAt(item.resultado, fila, 4);
            fila++;
        }
    }
    
    void cargarGrid(){
        String data[][]={};
        String columnas[] = {"ID","Valor de A","Valor de B","Operacion","Resultado"};
        modelo = new DefaultTableModel(data,columnas);
        grid.setModel(modelo);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnleerPorCodigo;
    private javax.swing.JButton btnleerPorTipo;
    private javax.swing.JButton btnleerTodos;
    private javax.swing.JComboBox<String> cmbbuscaOperacion;
    private javax.swing.JComboBox<String> cmboperaciones;
    public static javax.swing.JTable grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables

    private void refrescarGrid() {
        //AGREGANDO LOS DATOS DEL FICHERO A UN ARRAY LIST
        List<String> list = listaFichero();
               
        //lIMPIAR LA JTABLE
        cargarGrid();
        
        //MOSTRAR EN LA JTABLE
        for (int i = 0; i < list.size(); i+=5) {
            Object[] filas = {list.get(i),list.get(i+1),list.get(i+2),list.get(i+3),list.get(i+4)};
            DefaultTableModel model = (DefaultTableModel) grid.getModel();
            model.addRow(filas);  
        }
    }
}
