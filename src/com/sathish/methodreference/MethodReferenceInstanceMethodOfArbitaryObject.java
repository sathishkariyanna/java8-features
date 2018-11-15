package com.sathish.methodreference;

import java.util.Arrays;
/**
 * 
 * @author Sathish
 *
 */
//Method reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceInstanceMethodOfArbitaryObject {
	 public static void main(String[] args) {  
			String[] stringArray = { "Sathish", "Kariyanna", "Sam", "Tom", "Mike"};
			
			Arrays.sort(stringArray, String::compareToIgnoreCase);
			for(String str: stringArray){
				System.out.println(str);
			}
		   }  
}
