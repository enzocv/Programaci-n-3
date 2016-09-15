
package pkg_Ejercicio1;
//IMPORTACIONES DE LAS LIBRERIAS A UTILIZAR
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class clsOperaciones {
    //VARIABLES
    double a, b, resultado;
    String operacion = "";
    int id ;
    
    //ARCHIVO
    File ficheroOperaciones = new File("operaciones.txt");
    
    //CONSTRUCTOR SIN PARAMETROS
    public clsOperaciones(){}
    
    //CONSTRUCTOR CON PARAMETROS
    public clsOperaciones(int id, double a, double b, String operacion, double resultado){
        this.id = id;
        this.a = a;
        this.b = b;
        this.operacion = operacion;
        this.resultado = resultado;
    }
    
    //CREAR FICHERO
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
    public void insertarDatos(int id, double a ,double b, String operacion, double resultado){
        try {
            this.operacion = operacion;
            
            //FLUJO DE ESCRITURA
            BufferedWriter escribirArchivo = new BufferedWriter
                                                (new OutputStreamWriter
                                                    (new FileOutputStream(ficheroOperaciones, true),"utf-8"));
            
            //INSERTAR EN EL FICHERO LA SIGUIENTE CADENA
            escribirArchivo.write(id + "\t" + a + "\t" + b + "\t" + operacion + "\t" + 
                                  obtenerResultado(operacion, a, b) + "\r\n");
            
            //MESNAJE DE CONFIRMACION DE QUE LA CADENA SE GUARDO
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            
            //CERRAMOS EL FLUJO
            escribirArchivo.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error al Insertar los datos!");
        }
    }
    
    //CALCULAR EL RESULTADO
    public double obtenerResultado(String operacion,double a, double b){
        switch(operacion){
            case "Suma":
                resultado = a + b;
                break;
                
            case "Resta":
                resultado = a - b;
                break;
                
            case "Multiplicacion":
                resultado = a * b;
                break;
                
            case "División":
                resultado = a / b;
                break;
                
            default: JOptionPane.showMessageDialog(null, "¡Operacion Incorrecta!");
        }
        
        return resultado;
    }
    
}
