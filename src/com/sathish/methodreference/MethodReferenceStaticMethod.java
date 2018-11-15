package com.sathish.methodreference;

import java.util.function.BiFunction;
/**
 * 
 * @author Sathish
 *
 */
class Addition{
	public static int add(int x, int y) {
		return x + y;
	}
}
//Method reference to a static method of a class
public class MethodReferenceStaticMethod {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> addition = Addition::add;
		int total = addition.apply(10, 5);
		System.out.println("Addition of 10 + 5 = " + total);
	}

}
