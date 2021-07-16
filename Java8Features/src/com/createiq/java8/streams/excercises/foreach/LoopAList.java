package com.createiq.java8.streams.excercises.foreach;

import java.util.ArrayList;
import java.util.List;

public class LoopAList {

	public static void loopListClassic() {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// normal loop
		for (String l : list) {
			System.out.println(l);
		}
	}

	public static void loopListJava8() {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// lambda
		 list.forEach(x -> System.out.println(x));

		// method reference
		// list.forEach(System.out::println);
	}

}
