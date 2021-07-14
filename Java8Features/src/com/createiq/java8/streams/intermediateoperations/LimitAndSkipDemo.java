package com.createiq.java8.streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitAndSkipDemo {
	
	public static void main(String[] args) {
		//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		
		
		List<Integer> numbers = Arrays.asList(13, 20, 30, 4, 55, 6, 71, 87, 9); 
		
//		int min = numbers.get(0);
//		for (Integer ele : numbers) {
//			if(min>ele) {
//				min = ele;
//			}
//		}
		//System.out.println( numbers.stream().findFirst().get());
		Optional<Integer> optional =  numbers.stream().max(Integer::compareTo);
		
		if(optional.isPresent()) {
			System.out.println("Min : "+optional.get());
		}
		
		Long count =  numbers.stream().count();
		System.out.println(count);
		
		//numbers.stream().limit(5).forEach(System.out::println);
		
		//numbers.stream().skip(5).forEach(System.out::println);
	}
	
	
	
	

}
