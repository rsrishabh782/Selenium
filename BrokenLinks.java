package Excel;

import java.net.HttpURLConnection;
import java.util.List;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		//driver.get("https://www.gmail.com/");

		driver.manage().window().maximize();

		List<WebElement> allinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are : " +allinks.size());


		for(int i = 0; i<=allinks.size(); i++)
		{
			WebElement wb = allinks.get(i);
			String url = wb.getAttribute("href");
			//	String url = wb.getText();
			//	System.out.println(wb.getText());
		//	System.out.println(wb.getAttribute("href"));
			verifyLinkActive(url);

		}

		driver.close();
		//driver.quit();

	}



	public static void verifyLinkActive(String linkurl) {

		try
		{
			URL url = new URL(linkurl);

			HttpURLConnection httpURlConnect = (HttpURLConnection)url.openConnection();

			httpURlConnect.setConnectTimeout(3000);
			httpURlConnect.connect();

			if(httpURlConnect.getResponseCode()==200)
			{
				System.out.println(linkurl+ "-" +httpURlConnect.getResponseMessage() );

			}

			if(httpURlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(linkurl+ "-" + httpURlConnect.getResponseMessage()+ "-" + HttpURLConnection.HTTP_NOT_FOUND );
			}

		}

		catch(Exception e)
		{

		}


	}

}
