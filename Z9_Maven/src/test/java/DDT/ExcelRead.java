package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	@Test
	public void ExcelReading() throws IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\Book1.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		int sheetcount = workbook.getNumberOfSheets();
		System.out.println("NO. of sheets : " + sheetcount);

		for (int i = 0; i < sheetcount; i++) {
			System.out.println((i + 1) + "." + workbook.getSheetName(i));
		}

		Sheet sheet = workbook.getSheet(workbook.getSheetName(0));

		int rowcount = sheet.getLastRowNum();
		System.out.println("No. of rows : " + rowcount);

		Row row = sheet.getRow(1);

		int cellcount = row.getLastCellNum();
		System.out.println("No. of cells in Row(0) :" + cellcount);

		for (int i = 0; i < rowcount; i++) {
			System.out.println((i + 1) + "Row cell values : ");
			for (int j = 0; j < cellcount; j++) {
				Cell value = sheet.getRow(i).getCell(j);
				DataFormatter data = new DataFormatter();
				String name = data.formatCellValue(value);
				System.out.println("	" + (j + 1) + "." + name);
			}
		}
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testData\\Book1.xlsx");
		row.createCell(9).setCellValue("Pass");
		workbook.write(fos);
		fos.flush();
		fos.close();
	}
}
