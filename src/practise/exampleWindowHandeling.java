package practise;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

import dev.failsafe.internal.util.Assert;

public class exampleWindowHandeling {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.myhcl.com");
		driver.manage().window().maximize();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a[@href= 'https://sx.hcl.com']")).click();

		String parent = driver.getWindowHandle();

		java.util.Set<String> window = driver.getWindowHandles();

		Iterator<String> itr=window.iterator();

		while(itr.hasNext())
		{
			String chilwindow=itr.next();

			if(!parent.equals(chilwindow))
			{
				driver.switchTo().window(chilwindow);

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Child window url :" + driver.getCurrentUrl());

				driver.close();
			}


		}
		driver.switchTo().window(parent);

		String ActualTitle = driver.getTitle();

		System.out.println("parent window URL :" + ActualTitle);
		driver.close();

		String Expectedtitle = "myhcl";

	
	}


}
