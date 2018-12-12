package com.sathish.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * 
 * @author Sathish
 *
 */
public class FilterOnHashMap {

	public static void main(String[] args) {
		Map<Integer, String> maps = new HashMap<>();
		maps.put(20,"x");
		maps.put(7, "m");
		maps.put(8, "a");
		maps.put(2, "k");
		maps.put(10, "d");
		System.out.println("Original Map : " + maps);
		
		 //Map -> Stream -> Filter -> String
		String result = maps.entrySet().stream()
				.filter(map-> !"a".equals(map.getValue()))
				.map(map->map.getValue())
				.collect(Collectors.joining());
		
		System.out.println("map values after filter : " + result);
		
		 //Map -> Stream -> Filter -> Map
		 Map<Integer, String> resultMap = maps.entrySet().stream()
				.filter(map-> !"a".equals(map.getValue()))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		 
		System.out.println("map values after filter : " + resultMap);

	}

}
