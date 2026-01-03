package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchAndPrint_RowsAndColums_MultipleData_13_12_2025 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("data");
		
		int lastRow = sheet.getLastRowNum();
		
		for(int i = 0; i<=lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			long lastColum = row.getLastCellNum();
			for(int j=0; j<lastColum; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue()+ " | ");
			}
			System.out.println();
		}
	}

}
