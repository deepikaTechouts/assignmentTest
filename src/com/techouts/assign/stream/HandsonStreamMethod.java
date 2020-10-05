package com.techouts.assign.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandsonStreamMethod {

	public static void main(String[] args) {
		

		System.out.println("........using ParallelSort...........");
		int a[]=new int[] {9,3,5,2,8,-2,11,15,7,1};
		System.out.println("Sorting values using Parallel Sort is:  ");
		Arrays.parallelSort(a);
		for(int i:a)
			System.out.println(i);
		
		System.out.println("Sorting values using Parallel Sort with specified indexes(1 to 4) is:  ");
		Arrays.parallelSort(a,1,4);
		for(int i:a)
			System.out.println(i);
		
		
		
		/*String str[]= {"this","is","String","joiner","example"};
		StringJoiner joiner=new StringJoiner("_","{","}");*/
		
		
		
		
		
		System.out.println("........using StringJoiner...........");
		StringJoiner joiner1=new StringJoiner(".....","{","}");
		joiner1.add("Techouts");
		joiner1.add("India's");
		joiner1.add("private");
		joiner1.add("Limitted");
		System.out.println(joiner1);
		
		
		
		
		System.out.println("........using optional...........");
		List<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		Stream<Integer>s=li.stream();
		Optional<Integer>o=s.min((x,y)->
		x.compareTo(y));
		System.out.println("Minimum value is:"+o.get());
		Stream<Integer>s1=li.stream();
		Optional<Integer>o1=s1.max((x,y)->
		x.compareTo(y));
		System.out.println("Maximum value is:"+o1.get());
		
			
		
		
		System.out.println("........using colllector class...........");
		List<String>li1=new ArrayList<>();
		li1.add("serena");
		li1.add("blair");
		li1.add("nate");
		li1.add("derek");
		li1.add("sabrina");
		Stream<String>s2=li1.stream();
		
		System.out.println("Again converting into Collection objects:");
		List<String>li2=s2.collect(Collectors.toList());
		System.out.println(li2);
		
		
		
	}

}
