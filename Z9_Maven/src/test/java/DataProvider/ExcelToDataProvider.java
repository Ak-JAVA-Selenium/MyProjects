package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToDataProvider {
	FileInputStream fis; 
	Workbook workbook;
	DataFormatter dataF;
	Sheet sheet;
	Row row;
	Cell cell;

	ExcelToDataProvider(String path) {
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dataF = new DataFormatter();
	}

	public int getRowCount(String Sheetname) {
		sheet = workbook.getSheet(Sheetname);
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}

	public int getCellCount(String Sheetname) {
		sheet = workbook.getSheet(Sheetname);
		int cellcount = sheet.getRow(0).getLastCellNum();
		return cellcount;
	}

	public Object[][] getData(String Sheetname) {
		sheet = workbook.getSheet(Sheetname);
		int rowcount = getRowCount(Sheetname);
		int cellcount = getCellCount(Sheetname);
		Object[][] data = new Object[rowcount][cellcount];

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				cell = sheet.getRow(i+1).getCell(j);
				String name = dataF.formatCellValue(cell);
				data[i][j] = name;
			}
		}
		return data;
	}

	public static void main(String[] args) {

		ExcelToDataProvider hi = new ExcelToDataProvider(".\\src\\test\\resources\\testData\\Book1.xlsx");
		Object[][] data = hi.getData("Sheet1");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+"	");
			}
			System.out.println();
		}
		System.out.println(hi.getRowCount("Sheet1"));
	}
}
