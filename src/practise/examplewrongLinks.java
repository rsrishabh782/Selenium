package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplewrongLinks {

	
	public static void brokenLink(String url)
	{

		try {

			URL link = new URL(url);

			HttpURLConnection httpconnection = (HttpURLConnection)link.openConnection();

			httpconnection.setConnectTimeout(5000);
			httpconnection.connect();

			if(httpconnection.getResponseCode()==200)
			{
				System.out.println( url+ "-" + httpconnection.getResponseMessage());
			}

			else
			{
				System.out.println( url+ "-" + httpconnection.getResponseMessage()+ "-" + "is a broken link");

			}
		}
		catch(Exception e)
		{

		}
	}

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();

		List<WebElement> link = (List<WebElement>) driver.findElements(By.tagName("a"));

		System.out.println(link.size());

		//ArrayList<String> list = new ArrayList<String>();

		for(int i=0; i<link.size(); i++)
		{
			System.out.println(link.get(i).getText());

			//list.add(link.get(i).getAttribute("href"));

			//System.out.println(link.get(i).getAttribute("href"));
			
			WebElement e1 = link.get(i);
			String url = e1.getAttribute("href");
            
			brokenLink(url);
		}
		
	
		driver.close();
	}

}
