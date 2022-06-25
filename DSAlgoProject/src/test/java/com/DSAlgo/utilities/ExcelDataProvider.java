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
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	 public static int getRowCount(String xlfile,String xlsheet)   
	 {
 
		 fi = new FileInputStream(xlfile);
		 wb = new XSSFWorkbook(fi);
		 ws = wb.getSheet(xlsheet);
		 int rowcount = ws.getLastRowNum();
		 wb.close();
		 fi.close();
		 return rowcount;
		 
		 
	 }
		
		public int getcellCount(String xlfile,String xlsheet,int cellnum)
		{
			 fi = new FileInputStream(xlfile);
			 wb = new XSSFWorkbook(fi);
			 ws = wb.getSheet(xlsheet);
			 int cellcount = row.getLastCellNum();
			 wb.close();
			 fi.close();
			 return cellcount;
		}
		
		
		public String getcellData(String xlfile,String xlsheet,int rownum, int cellnum) throws IOException
		{
			 fi = new FileInputStream(xlfile);
			 wb = new XSSFWorkbook(fi);
			 ws = wb.getSheet(xlsheet);
			 row = ws.getRow(rownum);
			 cell = row.getCell(cellnum);
			 String data;
			 
			 DataFormatter formatter = new DataFormatter();
			 String cellData = formatter.formatCellValue(cell);
			 return cellData;
		}
			 wb.close();
			 fi.close();
		
	 }
	 

