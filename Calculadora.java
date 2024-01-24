/* Universidad del Valle de Guatemala
 * Genser Catalan - 23401
 * Diego Rosales - 23258
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Stack;

public class Calculadora {
    private String archivo = "archivo.txt";

    /**Metodo para leer el archivo .txt
     * @param archivo
     */
    public void lector_txt(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(archivo)))) {
            String expresion = br.readLine();
            if (expresion != null) {
                int resultado = operadorExpresion(expresion);
                System.out.println("Resultado: " + resultado);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se ha encontrado el archivo");
        }
    }

    /**Metodo para operar sumas, restas, division, multiplicacion
     * @param expresion
     * @return
     */
    public int operadorExpresion(String expresion) {
        Stack<Integer> pila = new Stack<>();

        String[] elementos = expresion.split("\\s+"); 
        for (String elemento : elementos) {
            if (elemento.matches("\\d+")) {
                // Si es un número, lo apila en la pila
                pila.push(Integer.parseInt(elemento));
            } else {
                int operand2 = pila.pop();
                int operand1 = pila.pop();

                switch (elemento) {
                    case "+":
                        pila.push(operand1 + operand2);
                        break;
                    case "-":
                        pila.push(operand1 - operand2);
                        break;
                    case "*":
                        pila.push(operand1 * operand2);
                        break;
                    case "/":
                        pila.push(operand1 / operand2);
                        break;

                    default:
                        throw new IllegalArgumentException("Operador no válido: " + elemento);
                }
            }
        }

        //Verifica si la pila esta vacia o llena
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            throw new IllegalArgumentException("Expresión no válida");
        }
    }

}
