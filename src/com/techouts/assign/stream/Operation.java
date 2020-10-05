package com.techouts.assign.stream;

import java.util.Scanner;

public class Operation {
	int ch;
	
			public void calculate()
			{
				final double minus;
				final double plus;
				final double multiply;
				final double divide;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter first no.");
				double a=sc.nextInt();
				System.out.println("enter second no.");
				double b=sc.nextInt();
				
				System.out.println("enter choice please");
				System.out.println("1.Plus\n2.Minus\n3.Multiply\n4.Division\n5.All operation at a time");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					
						plus=a+b;
						System.out.println(plus);
						System.out.println("you want other operation\n1.press ");
						 int ch=sc.nextInt();
						if(ch==1)
						calculate();
						else
					break;
				
					
				case 2:
					
					 minus=a-b;
					 System.out.println(minus);
					 System.out.println("you want other operation\n1.press ");
					 ch=sc.nextInt();
					if(ch==1)
					
					 calculate();
				break;
				case 3:
					
					 multiply=a*b;
					 System.out.println(multiply);
					 calculate();
				break;
				case 4:
					
					 divide=a+b;
					 System.out.println(divide);
					 System.out.println("you want other operation\n1.press ");
					 ch=sc.nextInt();
					if(ch==1)
					 calculate();
					break;
					
				case 5:
					plus=a+b;
					minus=a-b;
					multiply=a*b;
					 divide=a+b;
					 System.out.println("plus is: \n"+plus+"Minus is : \n"+"multiply is :\n"+multiply+"Divide is:\n"+divide);
					 System.out.println("you want other operation\n1.press ");
					 ch=sc.nextInt();
					if(ch==1)
					 calculate();
					break;
				
				default:System.out.println("No input is matched");
				
				}
				
				
			
			
			
			
			}
	public static void main(String[] args) {
		Operation obj=new Operation();
	obj.calculate();
		
		
		
	}

}
