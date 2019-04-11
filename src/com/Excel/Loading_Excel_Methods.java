package com.Excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Loading_Excel_Methods {
	private static final String Null = null;
	WebDriver driver;
	  FileInputStream fil;
	  Workbook wb; 
	public Loading_Excel_Methods(String string) {
	  
	  	try
	  	{
	  	fil=new FileInputStream(string);
	     wb=WorkbookFactory.create(fil);
	    }catch(Exception ex)
	  	{
	  		ex.printStackTrace();
	  
	  	}
	  		
	  	
	  	}
 public String getDdata(int sheet_no,int row,int col)
	  {
	  Sheet sheet1=wb.getSheetAt(sheet_no);
	  String data1=sheet1.getRow(row).getCell(col).getStringCellValue();
	  return data1;
	  }

 
 public int getRowCount(int sheet_index)
	  {
	  	int row=wb.getSheetAt(sheet_index).getLastRowNum();
	  	row=row+1;
	  	return row;
	  }
 




}

	
	
