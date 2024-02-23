package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class exampleKeyBoard {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement webele = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		webele.click();
		Actions act = new Actions(driver);
		Action act1 = act.keyDown(webele, Keys.SHIFT).sendKeys("rishabh").keyUp(webele, Keys.SHIFT).build();
		act1.perform();
		//	driver.close();



	}

}
