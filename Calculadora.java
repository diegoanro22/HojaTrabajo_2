/* Universidad del Valle de Guatemala
 * Genser Catalan - 23401
 * Diego Rosales - 23258
*/

import java.io.IOException;
import java.util.ArrayList;

public class Calculadora implements iCalculadora{
    private Archivo archivoTxt;
    private CustomStack<Double> stack = new CustomStack<>();

public Calculadora(){
    archivoTxt = new Archivo("datos.txt");
}


    /**
     * Metodo para verificar el operador en el archivo
     */
    public void prefix() {
        try {
            ArrayList<String> listPosfix = archivoTxt.leerArchivo();     
            for (String linea : listPosfix) {
                if (linea.matches("-?\\d+(\\.\\d+)?")){
                    double num = Double.parseDouble(linea);
                    stack.push(num);
                }else{
                    switch (linea) {
                        case "+":
                            sumar();
                            break;
                        case "-":
                            restar();
                            break;
                        case "*":
                            multiplicar();
                            break;
                        case "/":
                            dividir();
                            break;
                    }
                }
            }
            stack.top();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se ha encontrado el archivo");
        }
    }


/**
 * Metodo para sumar
 */
public void sumar(){
    double a = stack.pop();
    double b = stack.pop();
    stack.push(b + a);
}

/**
 * Metodo para restar
 */
public void restar(){
    double a = stack.pop();
    double b = stack.pop();
    stack.push(b - a);
}

/**
 * Metodo para multiplicar
 */
public void multiplicar(){
    double a = stack.pop();
    double b = stack.pop();
    stack.push(b * a);
}

/**
 * Metodo para dividir
 */
public void dividir(){
    double a = stack.pop();
    double b = stack.pop();
    stack.push(b / a);
}












}
