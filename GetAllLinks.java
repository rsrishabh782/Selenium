package Excel;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");

	//	List<WebElement> alllinks =  driver.findElements(By.tagName("a"));
		
		java.util.List<WebElement> allinks = driver.findElements(By.tagName("a"));

		//WebElement we = driver.findElement(By.tagName("a"));

		System.out.println("Number of link " +allinks.size());

		//System.out.println(alllinks.getText());

//		for(int i=0; i<=allinks.size(); i++)
//		{
//			System.out.println(allinks.get(i).getText());
//		}
		
		for(WebElement link : allinks)
		{
			System.out.println(link.getText());

		}		
	}
}
