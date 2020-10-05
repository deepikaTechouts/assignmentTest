package com.techouts.assign.onetomany;

public class Company {
String companyName;
Employee employee;


	public Company(String companyName, Employee employee) {
	super();
	this.companyName = companyName;
	this.employee = employee;
	System.out.println("company name :"+companyName);
	System.out.println("Rating :"+employee.startYear);
	System.out.println("StartYear :"+employee.ratingNo);
}
	


	public static void main(String[] args) {
		Employee empObject1=new Employee(5,2012);
		Employee empObject2=new Employee(4,2011);
		Company companyObject1=new Company("techouts",empObject1);
		Company companyObject2=new Company("SeedFlow",empObject2);
		
		
		
		
	}
}
