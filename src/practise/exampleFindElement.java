package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleFindElement {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement el = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		el.click();
		//el.sendKeys(new String("Test"));
		el.sendKeys("test");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		

	}

}
/*
ID.
Name.
ClassName.
LinkText.
Partial LinkText.
TagName.
CssSelector.
XPath.
*/

