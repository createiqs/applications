package com.createiq.java8.interfaces_defaultmethods.multiple_inheritance;
public interface MyInterface2{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str);  
} 