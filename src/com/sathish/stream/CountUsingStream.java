package com.sathish.stream;

import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Sathish
 *
 */
public class CountUsingStream {
	public static void main(String[] args) {
		int count =0;
		List<String> nameList = Arrays.asList("Sathish","Kariyanna","Sam","Sony");
		//before java8
		for(String name : nameList) {
			if(name.length() < 6) {
				count++;
			}
		}
		System.out.println("number of names which are length less than six chars : " + count);
		
		//java8
		long count1 = nameList.stream().filter(str -> str.length() < 6).count();
		System.out.println("Count by using stream :" + count1);
	}

}
