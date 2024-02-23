package practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampledimension {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Dimension dim = new Dimension(150, 150);
		driver.manage().window().setSize(dim);
	}

}
