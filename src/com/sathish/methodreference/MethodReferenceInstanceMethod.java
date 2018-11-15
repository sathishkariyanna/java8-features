package com.sathish.methodreference;
/**
 * 
 * @author Sathish
 *
 */
@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
//Method reference to an instance method of an object
public class MethodReferenceInstanceMethod {
	public void method1() {
		System.out.println("Instance method");
	}
	public static void main(String[] args) {
		MethodReferenceInstanceMethod obj = new MethodReferenceInstanceMethod();
		
		MyInterface ref = obj::method1;
		ref.display();
	}

}
