package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./ActitimeData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df = new DataFormatter();
		Sheet sheet = wb.getSheet("Sheet1");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j <= sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j)) + "\t");
			}
			System.out.println();
		}
		wb.close();
	}

}
