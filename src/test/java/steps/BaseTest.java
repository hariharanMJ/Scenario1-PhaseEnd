package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {
public static WebDriver driver;
	
	@Before
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harih\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
	}
}
