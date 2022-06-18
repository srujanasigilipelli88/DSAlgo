package com.DSAlgo.Testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestData {

	public static void main(String[] args) throws  Exception
	{
    File src = new File("C:\\Users\\Sruja\\eclipse-workspace\\DSAlgoProject\\TestData\\DataDSAlgo.xlsx");
    
    FileInputStream fis = new FileInputStream(src);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sheet = wb.getSheetAt(0);
    
    String data = sheet.getRow(0).getCell(1).getStringCellValue();
    
    String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
    
    System.out.println("Data in excel is"   + data +"" + data1 );
    
    
		
	}

}
