package com.techouts.assign.array.middlepartQues;

import java.util.Scanner;

class InvalidUserNameTest {

	

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=sc.next();
		char ch[]=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
		if(name.length()<10||ch[i]=='&')
		{
			throw new InvalidUserName("your name contains '&' or length is less than 10");
			
			
		}
		
		
		}
		System.out.println("your welcome   "+name);
		
	}

}
