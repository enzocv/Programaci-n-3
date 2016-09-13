
package pkg_Ejercicio1;
//IMPORTACIONES DE LAS LIBRERIAS A UTILIZAR
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class clsOperaciones {
    //VARIABLES
    double a, b, resultado;
    String operacion = "";
    int id; //CONTADOR PARA EL ID DE CADA OPERACION GUARDADA EN EL FICHERO
    
    //ARCHIVO
    File ficheroOperaciones = new File("operaciones.txt");
    
    //CREACION DE ARRAY LIST DE DATOS (OBJETO)
    ArrayList<clsOperaciones> datosOperaciones = new ArrayList<clsOperaciones>();
    clsOperaciones objeto = null;
    
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
            
            //ID AUMENTA EN 1
//            id++;
            
            //CERRAMOS EL FLUJO
            escribirArchivo.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error al Insertar los datos!");
        }
    }
    
    //AGREGAR LOS DATOS DEL FICHERO AL OBJEETO (ARRAY LIST)
    public void ficheroAObjeto(){
        try {
            //VARIBLE QUE TENDRA LINEA DE FICHERO
            String linea = null;
            
            //FLUJO DE LECTURA DE FICHERO
            BufferedReader leerFichero = new BufferedReader
                                            (new FileReader(ficheroOperaciones));
            
            //OBTENDREMOS TODAS LAS LINEAS DEL FICHERO
            while ((linea = leerFichero.readLine()) != null) {
                //SEPARAREMOS LOS DATOS POR CADA TABULACION ENCONTRADA EN LA VARIABLE LINEA
                StringTokenizer separadoPor = new StringTokenizer(linea,"\t");
                String id        = separadoPor.nextToken().trim();
                String a         = separadoPor.nextToken().trim();
                String b         = separadoPor.nextToken().trim();
                String operacion = separadoPor.nextToken().trim();
                String resultado = separadoPor.nextToken().trim();
                
                //CONVERSION DE LOS DATOS QUE SE NECESITAN
                int idOperacion = Integer.parseInt(id);
                double valorA = Double.parseDouble(a);
                double valorB = Double.parseDouble(b);
                double valorResultado = Double.parseDouble(resultado);
                
                //ASIGNACION DE LOS DATOS DEL FICHERO, A LA CLASE MEDIANTE EL CONSTRUCTOR POR PARAMETROS
                objeto = new clsOperaciones(idOperacion, valorA, valorB, operacion, valorResultado);
                
                //AGREGAMOS LOS DATOS SACADOS AL ARRAY LIST QUE USAREMOS PARA LA MANIPULACION DE LOS DATOS
                datosOperaciones.add(objeto);
            }
            
            //CIERRE DEL FLUJO DE LECTURA DEL FICHERO
            leerFichero.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error al agregar los datos del fichero al array list!");
        }
    }
    
    //ACTUALIZAR
    public void actualizarArray(){
        //LIMPIAR EL ARRAY LIST
        datosOperaciones.clear();
        
        //VOLVER A SACAR LOS DATOS DEL FICHERO
        ficheroAObjeto();
    }
    
    //MOSTRAR DATOS DEL FICHERO
    
    
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
