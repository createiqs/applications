package com.createiq.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {
	
	public static void main(String[] args) {
		
		//Empty Stream
		Stream emptyStream = Stream.empty();
		
		
		//Collection Stream
		
		List<String> stringList=Arrays.asList("Andy","Peter","Amy","Mary");
		stringList.stream()
		.map((s)->s.toUpperCase())
		.forEach(System.out::println);
		
		
		//Stream.of
		
		Stream streamArray =Stream.of("X","Y","Z");
		
		
		//Stream.generate()
		
		Stream<Integer> intStream=Stream.generate(() -> 1).limit(5);
		intStream.forEach(System.out::println);

		
		//Stream.iterate()
		
		Stream<Integer> intItrStream = Stream.iterate(100 , n -> n+1).limit(5);
		intItrStream.forEach(System.out::println);


	}

}
