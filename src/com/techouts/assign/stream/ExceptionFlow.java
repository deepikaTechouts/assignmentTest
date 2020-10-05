package com.techouts.assign.stream;

import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionFlow {
	
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  } 
	

	public static void main(String[] args) {
     
		System.out.println(".....using Try Catch......");
		System.out.println("....ComplileTimeException....");
		ExceptionFlow obj=new ExceptionFlow();
		obj.p();
		
		
		
		
		
		
		System.out.println("RunTimeException");
		try {
    	int a=20/0; 
    	 String str="abc";
    	 int no=Integer.parseInt(str);
    	 String s[]= {"hello","hi"};
    	 String index=s[3].toLowerCase();
    	 System.out.println(index);
     }
     catch(ArithmeticException e)
     {
    	 e.printStackTrace();
    	 System.out.println("\ncatch block ");
    	  }
	catch(NumberFormatException e)
     {
		e.printStackTrace();
     }
		
     catch(Exception e)
     {
		e.printStackTrace();
     }
		
	
     
     
     
     
		System.out.println(".....using Try Catch Finally......");
		try {
    	int a=20/0; 
    	 String str="abc";
    	 int no=Integer.parseInt(str);
    	 String s[]= {"hello","hi"};
    	 String index=s[3].toLowerCase();
    	 System.out.println(index);
     }
     catch(ArithmeticException e)
     {
    	 e.printStackTrace();
    	 System.out.println("catch block");
     } 
     finally {
    	 
    	 System.out.println("finall block will execute anyhow always");
     }
		
		
	}

}
