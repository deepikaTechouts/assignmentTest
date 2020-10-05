package com.techouts.assign.onetomany;

public class AnnonymousClass  {

	public static void main(String[] args) {
		
			InterfaceExample i=new InterfaceExample()
					{

						@Override
						public void m1() {
							System.out.println("this is the implemtation using annonymous inner class");
						}
			
				
					};
					i.m1();
					

	}

	

}
