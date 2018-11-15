package com.sathish.methodreference;
/**
 * 
 * @author Sathish
 *
 */
@FunctionalInterface 
interface MyInterface1{  
	Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}
//Method reference to a constructor
public class MethodReferenceToConstructor {
	public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface1 ref = Hello::new;  
        ref.display("Hello World!");  
    }  
}
