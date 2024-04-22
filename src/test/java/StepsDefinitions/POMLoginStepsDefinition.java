package StepsDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginStepsDefinition {
	static WebDriver driver;
	
	loginPage login;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/");
	}

//	@When("User enters valid username and password")
	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_username_and_password()
	public void user_enters_valid_and(String username, String password) throws InterruptedException{
	   
		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		/*
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);	
		*/
	}

	
	@And ("Click on Login Button")
	public void click_on_login_button() {
//		driver.findElement(By.id("login-button")).click();
		login.clicklogin();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		
		login.isAppLogoDisplayed();
//		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User Navigated to Homepage");
		
		
		
	}

	@Then("Close the browser")
	public void close_the_browser() {
		   driver.quit();
	}
	

}
