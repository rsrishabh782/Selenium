package Excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;





public class Screenshot {

	
	public static void main(String args[]) throws IOException{
	System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	ScreenshotClass.TakesScreenshot(driver, "pic1");
	
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Testing");
	
	ScreenshotClass.TakesScreenshot(driver, "Text");
	
	System.out.println("Print Taken");

	driver.close();
	

	
	
	}
}
