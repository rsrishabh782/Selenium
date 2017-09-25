package Excel;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browse1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//		Object webDriver;
		//		System.setProperty("webDriver.chrome.driver", "D:\\selenium-java-3.4.0\\lib\\chromedriver");
		//				
		//		WebDriver Driver = new ChromeDriver();		
		//		
		driver.navigate().to("https://www.google.com");

		driver.manage().window().maximize();
		//WebElement we = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a"));
		//System.out.println(we.getAttribute("href"));

		driver.findElement(By.id("lst-ib")).sendKeys("test");
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.className("sbico-c")).click();
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("(//div[@class='rc'])[1]/h3/a")).click();

		
		Set<String> windows = driver.getWindowHandles();
//				for(String currentwndow:windows)
//				{
//					driver.switchTo().window(currentwndow);
//				}
//				WebElement we = driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx']/span"));
//				System.out.println(we.getTagName());
//				driver.close();


		Iterator<String> I1 = windows.iterator();
//
		while(I1.hasNext())
		{
			String child_window = I1.next();

			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
			
//			WebElement we = driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx']/span"));
//			System.out.println(we.getTagName());
				
		}

		//		for(String currentwndow:windows)
		//		{
		//			driver.switchTo().window(currentwndow);
		//		}

		//System.out.println(driver.findElement(By.className("gauge-link")).getText());
		driver.close();
	}
}

