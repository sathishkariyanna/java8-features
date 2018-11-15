package com.sathish;

import java.util.Arrays;

/**
 * 
 * @author Sathish
 *
 */
public class ParallelSortExample {
	public static void main(String[] args) {
		int numbers[] = {11, 45, 2, 16, 13, 3};
		//Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);
		//converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(p->System.out.print(p+" "));
	    }
}
