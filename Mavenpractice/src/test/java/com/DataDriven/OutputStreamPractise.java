package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OutputStreamPractise {
	
	private static void write_Data() throws IOException {

		File f=new File("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\DataDriven\\Data_Driven_practice.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
				
		wb.createSheet("Sheet2").createRow(0).createCell(0).setCellValue("Elements");
		wb.getSheet("Sheet2").getRow(0).createCell(1).setCellValue("Values");
		
		wb.getSheet("Sheet2").createRow(1).createCell(0).setCellValue("Xpath Elemeent 1");
		wb.getSheet("Sheet2").getRow(1).createCell(1).setCellValue("UserName");
		
		FileOutputStream fos=new FileOutputStream(f);
				
		wb.write(fos);
		
		System.out.println("Written succesfully");
	}

	public static void main(String[] args) throws IOException {
	
	write_Data();
}
}