package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Data_Fetch {

	public static String fetchdata(String s,int a,int b) {
		String value = null;
		try {
			
		FileInputStream fis = new FileInputStream("./excel/Datadriven.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(s);
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		 value = cell.toString();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}
}
