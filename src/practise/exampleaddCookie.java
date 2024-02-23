package practise;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleaddCookie {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Cookie cookie = new Cookie("customer cookie", "12345");
		
		driver.manage().addCookie(cookie);
		driver.manage().deleteCookieNamed("sameSite");
		driver.manage().deleteAllCookies();
		
		
		Set<Cookie> cook = driver.manage().getCookies();
		
		for(Cookie cookies:cook)
		{
			System.out.println(cookies);
		}
		
		driver.close();
			
	}
}
