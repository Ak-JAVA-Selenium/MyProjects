package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	Workbook workbook;
	
	public Workbook GetExcel(String filename) throws IOException{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\"+filename+".xlsx");
		workbook = new XSSFWorkbook(fis);
		return workbook;
	}
	
	public int getSheetCount () {
		int sheetcount = workbook.getNumberOfSheets();
		return sheetcount;
	}
	
}
