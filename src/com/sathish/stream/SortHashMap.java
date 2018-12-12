package com.sathish.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * 
 * @author Sathish
 *
 */
public class SortHashMap {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("x", 20);
		unsortedMap.put("m", 7);
		unsortedMap.put("a", 8);
		unsortedMap.put("k", 2);
		unsortedMap.put("d", 10);
		 System.out.println("Original Map : " + unsortedMap);

        // sort by keys
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        Map<String, Integer> result = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                 (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted by keys : " + result);
        
        //sort by value
        //sort by values, and reserve it, 10,9,8,7,6...
        Map<String, Integer> result1 = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                 (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted by value : " + result1);

	}

}
