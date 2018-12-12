package com.sathish.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Sathish
 *
 */
public class FileOperationExample {
	//c://lines.txt – A simple text file for testing
	//line1
	//line2 ...10
	
	public static void main(String[] args) {
		String fileName ="c://lines.txt";
		List<String> list = new ArrayList<>();
		
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("read the file and store it into list");
		try(Stream<String> stream1 = Files.lines(Paths.get(fileName))){
			list = stream1.collect(Collectors.toList());
			list.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("BufferedReader example");
		try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
			list = br.lines().collect(Collectors.toList());
					list.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
