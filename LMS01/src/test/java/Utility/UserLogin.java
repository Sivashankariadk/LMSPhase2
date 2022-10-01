package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import PageObjectModel.BaseClass;

public class UserLogin extends BaseClass {
	
	/***
	 * 
	 * @param sheetName
	 * @return
	 * @throws IOException
	 */
	public Object[][] getTestData(String sheetName) throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/TestData/TestDataSheet.xlsx";
		File file = new File(path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Using Fis in the existing workbook

		XSSFSheet sheet = workbook.getSheet("Data");
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i + 1).getLastCellNum(); j++) {
				String cellVal = null;
				XSSFCell cell = sheet.getRow(i + 1).getCell(j);
				if (cell != null) {
					cellVal = cell.toString();
				}
				data[i][j] = cellVal;
			}
		}

		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
