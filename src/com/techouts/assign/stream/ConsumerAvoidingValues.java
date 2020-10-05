package com.techouts.assign.stream;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerAvoidingValues {

	public static void main(String[] args) {

		
		
		
		System.out.println("dodging values between 3 and 8");
		Consumer<Integer>consumer1=(Integer j)->
		{
			
			if(j<=3||j>=8)
			System.out.println(j) ;
		
		};
		
			
		
		                      consumer1.accept(1);
		              		consumer1.accept(2);
		              		consumer1.accept(3);
		              		consumer1.accept(4);
		              		consumer1.accept(5);
		              		consumer1.accept(6);
		              		consumer1.accept(7);
		              		consumer1.accept(8);
		              		consumer1.accept(9);
		              		consumer1.accept(10);
		  
		
		
		
			
		
		
		
		
		
	}

}
