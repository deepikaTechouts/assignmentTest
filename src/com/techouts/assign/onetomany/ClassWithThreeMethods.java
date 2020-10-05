package com.techouts.assign.onetomany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClassWithThreeMethods {
	Scanner sc=new Scanner(System.in);
	
void CheckDateEarlier() throws ParseException
    {
	System.out.println(".....Earlier Date.......");
	System.out.println("please enter date in this format(dd/MM/yyyy)");	
	String Date1=sc.next();  
	Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Date1);  
	System.out.println(Date1+"\t"+date1);
	Date dateobj=new Date();
	dateobj.before(date1);
	
    }
     
void CheckDateAfter() throws ParseException
{   
	System.out.println(".....After Date.......");
	System.out.println("please enter date in this format(dd/MM/yyyy)");	
	String Date1=sc.next();  
	Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Date1);  
	System.out.println(Date1+"\t"+date1);
	Date dateobj=new Date();
	dateobj.after(date1);
}
void formatingDate() throws ParseException
{
	System.out.println(".....Formating Date.......");
System.out.println("please enter date in this format(dd/MM/yyyy)");	
String Date1=sc.next();  
Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Date1);  
System.out.println(Date1+"\t"+date1);
Date dateobj=new Date();


}
	public static void main(String[] args) throws ParseException {
		
		
		ClassWithThreeMethods obj=new ClassWithThreeMethods();
		System.out.println("please enter date for accessing");
		
		
		
		obj.formatingDate();
		obj.CheckDateEarlier();
		obj.CheckDateAfter();
    
		
		
		
		
		
	}

}
