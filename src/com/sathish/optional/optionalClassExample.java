package com.sathish.optional;

import java.util.Optional;

/**
 * 
 * @author Sathish
 *
 */
public class optionalClassExample {

	public static void main(String[] args) {
		String[] str = new String[10];   
 //before java8
/*		//Getting the substring
        String str2 = str[9].substring(2, 5);
        //Displaying substring
        System.out.print(str2);  
*/
		Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str[9] = "AbcdEf";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }    
	   }  
}

