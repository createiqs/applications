package com.createiq.java8.streams.excercises.foreach;

import java.util.stream.Stream;

public class ForEachVsForEachOrdered {
	
	public static void main(String[] args) {
		
		
		
		Stream<String> stream =  Stream.of("a","b","c","d","e","f","g","h","i");
	    //stream.parallel().forEach(System.out::println);
	    
	    
	    stream.parallel().forEachOrdered(System.out::println);
	    
	}

}
