package com.sathish.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;
/**
 * 
 * @author Sathish
 *
 */
public class SupplierToReuseStream {

	public static void main(String[] args) {
		String[] array = {"A", "B", "C", "D"};
/*
		Stream<String> stream = Arrays.stream(array);

        // loop a stream
        stream.forEach(x -> System.out.println(x));

        // try to reuse it to filter again! throws IllegalStateException
        long count = stream.filter(x -> "C".equals(x)).count();
        System.out.println(count);
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
*/        
        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        //get new stream
        streamSupplier.get().forEach(x -> System.out.println(x));

        //get another new stream
        long cCount = streamSupplier.get().filter(x -> "C".equals(x)).count();
        System.out.println(cCount);

	}

}
