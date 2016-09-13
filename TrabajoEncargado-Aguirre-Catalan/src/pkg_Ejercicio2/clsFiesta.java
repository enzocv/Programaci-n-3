
package pkg_Ejercicio2;

public class clsFiesta {
    //VARIABLES
    int edad, asistieron, nHombres = 0, nMujeres = 0, edadMasJoven = 0;
    String sexo;
    double promEdadHombres, promEdadMujeres;
    String arrayAsistentes[][] = new String[100][2];
    
    
    public clsFiesta(){}
    
    public void guardarDatosEnArray(int edad, String sexo, int fila){
       arrayAsistentes[fila][0] = sexo;
       arrayAsistentes[fila][1] = String.valueOf(edad);
              
    }
    
    //NUMERO DE PERSONAS QUE ASISTIERON A LA FIESTA
    public int npersonasAsistentes(){
        return arrayAsistentes.length;
    }
    
    //CANTIDAD DE HOMBRE Y DE MUJERES
    public void cantidadHombresMujeres(){
        for (int i = 0; i < npersonasAsistentes(); i++) {//FILA
            if (arrayAsistentes[i][0].equals("Hombre")) {
                nHombres++;
            }
            else{nMujeres++;}
        }
        
    }
    
    public void promEdades(){
        promEdadHombres = sumaValoresArray() / nHombres;
        promEdadMujeres = sumaValoresArray() / nMujeres;
    }
    public int sumaValoresArray(){
        int total = 0;
        edadMasJoven = Integer.parseInt(arrayAsistentes[0][1]);
        for (int i = 0; i < npersonasAsistentes(); i++) {//FILA
            for (int j = 0; j < arrayAsistentes[0].length; j++) {//COLUMNA
                total += Integer.parseInt(arrayAsistentes[i][1]);
                if (edadMasJoven > Integer.parseInt(arrayAsistentes[i+1][1])) {
                    edadMasJoven = Integer.parseInt(arrayAsistentes[i+1][1]);
                }
            }
        }
        return total;
    }
}
