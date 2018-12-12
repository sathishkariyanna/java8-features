package com.sathish.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sathish.Person;
import com.sathish.Student;
/**
 * 
 * @author Sathish
 *
 */
public class StreamFilterMapReduceAndCollect {

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
		
		//map one object to an other class (get the data from person and assign to student)
		List<Student> studentList = personList.stream()
										.map(person-> {
			Student student = new Student();
			student.setName(person.getName());
			student.setAge(person.getAge());
			return student;
			}).collect(Collectors.toList());
		System.out.println("Student list : " + studentList);
		
		List<String> names =personList.stream()
							.map(Person::getName) //:: (method reference) operator as shorthand for lambdas calling a specific method – by name
							.collect(Collectors.toList());
		names.forEach(System.out::println);
		
		//Stream reduce()
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
			
		Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
		if(intOptional.isPresent()) System.out.println("Multiplication from reduce= "+intOptional.get());
	}

}
