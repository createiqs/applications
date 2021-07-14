package com.createiq.java8.streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
	
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork","London", "HongKong");
		List<String> distinctCities = cities.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctCities);
		
	}

}
