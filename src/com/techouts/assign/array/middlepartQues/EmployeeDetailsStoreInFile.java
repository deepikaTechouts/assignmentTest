package com.techouts.assign.array.middlepartQues;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailsStoreInFile {




	public static void main(String[] args) {
		EmployeeDetailsStoreInFile obj=new EmployeeDetailsStoreInFile();
		obj.writeFile();
		obj.nonEdit();




	}
	void writeFile()
	{
	FileOutputStream fos=null;
	try
	{
	fos =new FileOutputStream("studentDetails.txt",true);	
		String str="the business solution provider ";
		byte b[]=str.getBytes();
		fos.write(b);
	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
		
	}
	}
	void nonEdit()
	{
		File myfile = new File("studentDetails.txt");
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
		
		
		
	}

}
