package com.sathish;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Sathish
 *
 */
public class ForEachAndLambdaOnhashMap {

	public static void main(String[] args) {
		Map<Integer,String> animalMap = new HashMap<>();
		animalMap.put(1, "Horse");
		animalMap.put(2, "Lion");
		animalMap.put(3, "Monkey");
		animalMap.put(4, "Tiger");
		
		 //forEach to iterate and display each key and value pair of HashMap.
		 animalMap.forEach((key,value)-> System.out.println(key + "\t" + value));

		 //forEach to iterate a Map and display the value of a particular key
		animalMap.forEach((key,value) -> { if(key == 2)
			System.out.println("value associated with the key 2 is : " + value);			
		});
		//forEach to iterate a Map and display the key of a particular value
		animalMap.forEach((key,value) -> { if("Monkey".equals(value))
			System.out.println("Key associated with the value Monkey is : " + key);			
		});
	}

}
