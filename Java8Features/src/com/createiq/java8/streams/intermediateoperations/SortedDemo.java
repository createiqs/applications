package com.createiq.java8.streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {
public static void main(String[] args) {
	List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
	
	System.out.println("Before Sorting : ");
	cities.forEach(System.out::println);
	System.out.println("After Sorting :With ASC ");
	cities.stream().sorted().forEach(System.out::println);
	
	System.out.println("After Sorting :With DESC ");
	cities.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
}
}
