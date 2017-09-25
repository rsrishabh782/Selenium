package DataDriverFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {

	WebDriver driver; 

	@Test(dataProvider="facebookData")

	public void login(String username, String password) throws InterruptedException
	{
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshri7\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(password);

		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

		Thread.sleep(5000);

		System.out.println(driver.getTitle());

		//		String actualtitle = driver.getTitle() ;
		//		
		//		System.out.println(actualtitle);
		//		
		//		String expectedtitle = "(1) Facebook";
		//		assertEquals(actualtitle, expectedtitle);
		//		{
		//			System.out.println("Title matched" + expectedtitle);
		//		}

		Assert.assertTrue(driver.getTitle().contains("Facebook"), "Page title is not matching");

		System.out.println("Page title is matching");

	}


	@AfterMethod
	public void tearDown(){

		driver.quit();
	}

	@DataProvider(name ="facebookData")
	public Object[][] passData()
	{

	//	ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\rshri7\\workspace\\Excel_Sheet\\TestData\\InputData.xls");
		
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\rshri7\\workspace\\Excel_Sheet\\TestData\\InputData.xls");
		
		int rows = config.getRowCount(0);

		Object[][] data = new Object[rows][2];


		//		Object[][] data = new Object[3][2];
		//		
		//		data[0][0] = "rsrishabh782@gmail.com";
		//		data[0][1] = "******";
		//		
		//
		//		data[1][0] = "rsrishabhsrivastava@gmail.com";
		//		data[1][1] = "*******";
		//		
		//		data[2][0] = "rsrishabhsrivastava1@gmail.com";
		//		data[2][1] = "******";

		for(int i=0; i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);

		}

		return data; 

	}

}
