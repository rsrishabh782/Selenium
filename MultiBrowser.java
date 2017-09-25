package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class MultiBrowser {
	
	
	 WebDriver driver;
	 
	
	  @Test
	//  @BeforeClass
	//  @Parameters("browser")
	  @org.testng.annotations.Parameters ({"browser"})
	
	  
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String newbrowser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(newbrowser.equalsIgnoreCase("firefox")) {
	 
		  System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }
//	  else if (newbrowser.equalsIgnoreCase("ie")) { 
//	 
//		  // Here I am setting up the path for my IEDriver
//	 
//		  System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
//	 
//		  driver = new InternetExplorerDriver();
//	 
//	  } 
	 
	  else if (newbrowser.equalsIgnoreCase("chrome")) { 
			 
		  // Here I am setting up the path for my IEDriver
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshri7\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 
		  driver = new ChromeDriver();
	 
	  }
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://www.store.demoqa.com"); 
	  
	  driver.manage().window().maximize();
	 
	  driver.close();
	  }
	 
	  // Once Before method is completed, Test method will start
	 
//	  @Test public void login() throws InterruptedException {
//	 
//		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//	 
//	    driver.findElement(By.id("log")).sendKeys("testuser_1");
//	 
//	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
//	 
//	    driver.findElement(By.id("login")).click();
//	 
//		}  
	 
//	  @AfterClass public void afterTest() {
//	 
//			driver.quit();
//	 
//		}
}
