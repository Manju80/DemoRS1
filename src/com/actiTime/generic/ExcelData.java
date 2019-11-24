package com.actiTime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements AutoConstant

{
	
	public static String getData(String Filepath, String Sheetname, int rn, int cn)
	{

	try
	{
		
		FileInputStream fis=new FileInputStream(new File(Filepath));
	Workbook wb=WorkbookFactory.create(fis);
	Cell cc= wb.getSheet(Sheetname).getRow(rn).getCell(cn);
	String data=cc.toString();
	return data;
	}
	
	catch(Exception e)
	{
		
		return " ";
	}

}
	
public static int getrowCount(String Filepath, String SheetName)
	{
			
		try
		{
			
			FileInputStream fis=new FileInputStream(new File(Filepath));
			Workbook wb= WorkbookFactory.create(fis);
		    Sheet sh=wb.getSheet(SheetName);
		    int rc = sh.getLastRowNum();
		    return rc;
		}
		
	catch(Exception e)
		
	{
		return 0;
	}
}		
	
	public static int getCellCount(String Filepath, String Sheetname, int rn)
	
	{
		
	   try
	   {
		   
		   FileInputStream fis=new FileInputStream(new File(Filepath));
			Workbook wb= WorkbookFactory.create(fis);
		    Sheet sh=wb.getSheet(Sheetname);
		    Row rc = sh.getRow(rn);
		    short cc = rc.getLastCellNum();
		    return cc;
		   
	   }
	   
	   
	   catch (Exception e)
	   
	   {
		   return 0;
		   
	   }
		
	}		
}		
	
	
