package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exampleActions {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath(null));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.click();
		act.sendKeys(args);
		
	}

}
