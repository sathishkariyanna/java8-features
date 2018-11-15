package com.sathish;
/**
 * 
 * @author Sathish
 *
 */
public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Person another) {
	    return this.age - another.getAge();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
}