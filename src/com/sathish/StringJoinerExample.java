package com.sathish;

import java.util.StringJoiner;
/**
 * 
 * @author Sathish
 *
 */
public class StringJoinerExample {

	public static void main(String[] args) {
		//Joining strings by specifying delimiter
		StringJoiner mystring = new StringJoiner("-");
		mystring.add("Sony");  
		mystring.add("Nagendrappa");
		
		System.out.println("String joiner with - as delimeter " + mystring );

		//Adding prefix and suffix to the output String
		StringJoiner mystring1 = new StringJoiner("-", "(", ")");
		mystring1.add("Sathish");  
		mystring1.add("Kariyanna");
		
		System.out.println("String joiner with delimeter, prefix and suffix " + mystring1 );
		
		//Merging two StringJoiner objects
		//when we call merge, it will take only one prefix and suffix
		StringJoiner mergeString = mystring1.merge(mystring);
		System.out.println("String joiner merge " + mergeString );
		
		//string length
	    int length = mergeString.length();  
	    System.out.println("Length of the StringJoiner: "+length); 
		
	}

}
