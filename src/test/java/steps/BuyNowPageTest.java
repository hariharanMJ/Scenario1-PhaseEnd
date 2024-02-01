package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static steps.BaseTest.driver;
public class BuyNowPageTest {
	@Given("User launches the Star Health application with {string}")
	public void user_launches_the_star_health_application_with(String string) {
	   driver.get(string);
	   
	
	}

	@Then("User waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it(){
		System.out.println("Star Health");
	   
	}

	@Then("User get home page title and Validates it")
	public void user_get_home_page_title_and_validates_it() {
		String actualtitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		driver.navigate().to("https://www.starhealth.in/");
		String expectedtitle = driver.getTitle();
		System.out.println(expectedtitle);
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("Assertion was passed");
		

	}

	@Then("User clicks on the Buy Now button")
	public void user_clicks_on_the_buy_now_button() throws InterruptedException {
	   WebElement buynowBtn = driver.findElement(By.xpath("//span[normalize-space()='Buy Now']"));
	   buynowBtn.click();
	   Thread.sleep(3000);
	}

	@Then("User Enters data for  {string},{string},{string},{string}")
	public void user_enters_data_for(String string, String string2, String string3, String string4) throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement e2 = driver.findElement(By.xpath("//input[@id='mobile']"));
		WebElement e3 = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement e4 = driver.findElement(By.xpath("//input[@id='zipcode']"));
		
		e1.sendKeys(string);
		e2.sendKeys(string2);
		e3.sendKeys(string3);
		e4.sendKeys(string4);
		
		Thread.sleep(2000);
	}

	@Then("User click on getstarted button")
	public void user_click_on_getstarted_button() throws InterruptedException {
	    WebElement Getstarted = driver.findElement(By.xpath("//div[@class='pagesection_main-card-section__mUT4i relative']/descendant::button"));
	    Getstarted.click();
	    Thread.sleep(2500);
	}

	@Then("User select the checkbox for myself")
	public void user_select_the_checkbox_for_myself() throws InterruptedException {
		WebElement mycheckbox = driver.findElement(By.xpath("(//input[@id='myself'])[1]"));
		mycheckbox.click();
		Thread.sleep(2500);

	  
	}

	@Then("user navigates to the HomePage with {string}")
	public void user_navigates_to_the_home_page_with(String string) throws InterruptedException {
		driver.get(string);
		Thread.sleep(2500);
	}
}
