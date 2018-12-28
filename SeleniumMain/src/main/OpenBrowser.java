package main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Created by IgorG 12/27/18
public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:/Workplace/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.quit();
	}
}