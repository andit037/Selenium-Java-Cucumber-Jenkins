package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#username")
	WebElement txt_username;
	
	@FindBy(css="#password")
	WebElement txt_password;
	
	@FindBy(css="button[type='submit']")
	WebElement btn_submit;
	
	@FindBy(css="#flash")
	WebElement alertMsg;
	
	public void inputUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void submit() {
		btn_submit.click();
	}
	
	public String getTextAlert() {
		return alertMsg.getText();
	}
}
