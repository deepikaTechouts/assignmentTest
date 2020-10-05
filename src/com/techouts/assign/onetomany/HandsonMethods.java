package com.techouts.assign.onetomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandsonMethods {
String traineeName;
int Batch;
String address;
	
	
	
	
	
	
	
	@Override
public String toString() {
	return "HandsonMethods [traineeName=" + traineeName + ", Batch=" + Batch + ", address=" + address + "]";
}







	public HandsonMethods(String traineeName, int batch, String address) {
	super();
	this.traineeName = traineeName;
	Batch = batch;
	this.address = address;
}







	public static void main(String[] args) {

		HandsonMethods obj1=new HandsonMethods("Rohan",17,"hyderabad");
		HandsonMethods obj2=new HandsonMethods("mohan",17,"UttarPradesh");
		HandsonMethods obj3=new HandsonMethods("sanjay",17,"orissa");
		List<HandsonMethods>li=new ArrayList<>();
		li.add(obj1);
		li.add(obj2);
		li.add(obj3);
		System.out.println(li);
		
		
		
		String str="deepika";
Scanner sc=new Scanner(System.in);
System.out.println("enter user name");
String name=sc.next();
if(name.equals("deepika"))
	System.out.println("welcome");
else
	System.out.println("Incorrect user name");




String s="10";
int num=Integer.parseInt(s);
System.out.println("using parseInt :"+num);
	
	
	
String a="14564";
System.out.println(a.hashCode());



String s1="abc";
String s2="abc";
String s3=new String("abc");
System.out.println(s1.equals(s2));
System.out.println(s1==s2);
System.out.println(s3==s2);
System.out.println(s3.equals(s2));








	
	
	}

}
