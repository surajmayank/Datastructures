package com.java.lamdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapMain {
 
	public static void main(String args[])
	{
		List<Student> listOfStudents = createListOfStudents();
		
		// Using map function to convert Stream<Student> to Stream<String>
		List<String> listOfStudentNames=listOfStudents.stream()
										.map(s -> s.getName()) 
										.collect(Collectors.toList());

		List<Student> listOfStudentAgres=listOfStudents.stream()
				.filter(s -> s.getAge()>20)
				.collect(Collectors.toList());

		listOfStudentNames.forEach(System.out::println);
		listOfStudentAgres.forEach(s -> System.out.println(s.getName()+ " " +s.getAge()));
	}		
	
	public static List<Student> createListOfStudents()
	{
		List<Student> listOfStudents=new ArrayList<>();
		Student s1= new Student("Anchit",20);
		Student s2= new Student("Peter",19);
		Student s3= new Student("Martin",22);
		Student s4= new Student("Sam",21);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		return listOfStudents;
	}
}
 