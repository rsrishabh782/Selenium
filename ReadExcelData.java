package Excel;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.bcel.generic.Select;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class ReadExcelData {

	public void tc() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.chrome.driver", "D:\\selenium-java-3.4.0\\lib\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		driver.get("http://linkedin.com/");
		driver.manage().window().maximize();

		ArrayList<String> username = readexcel(0);
		ArrayList<String> password = readexcel(1);

		for(int i = 0; i<username.size(); i++)
		{
			driver.findElement(By.id("login-email")).sendKeys(username.get(i));
			driver.findElement(By.id("login-password")).sendKeys(password.get(i));
			//driver.findElement(By.id("login-submit")).click();
			Thread.sleep(600);

			//	WebElement we = driver.findElement(By.className("nav-item__title nav-item__dropdown-trigger--title"));
			//	WebElement we1 = driver.findElement(By.id("ember4572"));



			//		WebElement we = driver.findElement(By.xpath("//li[@id='profile-nav-item']/div/button"));
			//		WebElement we1 = driver.findElement(By.id("ember4572"));

			//      Select dropdown = new Select(we);


			//			Actions action = new Actions(driver);
			//		    action.moveToElement(we).click();
			//		    action.moveToElement(we1).click();


			driver.findElement(By.id("login-submit")).click();
			driver.findElement(By.id("profile-nav-item")).click();
			//	driver.findElement(By.id("ember4572")).click();
			driver.findElement(By.className("nav-dropdown__action")).click();




			driver.close();
		}
	}

	public ArrayList<String> readexcel(int colno) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\rshri7\\Desktop\\Book1.xls");

		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sh = wb.getSheet("Login");

		java.util.Iterator<Row> rowIterator = sh.iterator();	

		rowIterator.next();

		ArrayList<String> list =  new ArrayList<String>();

		while(rowIterator.hasNext())
		{
			list.add(rowIterator.next().getCell(colno).getStringCellValue());
		}

		System.out.println("List :::: " +list);
		return list;

	}

	public static void main(String args[]) throws IOException, InterruptedException
	{
		ReadExcelData data = new ReadExcelData();
		data.tc();

	}
}

