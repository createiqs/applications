package com.createiq.java8.streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("London 1", "London 2","HongKong", "Paris", "NewYork","London 3");
		cities.stream().filter(s -> s.startsWith("P")).forEach(System.out::println);
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
	}

}
