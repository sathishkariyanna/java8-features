package com.sathish.interfaces;

import java.util.function.IntBinaryOperator;
/**
 * 
 * @author Sathish
 *
 */
public class PreDefinedFunctionalInterface {

	public static void main(String args[]) {
        // lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(10, 5));

    }
}
