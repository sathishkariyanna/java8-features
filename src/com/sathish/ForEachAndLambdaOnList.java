package com.sathish;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Sathish
 *
 */
public class ForEachAndLambdaOnList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sathish");
		list.add("kariyanna");
		list.add("Sam");
		list.add("Tom");
		list.add("Mike");
		list.forEach(names -> System.out.println(names));
		
		// lambda expression with single parameter num
		//An interface with only single abstract method is called functional interface
    	MyFunctionalInterface f = num -> num+5;
        System.out.println("Lambda expresssion with functional interface : " + f.incrementByFive(22));
        
        //forEach method to iterate stream
        list.stream().filter(str->str.startsWith("S"))
        .forEach(System.out::println);
	}
}
@FunctionalInterface
interface MyFunctionalInterface {

	//A method with single parameter
    public int incrementByFive(int a);
}
