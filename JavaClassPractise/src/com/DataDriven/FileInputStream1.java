package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileInputStream1 {

private void read_Excel_Data() throws IOException {
		
		File f=new File("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\DataDriven\\Data Driven practice.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheetat= wb.getSheetAt(0);
		
		XSSFRow r=sheetat.getRow(0);
		
	
		
	
	}
}
