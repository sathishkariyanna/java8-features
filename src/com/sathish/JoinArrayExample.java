package com.sathish;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author Sathish
 *
 */
public class JoinArrayExample {

	public static void main(String[] args) {
		String[] str1 = new String[]{"a", "b", "c"};
        String[] str2 = new String[]{"d", "e"};
        String[] str3 = new String[]{"f"};
        
        int [] int1 = new int[]{1,2,3,4};
        int[] int2 = new int[]{5,6,7};

		//join object type array
        String[] result = Stream.of(str1, str2, str3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println(Arrays.toString(result));

		//join primitive type array
        int[] result2 = IntStream.concat(Arrays.stream(int1), Arrays.stream(int2)).toArray();
        System.out.println(Arrays.toString(result2));
	}

}
