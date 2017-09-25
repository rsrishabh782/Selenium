package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {

	public static void main(String[] args) throws IOException {
		{
			FileInputStream file = new FileInputStream("C:\\Users\\rshri7\\Desktop\\Book1.xls");
			HSSFWorkbook wb = new HSSFWorkbook(file);
			HSSFSheet xs = wb.getSheet("Login");
			
			java.util.Iterator<Row> rowIterator = xs.iterator();	
			
			rowIterator.next();	
			while(rowIterator.hasNext())
			{
				System.out.println(rowIterator.next().getCell(2).getStringCellValue());
				//rowIterator.next().getCell(2).setCellValue("Rishabh");
			}
			
		}

	}

}
