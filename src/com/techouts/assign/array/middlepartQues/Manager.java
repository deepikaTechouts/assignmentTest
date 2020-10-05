package com.techouts.assign.array.middlepartQues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Manager extends EmployeeCreateReadWrite {
	
	void delete()
	{
		try  
		{         
		File f= new File("E:\\music.txt");           //file to be delete  
		if(f.delete())                      //returns Boolean value  
		{  
		System.out.println(f.getName() + " deleted");   //getting and printing the file name  
		}  
		else  
		{  
		System.out.println("failed");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.creatFile();
		//manager.readFile();
		//manager.writeFile();
		//manager.delete();

	}

	@Override
	public void creatFile() {
		File file = new File("G:\\Techouts\\JavaPrograms\\music.txt"); // initialize File object and passing path as
		// argument
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}

	}

	@Override
	public void readFile() {
		// TODO Auto-generated method stub
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("G:\\Techouts\\JavaPrograms\\music.txt");
			int ch;

			while ((ch = fis.read()) != -1) {
				System.out.println((char) ch);
				

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void writeFile() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("G:\\Techouts\\JavaPrograms\\music.txt", true);
			Scanner sc=new Scanner(System.in);
			String str = sc.next();
			byte b[] = str.getBytes();
			fos.write(b);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
