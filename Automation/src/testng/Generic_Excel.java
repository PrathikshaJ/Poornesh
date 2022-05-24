package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Generic_Excel {

	public static String getData(String sheet, int row, int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Excel/Advance.xlsx");
		
	
		Workbook wb = WorkbookFactory.create(fis);
		
		
		
		Sheet s = wb.getSheet(sheet);
		Row r=s.getRow(row);
		 Cell c = r.getCell(column);
		return c.getStringCellValue();
		
		
	}

}
