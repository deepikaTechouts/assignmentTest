package com.techouts.assign.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorListIteratorMethods {

	public static void main(String[] args) {
System.out.println("........Iterator.........");
		Set<Integer>set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(13);
		set.add(43);
		set.add(56);
		set.add(80);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.println("only even numbers are:"+i);
			}
			else
				itr.remove();
				
		}
		
		
		
		
		/*List<Integer>list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(34);
		list.add(65);
		list.add(30);
		list.add(51);
		Iterator itr1=list.iterator();
		while(itr.hasNext())
		{
			
			Integer i=(Integer)itr1.next();
			if(i%5==0) {
				System.out.println("only multiple by 5 numbers are:"+i);
			}
			else if(i==34)
			{
			
				
			}
			else
				itr1.remove();
				
		}*/
		
		
		
		
		
		
		
		
		System.out.println("........ListIterator.........");
		List<String>list1=new LinkedList<>();
		list1.add("Dan");
		list1.add("Lily");
		list1.add("Maureen");
		list1.add("chuck");
		list1.add("rufus");
		ListIterator itr2=list1.listIterator();
		while(itr2.hasNext())
		{
		String str=(String)itr2.next();	
		if(str.equals("Lily")) {
			itr2.add("vander woodsen");
			
		}
		else if(str.equals("chuck"))
		{
			itr2.set("bass");
			
		}
		}
		System.out.println("Previuos element is available or not: "+itr2.hasPrevious());
		System.out.println("using Previuos method : "+itr2.previous());
		System.out.println("using Previuos index : "+itr2.previousIndex());
		System.out.println("using next index: "+itr2.nextIndex());
		
		
		
		
		System.out.println(list1);
		
		
		
		
		
		
	}

	

}
