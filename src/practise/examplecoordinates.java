package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplecoordinates {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Dimension dim = new Dimension(150, 150);
		driver.manage().window().setSize(dim);

		WebElement ele = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

		Point point = ele.getLocation();

		System.out.println(point.getX());
		System.out.println(point.getY());

	}

}
