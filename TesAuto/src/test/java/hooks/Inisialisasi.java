package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import factory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Inisialisasi {
	
	WebDriver driver;
	
	@Before
	public void setupBrower() {
		DriverManager.initializeBrowser("chrome");
		driver = DriverManager.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
