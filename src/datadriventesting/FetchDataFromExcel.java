package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step 1: Convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./ActitimeData.xlsx");
		
		//Step 2: Open the workbook
		Workbook wb = WorkbookFactory.create(fis);
//		
//		//Step 3: Get control over the sheet
//		Sheet sheet = wb.getSheet("Sheet1");
//		
//		//Step 4: Get control over the row
//		Row row = sheet.getRow(0);
//	
//		//Step 5: Get control over the cell
//		Cell cell = row.getCell(1);
//		
//		//Step 6: Fetch data from the cell
//		String data = cell.getStringCellValue();
		String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		//Step 7: Close the workbook
		wb.close();
		

	}

}
