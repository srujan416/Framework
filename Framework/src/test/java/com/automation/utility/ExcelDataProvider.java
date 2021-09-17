/**
 * 
 */
package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Dell
 *
 */
public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel File" +e.getMessage());
		}
	}
	//Constructor Done here	
	public String getStringData(int sheetIndex,int row, int column )
	{
	return	wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	
	}
	
	//String
		public String getStringData(String sheetName,int row, int column )
		{
		return	wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		}
		
		
		//Numeric
		public double getNumericData(String sheetName,int row, int column ) 
		
		{
			return	wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
				
		}
	

}
