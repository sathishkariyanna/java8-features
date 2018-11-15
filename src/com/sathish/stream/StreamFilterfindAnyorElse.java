package com.sathish.stream;

import java.util.Arrays;
import java.util.List;

import com.sathish.Person;
/**
 * 
 * @author Sathish
 *
 */
public class StreamFilterfindAnyorElse {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Sathish", 32), 
				new Person("Kariyanna", 30),
				new Person("Tom", 40), 
				new Person("Mike", 35));
		//before java8
		Person person = getPersonsByName(personList, "Sathish");
		System.out.println(person);
		
		//in java8
		Person person1 = personList.stream()
				.filter(p->"Sathish".equals(p.getName()) && 32 == p.getAge())
				.findAny()
				.orElse(null);
		
		System.out.println("person1 : " + person1);
		
		//or like this (option2)
		Person person2 = personList.stream()
				.filter(p-> { if("Sathish".equals(p.getName()) && 32 == p.getAge()) {
					return true;
				}
				return false;
				})
				.findAny()
				.orElse(null);
		System.out.println("option2, person2 : " + person2);
	}
	private static Person getPersonsByName(List<Person> persons, String name) {
		Person result = null;
		for(Person person : persons) {
			if(person.getName().equals("Sathish")) {
				result = person;
			}
		}
		return result;
	}

}
