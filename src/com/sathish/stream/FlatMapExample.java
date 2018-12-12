package com.sathish.stream;

import java.util.Arrays;
import java.util.stream.Stream;
/**
 * 
 * @author Sathish
 *
 */
public class FlatMapExample {
	//flatMap() method allows avoiding nested Stream<Stream<R>> structure.
	
	public static void main(String[] args) {
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"},{"g", "h"}};

        //Stream<String[]>
        Stream<String[]> streamOfStringArray = Arrays.stream(data);

        //Stream<String>
        Stream<String> stringStream = streamOfStringArray.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> !"e".equals(x.toString()));

        stream.forEach(System.out::println);

	}

}
