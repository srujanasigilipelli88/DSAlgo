package com.DSAlgo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class ExcelDataProvider 
{

	
	@Test
	public static Object[][] readExcelData(String filePath, String sheetName) throws Exception
	{
		System.out.println(filePath);
		XSSFWorkbook wb=null;
		XSSFSheet sheet=null;
		FileInputStream fis=null;
		Object data[][]=null;
		try {
			fis = new FileInputStream(filePath);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			XSSFRow row = sheet.getRow(0);
			int colCount = row.getLastCellNum();
			
			data = new Object[rowCount][colCount];
			for (int i = 0; i < rowCount; i++) {
				row = sheet.getRow(i + 1);
				for (int j = 0; j < colCount; j++) {
					data[i][j] = row.getCell(j).toString();
					System.out.println(row.getCell(j));
				}
			} 
		} 
		catch(Exception ex) 
		{
			ex.printStackTrace();
			
		}finally {
			wb.close();
			fis.close();
		}
		return data;
	}	
}
	
	