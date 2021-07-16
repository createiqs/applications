package com.createiq.java8.streams.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGetListOfEmployees {

	public static void main(String[] args) {
		List<Employee> employeesList = getListOfEmployees();
		// Map<String, Integer> empMap = new HashMap<>();
		// for (Employee employee : employeesList) {
		// empMap.put(employee.getName(), employee.getAge());
		// }

		Map<String, Integer> empMap = employeesList.stream()
				.collect(Collectors.toMap(Employee::getName, Employee::getAge, (oldValue, newValue) -> oldValue+newValue));
		
		
		
		System.out.println(empMap);
		// Write stream code here
	}

	public static List<Employee> getListOfEmployees() {

		List<Employee> listOfEmployees = new ArrayList<>();

		Employee e1 = new Employee("Mohan", 24, Arrays.asList("Newyork", "Banglore"));
		Employee e2 = new Employee("John", 27, Arrays.asList("Paris", "London"));
		Employee e3 = new Employee("Vaibhav", 32, Arrays.asList("Pune", "Seattle"));
		Employee e4 = new Employee("Amit", 22, Arrays.asList("Chennai", "Hyderabad"));
		Employee e5 = new Employee("Balaji", 29, Arrays.asList("Hyderabad", "Banglore"));
		Employee e6 = new Employee("Balaji", 29, Arrays.asList("Hyderabad", "Banglore"));

		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		listOfEmployees.add(e5);
		listOfEmployees.add(e6);

		return listOfEmployees;
	}
}