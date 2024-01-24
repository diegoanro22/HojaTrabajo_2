/*Universidad del Valle de Guatemala 
 *23 enero, 2024
 *Algoritmos y estructura de datos 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        int inicio = 1;
        calc.prefix();

        System.out.println("--------------------------------------");
        System.out.println("Bienvenido a la Calculadora Postfix");
        System.out.println("1. Iniciar programa");
        System.out.println("2. Terminar programa");
        int menuInicio = teclado.nextInt();
        System.out.println("--------------------------------------");

        while (inicio == 1) {
            
            switch (menuInicio) {
                case 1:
                    System.out.println("Empezemos :D");
                    calc.prefix();
                    inicio = 2;
                    break;

                case 2: 
                    System.out.println("Gracias por utilizar este programa");
                    inicio = 2;
            
                default:
                    inicio = 2;
                    break;
            }
            
        }


    }
}
