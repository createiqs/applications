package com.createiq.java8.streams.excercises.foreach;

import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopAMap {

	public static void loopMapClassic() {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}

	}

	public static void loopMapJava8() {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);

		// lambda
		if (map != null) {
			map.forEach((k, v) -> {
				if (k != null) {
					System.out.println("Key : " + k + ", Value : " + v);
				}

			});
		}

	}

	public static void main(String[] args) {
		// loopMapClassic();
		loopMapJava8();
	}

}
