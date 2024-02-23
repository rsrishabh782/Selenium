package practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplegetnumberofLiks {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		List<WebElement> ele = (List<WebElement>) driver.findElements(By.tagName("a"));

		System.out.println(ele.size());
		
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i =0; i<ele.size();i++)
		{
			System.out.println(ele.get(i).getText());

			data.add(ele.get(i).getAttribute("href"));

			System.out.println(ele.get(i).getAttribute("href"));
		}

		driver.close();

	}

}
