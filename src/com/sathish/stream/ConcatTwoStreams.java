package com.sathish.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoStreams {

	public static void main(String[] args) {
		List<String> nameList1 = Arrays.asList("Sathish","Kariyann");
		List<String> nameList2 = Arrays.asList("Sony","Nagendrappa");
		List<String> nameListFinal = new ArrayList<>();
		
		//before java8
		nameListFinal.addAll(nameList1);
		nameListFinal.addAll(nameList2);
		System.out.println("concatenated list " + nameListFinal);

		//using java8
		
		Stream<String> allNames = Stream.concat(nameList1.stream(), nameList2.stream());
		allNames.forEach(str ->System.out.print(str + " "));
	}

}
