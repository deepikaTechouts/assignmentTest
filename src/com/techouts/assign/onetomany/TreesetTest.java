package com.techouts.assign.onetomany;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreesetTest {

	public static void main(String[] args) {

		Set<String>set1=new TreeSet<>();
		set1.add("RAHUL");
		set1.add("VIMAL");
		set1.add("ADITYA");
		set1.add("RAVI");
		System.out.println(set1);
		Stream<String>stream1=set1.stream();
		
		Set<String>set2=new TreeSet<>();
		set2.add("ravi");
		set2.add("rahul");
		set2.add("aditya");
		set2.add("vimal");
		System.out.println(set2);
		Stream<String>stream2=set2.stream();
		Stream<String>stream3=Stream.concat(stream1, stream2);
		System.out.println("\nafter concatenation\n ");
		stream3.forEach((x)->System.out.println(x));
		
		
		
	}

}
