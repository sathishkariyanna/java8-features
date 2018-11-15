package com.sathish.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 * 
 * @author Sathish
 *
 */
public class ParallelStreamExample {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);
		System.out.println(myList);

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		//we can also use
		//Stream<Integer> sequentialStream = Stream.of(1,2,3,4);

		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		Stream<Integer> highNumbers = parallelStream.filter(p -> p > 80);

		// using lambda in forEach
		highNumbers.forEach(p -> System.out.println("Parallel high numbers" + p));
		
		
		Stream<Integer> highNumberSeq = sequentialStream.filter(p -> p > 80);
		highNumberSeq.forEach(p -> System.out.println("Sequential high numbers : " + p));
		
		/*
		 * If you run this on single CPU system, you will get less sequential processing time than parallel
		 * parallel processing needs multiple CPU's 
		 */		
	}
}
