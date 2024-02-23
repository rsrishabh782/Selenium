package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleAlert {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath(null));

		driver.switchTo().alert().sendKeys(null);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}

}
