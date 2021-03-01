package com.htc.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook workBook;
	
	public ExcelDataProvider(){
		File source=new File("C:\\Users\\Happy\\Desktop\\UnitTesting\\r\\SeleniumAcademyPOM\\src\\test\\resources\\LoginData.xlsx");
		
		try {
			FileInputStream fileInputStream=new FileInputStream(source);
			workBook=new XSSFWorkbook(fileInputStream);
			}catch(Exception e) {
				System.out.println("Unable to Read Excel File"+e.getMessage());
			}
		}
	
	public String getStringData(int sheetIndex,int row,int column) {
	return	workBook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	public String getStringData(String sheetName,int row,int column) {
		return	workBook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		}
	public double getNumericData(String sheetName,int row,int column) {
		return	workBook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		}
	
	
	
	
	
	
	
	
	
}
