package org.jmtapia;

/**
 * Class providing a method to compute fibonacci sucesion
 *
 * @author Jose M. Tapia
 */

public class Fibonacci {
    public int compute (int value){
        int result = 0;
        //si valor es 0, es otro caso base que sabemos que el resultado = 0
        if (value < 0){
            throw new RuntimeException("The values cannot be a negative number: " + value);
        } else if (value == 1){ //caso base
            result = 1;
        } else if (value > 1){
            result = compute(value-2) + compute(value-1);
        }
        return result;
    }
}
