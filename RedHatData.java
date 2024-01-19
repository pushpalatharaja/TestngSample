package week6.testngHomeAssignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RedHatData {
	
	
	public static String[][] dataFetch() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./Data/RedHat.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount= sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();
			data[i-1][j]=cellValue; 
				
			}
		}
			
			wb.close();
			return data;
		
		
	}

}
