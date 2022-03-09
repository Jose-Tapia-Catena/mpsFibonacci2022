package org.jmtapia;

/**
 * Class providing a method to compute fibonacci sucesion
 *
 * @author Jose M. Tapia
 */

public class Fibonacci {
    public int compute (int value) {
        int a = 0;
        int b = 1;

        //si valor es 0, es otro caso base que sabemos que el resultado = 0
        if (value < 0) {
            throw new RuntimeException("The values cannot be a negative number: " + value);
        } else {
            for (int i = 0; i <value; i++) {
                b = b + a;
                a = b - a;
            }
        }
        return a;
    }
}
