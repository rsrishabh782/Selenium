package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exampleSelect {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath(null));
		Select se = new Select(ele);
		se.selectByIndex(0);
		se.selectByValue(null);
		se.selectByVisibleText(null);
		
	}

}
