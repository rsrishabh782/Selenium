package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test (groups = {"regression"})
  public void function() {
	  

	 System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("https://www.google.com");
	  driver.close();
  }
  @Test (groups = {"regression","sanity"})
  public void function1() {
	  

	 System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("https://www.gmail.com");
	  driver.close();
  }
}
