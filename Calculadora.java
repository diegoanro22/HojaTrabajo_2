/* Universidad del Valle de Guatemala
 * Genser Catalan - 23401
 * Diego Rosales - 23258
*/

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class Calculadora {
    private Archivo archivoTxt;

public Calculadora(){
    archivoTxt = new Archivo("archivo.txt");
}


    public void prefix() {
        try {
            ArrayList<String> listPosfix = archivoTxt.leerArchivo();     
            System.out.println(listPosfix);       
            for (String linea : listPosfix) {
                switch (linea) {
                    case "+":
                        System.out.println("s");
                        break;
                    case "-":
                        System.out.println("-");
                        break;
                    case "*":
                        System.out.println("-");
                        break;
                    case "/":
                        System.out.println("-");
                        break;
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se ha encontrado el archivo");
        }
    }


}
