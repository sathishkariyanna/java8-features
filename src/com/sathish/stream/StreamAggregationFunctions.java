package com.sathish.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.sathish.Person;
/**
 * 
 * @author Sathish
 *
 */
public class StreamAggregationFunctions {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Sathish", 32), 
				new Person("Kariyanna", 30),
				new Person("Tom", 40), 
				new Person("Mike", 35));
		//1. filter
		System.out.println("*********** FILTER *********");
		Stream<Person> p= personList.stream()
				.filter(str->str.getName().equals("Sathish"));
		
		p.forEach(str-> System.out.println(str));
		
		//2. map
		System.out.println("\n*********** map *********");
		// map
		personList.stream()
			.map(str-> str.getName())
			.forEach(System.out::println);
		//mapToInt
		personList.stream()
		.mapToInt(str -> str.getAge())
		.forEach(str -> System.out.print(str + "\t"));

		//we can also have  mapToLong() and mapToDouble()
		System.out.println("\n*********** SORT *********");
		//3. Sort
		personList.stream()
		.sorted().forEach(str -> System.out.println(str + " - " + str.getAge()));
		
		//sort using compareTo
		personList.stream()
		.sorted((str1,str2)->str1.getName().compareTo(str2.getName()))
				.forEach(System.out::print);
		
		//4. distinct
		System.out.println("\n*********** distinct *********");
		List<Integer> intList = Arrays.asList(10,20,10,23,45,20);
		intList.stream().distinct().forEach(i->System.out.print(i + " " ));
		
		//or we can also use like below
		//int[] numbers = {10,20,10,23,45,20};
		//Arrays.stream(numbers).distinct().forEach(i -> System.out.print(i + " "));
		
		//5. limt
		System.out.println("\n*********** limit *********");
		intList.stream().limit(3).forEach(i->System.out.print(i + " " ));
		
		//6. skip
		System.out.println("\n*********** skip *********");
		personList.stream()
	    .sorted()
	    .map(str -> str.getAge())
	    .skip(personList.size() - 1) //skip all except last one
	    .forEach(System.out::println);
	}

}
