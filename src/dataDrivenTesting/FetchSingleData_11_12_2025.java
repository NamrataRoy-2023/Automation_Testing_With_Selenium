package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchSingleData_11_12_2025 {
	public static void main(String[] args) throws IOException {
		////FETCH THE WORKBOOK
		FileInputStream fs = new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		////ACCESS THE WORKBOOK
		XSSFWorkbook book = new XSSFWorkbook(fs);
		////ACCESS THE SHEET
		XSSFSheet sheet = book.getSheet("Data");
		////ACCESS THE ROW
		XSSFRow row = sheet.getRow(0);
		////ACCESS THE CELL
		XSSFCell cell = row.getCell(1);
		////FETCH VALUE FROM CELL
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		book.close();
		fs.close();
	}
	
	
	//////////////////////////////////////////12.12.2025///////////////////////////////////

}
