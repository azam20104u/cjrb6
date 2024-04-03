package com.azam.cjrb6.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Shubham", 30, 100, "Male", "Mechanical", 69),
				new Student("Hashma", 21, 101, "Female", "CS", 49),
				new Student("Ravi", 23, 99, "Male", "Civil",70),
				new Student("Faizal", 27, 110, "Male", "CS",50)
				);
		List<Student> filteredlist = list.stream()//convert collection into stream
					.filter(st->{return st.getScore()>=60;})//filter the student objects
					.collect(Collectors.toList());//collect filtered students as a collection
					//.forEach(System.out::println);//iterate filtered student
	}
}
