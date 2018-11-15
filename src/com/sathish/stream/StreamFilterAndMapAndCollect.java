package com.sathish.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sathish.Person;
/**
 * 
 * @author Sathish
 *
 */
public class StreamFilterAndMapAndCollect {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(
				new Person("Sathish", 32), 
				new Person("Kariyanna", 30),
				new Person("Tom", 40), 
				new Person("Mike", 35));

		//find the person where the name is Sathish
		for(Person person : personList) {
			if(person.equals("Sathish")) {
				System.out.println("name :" + person.getName());
			}
		}
		//loop all the persons by name
		for(Person person : personList) {
			System.out.println(person.getName());
		}
		
		//java8
		System.out.println("***************Java8**************************");
		String name= personList.stream()					// Convert to steam
				.filter(p->"Sathish".equals(p.getName()))	// we want "Sathish" only
				.map(Person::getName)						//convert stream to String by using method reference
				//.map(p-> p.getName())						//convert stream to String by using lambda 
				.findAny()									// If 'findAny' then return found
				.orElse(null);								// If not found, return null
		
		System.out.println("name : " + name);
		
		List<String> names =personList.stream()
							.map(Person::getName) //:: (method reference) operator as shorthand for lambdas calling a specific method – by name
							.collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
