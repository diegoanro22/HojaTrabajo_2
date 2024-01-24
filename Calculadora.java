/* Universidad del Valle de Guatemala
 * Genser Catalan - 23401
 * Diego Rosales - 23258
*/

import java.io.IOException;
import java.util.ArrayList;

public class Calculadora {
    private Archivo archivoTxt;
    private CustomStack<Double> stack = new CustomStack<>();

public Calculadora(){
    archivoTxt = new Archivo("archivo.txt");
}


    public void prefix() {
        try {
            ArrayList<String> listPosfix = archivoTxt.leerArchivo();     
            System.out.println(listPosfix);       
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
            stack.printStackState();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se ha encontrado el archivo");
        }
    }


public void sumar(){
    double a = stack.pop();
    double b = stack.pop();
    stack.push(b + a);
}
public void restar(){
}
public void multiplicar(){
}
public void dividir(){
}












}
