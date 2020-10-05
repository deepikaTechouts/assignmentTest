package com.techouts.assign.stream;

import java.util.Arrays;
import java.util.function.Consumer;

public class UsingConsumerInterface {

	public static void main(String[] args) {

		int a[]=new int[] {9,3,5,2,8,-2,11,15,7,1};
		Arrays.parallelSort(a,1,4);
		for(int i:a)
			System.out.println(i);
		System.out.println("Double values are:");
		Consumer<Integer>consumer=(Integer i)->System.out.println(i+"  square value is  "+i*i);
		consumer.accept(1);
		consumer.accept(2);
		consumer.accept(3);
		consumer.accept(4);
		consumer.accept(5);
		consumer.accept(6);
		consumer.accept(7);
		consumer.accept(8);
		consumer.accept(9);
		consumer.accept(10);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
