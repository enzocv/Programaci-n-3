
package pkg_Ejercicio2;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import pkg_Ejercicio1.clsOperaciones;

public class clsFiesta {
    //VARIABLES
    int edad, asistieron, nHombres = 0, nMujeres = 0, edadMasJoven = 0;
    String sexo;
    double promEdadHombres, promEdadMujeres;
    
    //ARCHIVO
    File ficheroOperaciones = new File("fiesta.txt");
    
    //CREACION DE ARRAY LIST DE DATOS (OBJETO)
    ArrayList<clsFiesta> datosOperaciones = new ArrayList<clsFiesta>();
    clsFiesta objeto = null;
    
    //CREAR EL FICHERO
    public void crearFichero(){
        try {
            if (!ficheroOperaciones.exists()) {
                ficheroOperaciones.createNewFile();
                JOptionPane.showMessageDialog(null,"El Fichero fue creado correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null,"El Fichero ya existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error al crear Fichero", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //INSERTAR DATOS AL FICHERO
    public void insertarDatos(int id, int edad , String sexo){
        try {
            //this.operacion = operacion;
            
            //FLUJO DE ESCRITURA
            BufferedWriter escribirArchivo = new BufferedWriter
                                                (new OutputStreamWriter
                                                    (new FileOutputStream(ficheroOperaciones, true),"utf-8"));
            
            //INSERTAR EN EL FICHERO LA SIGUIENTE CADENA
            escribirArchivo.write(id + "\t" + edad + "\t" + sexo + "\r\n");
            
            //MESNAJE DE CONFIRMACION DE QUE LA CADENA SE GUARDO
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            
            
            //CERRAMOS EL FLUJO
            escribirArchivo.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error al Insertar los datos!");
        }
    }
}
