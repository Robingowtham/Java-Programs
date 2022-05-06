package com.DataDriven;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FileInputPractice {

	
	private static void read_Excel_Data() throws IOException {
		
		File f=new File("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\DataDriven\\Data Driven practice.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
//		File>Workbook>sheet>row/colum>cell
		
		Workbook wb=new XSSFWorkbook(fis);
		
//		wb.getSheet("Sheet1").getRow(0).getCell(0);	
		
		Sheet sheetat= wb.getSheet("Sheet1");
		
		Row r=sheetat.getRow(1);
		
		Cell c=r.getCell(1);
		
//		System.out.println("Display cell details: "+c);
		
		CellType ct=c.getCellType();
		
		if (ct.equals(ct.STRING)) {
			
			String CellValueString=c.getStringCellValue();
			
			System.out.println("Cell is String Value: "+CellValueString);
			
		}
		else if (ct.equals(ct.NUMERIC)) {
			
			double cellValueNumeric=c.getNumericCellValue();
			
			int data=(int) cellValueNumeric;
			
			System.out.println("Cell is numeric Value :" +data);
			
		}
	}

	public static void main(String[] args) throws IOException {

		read_Excel_Data();
		
	}
}

