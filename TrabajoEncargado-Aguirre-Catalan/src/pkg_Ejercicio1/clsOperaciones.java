
package pkg_Ejercicio1;
//IMPORTACIONES DE LAS LIBRERIAS A UTILIZAR
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    // CONSTRUCTOR DE OPERACIÓN SIN SOLUCIÓN
    public clsOperaciones(int id, double a, double b, String operacion){
        this.id = id;
        this.a = a;
        this.b = b;
        this.operacion = operacion;
    }
    
    //CREAR FICHERO
    public void crearFichero(){
        try {
            if (!ficheroOperaciones.exists()) {
                ficheroOperaciones.createNewFile();
                JOptionPane.showMessageDialog(null,"El Fichero fue creado correctamente");
            }
            else{
//                JOptionPane.showMessageDialog(null,"El Fichero ya existe");
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
    
    public void eliminarDatos(String idBorrar){
        try {
            // SE CREA UNA NUEVA FILA TEMPORAL DONDE SE ALMACENARÁN LAS LÍNEAS QUE NO SE ELIMINAN
            File tempFile = new File("operaciones-temp.txt");
            
            // SE DECLARAN EL READER Y EL WRITER
            BufferedReader reader = null;
            BufferedWriter writer = null;
            
            // SE INSTANCIAN EL READER Y EL WRITER
            reader = new BufferedReader(new FileReader(ficheroOperaciones));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            // SE ASIGNA LA LÍNEA A BORRAR SEGÚN EL ID INDICADO
            String lineaaBorrar = idBorrar +"\t";
            String currentLine;
            
            while((currentLine = reader.readLine()) != null) {
                String lineaCortada = currentLine.trim();
                // SI LA LÍNEA EMPIEZA CON EL ID ESPECIFICADO, ENTONCES NO SE ELIMINA
                if(lineaCortada.startsWith(lineaaBorrar)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
                
            }
            
            // SE CIERRAN EL WRITER Y EL READER
            writer.close();
            reader.close();
            
            // EL ARCHIVO ORIGINAL SE ELIMINA
            ficheroOperaciones.delete();
            
            // EL ARCHIVO TEMPORAL SE RENOMBRA COMO EL ORIGINAL
            boolean successful = tempFile.renameTo(ficheroOperaciones);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarDatos(){
        try {
            // SE CREA UNA NUEVA FILA TEMPORAL DONDE SE ALMACENARÁN LAS LÍNEAS QUE NO SE ACTUALIZAN
            File tempFile = new File("operaciones-temp.txt");
            
            // SE DECLARAN EL READER Y EL WRITER
            BufferedReader reader = null;
            BufferedWriter writer = null;
            
            // SE INSTANCIAN EL READER Y EL WRITER
            reader = new BufferedReader(new FileReader(ficheroOperaciones));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            // SE ASIGNA LA LÍNEA A BORRAR SEGÚN EL ID INDICADO
            String lineToRemove = id+"\t";
            String currentLine;
            
            while((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                // SI LA LÍNEA EMPIEZA CON EL ID ESPECIFICADO, ENTONCES SE INSERTA UNA NUEVA LÍNEA
                if(trimmedLine.startsWith(lineToRemove)){
                    writer.write(id+"\t"+
                                 a+"\t"+
                                 b+"\t"+
                                 operacion+"\t"+
                                 obtenerResultado(operacion,a,b)+
                                 System.getProperty("line.separator"));
                }
                else{
                    writer.write(currentLine + System.getProperty("line.separator"));
                }                
            }
            writer.close();
            reader.close();
            ficheroOperaciones.delete();
            boolean successful = tempFile.renameTo(ficheroOperaciones);            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmOperacionesAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
