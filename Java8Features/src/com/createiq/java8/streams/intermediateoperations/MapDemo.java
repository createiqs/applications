package com.createiq.java8.streams.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// Example 1 - This is how you convert all elements of list into upper case in java8
		List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
		List<String> citiesUpperCase =cities.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Cities : "+cities);
		System.out.println("Cities Uppercase : "+citiesUpperCase);
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		//Example 2 - let's transform a List of integers to square each element
		
		
		List<Integer> squares = numbers.stream().map( i -> i*i).collect(Collectors.toList()); 
		System.out.println("original list of numbers : " + numbers); 
		System.out.println("transformed list of integers using Map in Java 8 : " + squares);
		
		//Example 3 - let's transform a List of integers to cube each element
	    List<Integer> cubes = numbers.stream().map(i -> i*i*i).collect(Collectors.toList());
	    System.out.println("Cubes : "+cubes);
	    
	    //Example 4 - let's transform a list of Strings to String and its length with - Separated of each element
	    List<String> citiesWithLength = cities.stream().map(str -> str +" - "+str.length()).collect(Collectors.toList());
	    System.out.println("Cites with length : "+citiesWithLength);
	    
	    
	    //Example 5 -  let's transform a list of Strings to length of each element
	    
	    List<Integer> citiesLength = cities.stream().map(String::length).collect(Collectors.toList());
	    System.out.println("Citeis Length : "+citiesLength);
	    
	}

}
