package com.sathish;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Sathish
 *
 */
public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("Sathish", 32), 
				new Student("Kariyanna", 30),
				new Student("Tom", 40), 
				new Student("Mike", 35));
		
		System.out.println(" list --> Before soft : " + studentList);
		
		System.out.println(" Before java8 " + studentList);
		//sort by name
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println(" List --> After soft by name: " + studentList);
		
		//sort by age
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}			
		});
		System.out.println(" List --> After soft by age: " + studentList);
		
		//sort using java8
		System.out.println("************** Sorting using lambda **************");
		System.out.println("*************Sort by name ************** ");
		studentList.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		studentList.forEach(p->System.out.println(p));
		
		System.out.println("************** Sort by age **************");
		studentList.sort((o1,o2) -> o1.getAge()-o2.getAge());
		studentList.forEach(p->System.out.println(p));
		
		System.out.println("************** Sort by age in reversed order**************");
		Comparator<Student> ageComparator = (o1,o2)->o1.getAge()-o2.getAge();
		studentList.sort(ageComparator.reversed());
		studentList.forEach(p->System.out.println(p));		
	}
}
