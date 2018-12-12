package com.sathish.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * 
 * @author Sathish
 *
 */
public class ConvertArrayToStream {

	public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5,6};
		String[] strArray = {"a", "b", "c", "d", "e"};

        //1. Arrays.stream
        Stream<String> stream1 = Arrays.stream(strArray);
        stream1.forEach(x -> System.out.println(x));

        //2. Stream.of
        Stream<String> stream2 = Stream.of(strArray);
        stream2.forEach(x -> System.out.println(x));

        System.out.println("Converting int array to stream");
        
        // 1. Arrays.stream -> IntStream 
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));

        // 2. Stream.of -> Stream<int[]>
        Stream<int[]> temp = Stream.of(intArray);

        // Cant print Stream<int[]> directly, convert / flat it to IntStream 
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));
	}

}
