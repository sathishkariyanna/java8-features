package com.sathish.interfaces;
/**
 * 
 * @author Sathish
 *
 */
interface MyDeafultAndStaticInterface{
	
	//	default method, after java8
	default void myDefaultMethod() {
		System.out.println("My default method");
	}
	
	//static method, after java8
	static void myStaticMethod() {
		System.out.println("My static  method");
	}
	//abstract method, before and after java8
	void existingMethod();
	
	
}
public class DefaultAndStaticMethods implements MyDeafultAndStaticInterface{

	@Override
	public void existingMethod() {
		System.out.println("abstract method implementation in the implementation class");
		
	}

	public static void main(String[] args) {
		DefaultAndStaticMethods obj = new DefaultAndStaticMethods();
		
		//calling default method
		obj.myDefaultMethod(); //if the same default method present in two interfaces that we implement, then we need to override that default method.
		
		//calling existingMethod method, which is referring the implemented class
		obj.existingMethod();
		
		//calling static method
		MyDeafultAndStaticInterface.myStaticMethod();

	}

}
