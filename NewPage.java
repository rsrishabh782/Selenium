package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Excel.HighlightFileld;

public class NewPage {

	WebDriver driver;
	
	public NewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement username;
	
	
	@FindBy(how=How.ID, using="pass")
	WebElement Pass;
	
	@FindBy(how=How.XPATH, using=".//*[@id='loginbutton']")
	WebElement Button;
	
	
	public void login(String uid, String password)
	{
		username.sendKeys(uid);
		HighlightFileld.color(driver, username);

		Pass.sendKeys(password);
		HighlightFileld.color(driver, Pass);

		Button.click();
		
		HighlightFileld.color(driver, Button);

		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
}
