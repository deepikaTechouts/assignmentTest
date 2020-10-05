package com.techouts.assign.array.middlepartQues;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelToCsv {

	public static void main(String[] args) throws IOException {
		File filename=new File("G:\\Techouts\\Basic_Java\\excelDemo.xlsx");
		int sheetId=0;
		      Cell cell;
		      OutputStream outpustream;
			try {
			 
		     // BufferedWriter bwobj=new BufferedWriter(filename);
		      
			FileInputStream fisobj=new FileInputStream(filename);
			
			Workbook wb=WorkbookFactory.create(fisobj);
			Sheet sheet=wb.getSheetAt(sheetId);
	       List<String>li=new ArrayList<>();
	       
			Iterator<Row> itr=sheet.iterator();
			while (itr.hasNext()) {
				Row row=itr.next();
				
				Iterator<Cell> celliterator=row.iterator();
				
				while (celliterator.hasNext()) {
					 cell=celliterator.next();
					 li.add(cell.toString());
					 String strfile="";
					switch (cell.getCellType()) {
					case STRING:  
						strfile=cell.getStringCellValue();
						break;
					case NUMERIC:
						strfile=String.valueOf(cell.getNumericCellValue());

					default:
						break;
					}
					  strfile=li.toString();
					FileOutputStream bwobj=new FileOutputStream("Files\\inputfile.xlsx");
					 byte b[] = strfile.getBytes();
				
					 bwobj.write(b);
					System.out.println( strfile);
					
					// OutputStream f = new OutputStream("Files\\inputfile.xlsx");
				     
					 
					 //OutputStreamWriter bwobj=new OutputStreamWriter(filename);
					
					
				}
			}
			
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}