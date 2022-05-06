package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataCellValues {

	private static void allData() throws IOException {
	
		File f1 = new File("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\DataDriven\\Data Driven practice.xlsx");

		FileInputStream fis = new FileInputStream(f1);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet st = wb.getSheetAt(0);
		int numberOfRows = st.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {
			
			Row r=st.getRow(i);
			
		int numberOfCells= r.getPhysicalNumberOfCells();
		
		for (int j = 0; j < numberOfCells; j++) {
			
			Cell c=r.getCell(j);
		
			System.out.print(c+" ");
		}
		System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		allData();
	}
	
}
