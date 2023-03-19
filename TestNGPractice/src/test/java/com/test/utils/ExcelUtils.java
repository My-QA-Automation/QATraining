package com.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private XSSFSheet ExcelWSheet;
	private XSSFWorkbook ExcelWBook;
	private XSSFCell Cell;
	private XSSFRow Row;

	public Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

	   String[][] tabArray = null;
	   try {	
		   FileInputStream ExcelFile = new FileInputStream(FilePath);	
		   // Access the required test data sheet	
		   ExcelWBook = new XSSFWorkbook(ExcelFile);	
		   ExcelWSheet = ExcelWBook.getSheet(SheetName);
		   int startRow = 1;	
		   int startCol = 0;
		   int ci,cj;
		  
		   int totalRows = ExcelWSheet.getPhysicalNumberOfRows();
		   int totalCols = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		   System.out.println("totalRows: "+totalRows+" totalCols: "+totalCols);  
		   
		   tabArray=new String[totalRows-1][totalCols];
		   ci=0;
		   for (int i=startRow;i<totalRows;i++, ci++) {  
			   cj=0;
			   for (int j=startCol;j<totalCols;j++, cj++){				 
				   tabArray[ci][cj]=getCellData(i,j);
				   System.out.println("tabArray: ["+ci+", "+cj+"] : "+tabArray[ci][cj]); 
					}
				}
			}
	
		catch (FileNotFoundException e){
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
			}
	
		catch (IOException e){
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
			}
	
		return(tabArray);
		}
	
	public String getCellData(int RowNum, int ColNum) throws Exception {
	
		try{		
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			Cell.setCellType(Cell.CELL_TYPE_STRING);
			int dataType = Cell.getCellType();
			if  (dataType == 3) {
				return "";
			}else{
				String CellData = Cell.getStringCellValue();
				return CellData;
			}
		}
			catch (Exception e){
				System.out.println(e.getMessage());
				throw (e);
			}
		}
	
	
	public int getRowCount() throws Exception {
			int rowCount = ExcelWSheet.getPhysicalNumberOfRows();
			return rowCount;
		}
	
	public int getColCount() throws Exception {
		int colCount = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}
	
	public static void main(String argsp[]) throws Exception{
		String projectPath = System.getProperty("user.dir");
		ExcelUtils utils = new ExcelUtils();
		utils.getTableArray(projectPath+"\\test-data\\SimpleBooks.xlsx","Orders");
	}

}
