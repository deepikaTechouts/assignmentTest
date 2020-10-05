package com.techouts.assign.onetomany;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {

	public static void main(String[] args) {
List<String>li=new ArrayList<>();
li.add("serena");
li.add("vander");
li.add("woodsen");
li.add("blair");
li.add("waldrof");

		Iterator itr=li.iterator();
		System.out.println("using iterator........\n");
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		ListIterator itr1=li.listIterator();
		System.out.println("using listIterator........\n");
		while(itr1.hasNext())
		{
		System.out.println(itr1.next());	
			
		}
		
		
		
		
		
		
		
		
		
	}

}
