/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    // Verifica que se puedan agregar y quitar valores correctamente de la pila.
    @Test
    public void testPushAndPop() {
        CustomStack<Double> stack = new CustomStack<>();
        stack.push(5.0);
        stack.push(3.0);
        assertEquals(3.0, stack.pop(), 0.0001);
        assertEquals(5.0, stack.pop(), 0.0001);
    }

    // Verifica que la operación de suma funcione correctamente en la pila.
    @Test
    public void testSumar() {
        CustomStack<Double> stack = new CustomStack<>();
        stack.push(5.0);
        stack.push(3.0);
        stack.push(stack.pop() + stack.pop());
        assertEquals(8.0, stack.pop(), 0.0001);
    }

    // Verifica que la operación de resta funcione correctamente en la pila.
    @Test
    public void testRestar() {
        CustomStack<Double> stack = new CustomStack<>();
        stack.push(5.0);
        stack.push(3.0);
        double b = stack.pop();
        double a = stack.pop();
        stack.push(a - b);
        assertEquals(2.0, stack.pop(), 0.0001);
    }

    // Verifica que la operación de multiplicación funcione correctamente en la pila.
    @Test
    public void testMultiplicar() {
        CustomStack<Double> stack = new CustomStack<>();
        stack.push(5.0);
        stack.push(3.0);
        stack.push(stack.pop() * stack.pop());
        assertEquals(15.0, stack.pop(), 0.0001);
    }

    // Verifica que la operación de división funcione correctamente en la pila.
    @Test
    public void testDividir() {
        CustomStack<Double> stack = new CustomStack<>();
        stack.push(6.0);
        stack.push(3.0);
        double divisor = stack.pop();
        double dividendo = stack.pop();
        stack.push(dividendo / divisor);
        assertEquals(2.0, stack.pop(), 0.0001);
    }
}
