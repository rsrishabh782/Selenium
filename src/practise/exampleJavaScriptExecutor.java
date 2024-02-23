package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='40%'");

		Thread.sleep(5000);

		js.executeScript("document.body.style.zoom='100%'");

		Thread.sleep(5000);
		
		js.executeScript("window.scrollby(0,1500)");

		js.executeScript("window.scrollby(0,-1500)");

		js.executeScript("arguments[0].scrollintoview(true);", driver.findElement(By.xpath(null)));

		js.executeScript("document.getElementById('elementID')setAttribute('value', 'new value for element')");

		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");

		js.executeScript("document.body.style.zoom='40'");

		driver.close();
	}

}

