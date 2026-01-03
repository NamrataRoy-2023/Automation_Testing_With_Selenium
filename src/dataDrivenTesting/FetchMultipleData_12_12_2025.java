package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchMultipleData_12_12_2025 {
	public static void main(String[] args) throws IOException {
			////FETCH THE WORKBOOK
			FileInputStream fs = new FileInputStream("./Excel/DataDrivenTesting.xlsx");
			////ACCESS THE WORKBOOK
			XSSFWorkbook book = new XSSFWorkbook(fs);
			////ACCESS THE SHEET
			XSSFSheet sheet = book.getSheet("Data");
			////ACCESS THE ROW
			XSSFRow row = sheet.getRow(0);
			
			System.out.println("Name : "+row.getCell(0).getStringCellValue());
			System.out.println("Grade : "+row.getCell(1).getStringCellValue());
			
			book.close();
			fs.close();
	}

}
