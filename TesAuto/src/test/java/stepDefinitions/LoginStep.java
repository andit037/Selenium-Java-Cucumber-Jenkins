package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.loginPage;
import io.cucumber.java.en.Then;

public class LoginStep {
	
	//https://the-internet.herokuapp.com/login
	WebDriverWait wait;
	WebDriver driver;
	loginPage LP;
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    driver = DriverManager.getDriver();
	    driver.navigate().to("https://the-internet.herokuapp.com/login");
	}

	@When("^I insert (.*) and (.*)$")
	public void i_insert_tomsmith_and_super_secret_password(String username, String password) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#username")));
		
	    LP = new loginPage(driver);
	    LP.inputUsername(username);
	    LP.inputPassword(password);
	    LP.submit();
	}

	@Then("^I should see a message (.*)$")
	public void i_should_see_a_message_you_logged_into_a_secure_area(String message) {
	    Assert.assertTrue((LP.getTextAlert()).contains(message));
	}

}
