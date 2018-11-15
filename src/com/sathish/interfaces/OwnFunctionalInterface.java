package com.sathish.interfaces;
/**
 * 
 * @author Sathish
 *
 */

@FunctionalInterface 
interface MyInterface{  
    int addNumbers(int x, int y);  
} 
public class OwnFunctionalInterface {

	public static void main(String[] args) {
		//lambda expression
		MyInterface sum = (x,y) -> x + y;
		System.out.println("Sum of two number : " + sum.addNumbers(10, 5));

	}

}
