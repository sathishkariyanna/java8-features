package com.sathish;
/**
 * 
 * @author Sathish
 *
 */
public class StringToStreamChar {

	public static void main(String[] args) {
		String name = "sathish";
		//before java8
        char[] nameInCharArray = name.toCharArray();
        for (char temp : nameInCharArray) {
            System.out.println(temp);
        }
        
        //java8
        System.out.println("String to stream char using java8");
        name.chars() //IntStream
        .mapToObj(x -> (char) x)//Stream<Character>
        .forEach(System.out::println);

	}

}
