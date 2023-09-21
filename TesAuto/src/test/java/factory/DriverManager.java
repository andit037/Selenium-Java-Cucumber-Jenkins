package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	static WebDriver driver = null;
	
	public static void initializeBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("headless");
			driver = new ChromeDriver(opt);
		}else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
