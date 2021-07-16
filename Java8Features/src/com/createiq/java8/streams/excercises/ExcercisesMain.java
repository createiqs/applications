package com.createiq.java8.streams.excercises;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ExcercisesMain {

	List<Employee> employeesList = StreamGetListOfEmployees.getListOfEmployees();

	// Given a list of employees, you need to find all the employees whose age is
	// greater than 30 and print the employee names.(Java 8 APIs only)

	public void exercise1() {
		List<String> employeeFilteredList = employeesList.stream().filter(e -> e.getAge() > 30).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(employeeFilteredList);
	}

	// Given the list of employees, find the count of employees with age greater
	// than 25?
	public void exercise2() {
		Long count = employeesList.stream().filter(e -> e.getAge() > 25).count();
		System.out.println("Count : " + count);
	}

	// Given the list of employees, find the employee whose name is John.
	public void exercise3() {
		Optional<Employee> e1 = employeesList.stream().filter(e -> e.getName().equalsIgnoreCase("John")).findAny();
		if (e1.isPresent()) {
			System.out.println("Employee : " + e1.get());
		}
	}

	// Given a list of employees, You need to find highest age of employee?
	public void exercise4() {
		OptionalInt max = employeesList.stream().mapToInt(Employee::getAge).max();
		if (max.isPresent())
			System.out.println("Maximum age of Employee: " + max.getAsInt());
	}

	// Given a list of employees, you need sort employee list by age? Use java 8
	// APIs only
	public void exercise5() {
		List<Employee> sortedList = employeesList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge())
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);

	}

	// Given the list of Employees, you need to join the all employee names with
	// ","?
	public void exercise6() {
           List<String> employeeNames = employeesList.stream().map(e -> e.getName()).collect(Collectors.toList());
           String employeeNamesStr = String.join(",", employeeNames);
           System.out.println(employeeNamesStr);
	}

	// Given the list of employees, you need to group them by name
	public void exercise7() {
		Map<String, List<Employee>> map = employeesList.stream()
				                              .collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name,employeeListTemp)->System.out.println("Name: "+name+" ==>"+employeeListTemp));
	}

	public static void main(String[] args) {
		ExcercisesMain excercisesMain = new ExcercisesMain();
		excercisesMain.exercise7();
	}

}
