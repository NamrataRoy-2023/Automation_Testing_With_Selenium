package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleDataInsideExcel_13_12_2025 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		///CREATE NEW SHEET
		XSSFSheet sheet = book.createSheet("Name");
		
		///CREATE NEW ROW AND CELL
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("NamraRio");
		
		///TO WRITE DATA IN EXCEL
		FileOutputStream fos = new FileOutputStream("./Excel/DataDrivenTesting.xlsx");
		book.write(fos);
		
		////CLOSE RESOURCES
		book.close();
		fis.close();
		fos.close();
		
		
	}

}
