package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class WriteExcel {



	public static void main(String args[]) throws IOException

	{
		//File fs = new File("C:\\Users\\rshri7\\Desktop\\Book1.xlsx");


		FileInputStream file = new FileInputStream("C:\\Users\\rshri7\\Desktop\\Book1.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet HS = wb.getSheetAt(0);


		HS.getRow(1).createCell(2).setCellValue("Pass");
		HS.getRow(2).createCell(2).setCellValue("Fail");
		
		//String data = HS.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Writing excel");
		//System.out.println("Data is " +data);


		//HS.getRow(1).createCell(2).setCellValue("Pass");
		//HS.getRow(1).createCell(3).setCellValue("Fail");
		FileOutputStream fis = new FileOutputStream("C:\\Users\\rshri7\\Desktop\\Book1.xls");

		wb.write(fis);
		wb.close();


	}
}

