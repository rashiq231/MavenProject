package testingMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public static void main1() {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.edge.driver", "C:\\Users\\Rashiq\\eclipse-workspace\\edge\\MicrosoftWebDriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
	}

}
