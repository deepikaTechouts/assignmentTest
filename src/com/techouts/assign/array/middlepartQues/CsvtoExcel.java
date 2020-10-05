package com.techouts.assign.array.middlepartQues;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CsvtoExcel {

	
	public static void main(String[] args) throws FileNotFoundException {
	
		 
	        String fileName = "files\\inputfile.xlsx";
	        String thisLine;
	        String lastfile = null;
	        int count=0;
	        FileInputStream fisobj = new FileInputStream(fileName);
	        DataInputStream dis = new DataInputStream(fisobj);
	        int i=0;
	        ArrayList arList = new ArrayList();
	        try {
				while ((thisLine = dis.readLine()) != null)
				{
				   ArrayList al = new ArrayList();
				    String strar[] = thisLine.split(",");
				   // System.out.println(Arrays.toString(strar));
				    for(int j=0;j<strar.length;j++)
				    {
				    	//String edit = strar[j].replace('\n', ' ');
				        al.add(strar[j]);
				    }
				    arList.add(al);
				   // System.out.println(arList.toString());
				    i++;
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}

	        try
	        {
	            HSSFWorkbook hwb = new HSSFWorkbook();
	            FileWriter fw=new FileWriter("Files\\retrieve.csv");
                BufferedWriter bwobj=new BufferedWriter(fw);
	            HSSFSheet sheet = hwb.createSheet("new sheet");
	            String data = null;
	            for(int k=0; k<arList.size(); k++)
	            {
	            	HSSFCell cell;
	                ArrayList ardata = (ArrayList)arList.get(k);
	                HSSFRow row = sheet.createRow((short) 0+k);
	                for(int p=0;p<ardata.size();p++)
	                {
	                     cell = row.createCell((short) p);
	                     data = ardata.get(p).toString();
	                 
	                    cell.setCellValue(data);
	                    lastfile=cell.toString();
	                    System.out.println(lastfile);
	                    bwobj.write(lastfile);
	                }
	  
	            }
	            
	            bwobj.close();
	            FileReader fr;
	        	
	            System.out.println("excel file is converted");
	        } catch ( Exception e ) {
	            e.printStackTrace();
	        } 
	}
}
