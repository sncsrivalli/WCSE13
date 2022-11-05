package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoUnusedRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./ActitimeData.xlsx");

		// Step 2: Open the workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Step 3: Get control over sheet
		Sheet sheet = wb.getSheet("Sheet1");

		// Step 4: Create new row
		Row row = sheet.createRow(3);

		// Step 5: Create new cell
		Cell cell = row.createCell(2);

		// Step 6: Write into the cell
		cell.setCellValue("Fly High");

		// Step 7: Save the excel
		FileOutputStream fos = new FileOutputStream("./ActitimeData.xlsx");
		wb.write(fos);

		// Step 8: Close the excel
		wb.close();

	}

}
