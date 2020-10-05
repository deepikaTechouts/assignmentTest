package com.techouts.assign.array.middlepartQues;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class ArrayDuplicateUsingMap {

	private static void findDuplicatesUsingHashMap(int[] inputArray)
	{
	    HashMap<Integer, Integer> map = new HashMap<>();
	         
	    for (int element : inputArray) 
	    {   
	        if(map.get(element) == null)
	        {
	            map.put(element, 1);
	        }
	        else
	        {
	            map.put(element, map.get(element)+1);
	        }
	    }
	         
	    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	         
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() > 1)
	        {
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        }
	    }
	}
	

	
	
	
	public static void main(String[] args) {

	
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] inputArray1 = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	    	  inputArray1[i] = sc.nextInt();
	      }
	      ArrayDuplicateUsingMap.findDuplicatesUsingHashMap(inputArray1);
	
	
	
	
	
	
	
	
	
	
	}

}












