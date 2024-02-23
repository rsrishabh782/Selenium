package practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class exampleGetScreenshot {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("wendriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		TakesScreenshot takescree=((TakesScreenshot)driver);

		File src = takescree.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\RISHABH SRIVASTAVA\\eclipse-workspace\\Selenium\\Screenshot\\pic.png");

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//File dest = new File("C:\\Users\\RISHABH SRIVASTAVA\\eclipse-workspace\\Selenium\\Screenshot\\pic.png");

		/*
		File fi = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(fi, new File("C:\\Users\\RISHABH SRIVASTAVA\\eclipse-workspace\\Selenium\\Screenshot\\pic1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.close();
	}

}
