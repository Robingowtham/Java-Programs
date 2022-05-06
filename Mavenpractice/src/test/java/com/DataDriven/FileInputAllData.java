package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.model.RowBlocksReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileInputAllData {

	private static void excel_dataDriven() throws IOException {

		File f1 = new File("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\DataDriven\\Data Driven practice.xlsx");

		FileInputStream fis = new FileInputStream(f1);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet st = wb.getSheetAt(0);
		int numberOfRows = st.getPhysicalNumberOfRows();

		for (int i = 0; i <numberOfRows; i++) {

			Row r = st.getRow(i);
			
			
			
			int numberOfCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);
				CellType ctype = c.getCellType();
				
				
								//ctype or CellType
				if (ctype.equals(ctype.STRING)) {   
					String StringCellValue = c.getStringCellValue();
					System.out.print(StringCellValue+" ");
					
					
				}else if (ctype.equals(ctype.NUMERIC)) {

					double numericCellValue = c.getNumericCellValue();
					int data = (int) numericCellValue;
					System.out.print(data);
				}
				
			}System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {

		excel_dataDriven();
	}

}
