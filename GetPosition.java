package Excel;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetPosition {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement wb = driver.findElement(By.partialLinkText("Gmail"));
		Point point = wb.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		System.out.println(xcord + ", " + ycord);
		//System.out.println(driver.manage().window().getPosition().getY());
		driver.close();
		//Select se = new Select(wb);
	}

}
