package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void Checkvaliduser()
	{
		WebDriver driver = Browser.Browsebrowser("chrome", "https://www.facebook.com/");
		NewPage login_page =  PageFactory.initElements(driver, NewPage.class);
		login_page.login("rsrishabhsrivastava", "******");
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		String str = driver.findElement(By.xpath(".//*[@id='navItem_100001756249161']/a/div")).getText();
		
		System.out.println(str);
		
		
		
		String expected = "Rishabh Shrivastava";
		
		
		assertEquals(str, expected);
		
		{
			System.out.println("Pass");
		}
		
		WebElement we = driver.findElement(By.id("pageLoginAnchor"));
		
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		action.moveToElement(we).click();
		
//		WebElement we1	= driver.findElement(By.xpath(".//*[@id='js_11w']/div/div/ul/li[12]/a/span/span"));
//		
//		action.moveToElement(we1).build().perform();
//		action.moveToElement(we1).click();
//		driver.close();

	}
}
