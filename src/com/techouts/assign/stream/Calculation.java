package com.techouts.assign.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculation {

	public static void main(String[] args) {
ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(80);
		al.add(30);
		al.add(45);
	System.out.println("arraylist element are:    "+""+al);
	Stream<Integer>s=al.stream();
		IntSummaryStatistics i=s.collect(Collectors.summarizingInt(x->x));
		System.out.println(i);
		
	}

}
