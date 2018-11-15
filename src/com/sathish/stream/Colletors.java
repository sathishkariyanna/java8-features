package com.sathish.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.sathish.Person;
/**
 * 
 * @author Sathish
 *
 */
public class Colletors {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Sathish", 32), 
				new Person("Kariyanna", 30),
				new Person("Tom", 40), 
				new Person("Mike", 35));
		
		List<String> names = Arrays.asList("Sathish","Kariyanna","Sathish");
		
		//groupingBy and counting
		Map<String,Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		//Java Collectors Example – Getting the average age 
		Double avgAge = personList.stream()				
				.collect(Collectors.averagingInt(p -> p.getAge()));
		System.out.println("Average age of persons from the list : " + avgAge);
		
		//fetching data as List
		List<String> nameList= personList.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		System.out.println("name list : " + nameList);
		
		//Collecting Data as Set
		Set<Person> personSet = personList.stream()
		.filter(p-> p.getAge() > 33).collect(Collectors.toSet());
		for(Person person : personSet) {
			System.out.println(person.getName() + "\t " + person.getAge());
		}
	}

}
