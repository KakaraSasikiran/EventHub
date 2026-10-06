package org.eventhub;

import org.eventhub.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EventHub {

	public WebDriver driver;
	public Login login;
	@BeforeSuite
	public void init() {
		driver = new ChromeDriver();
		driver.get("https://eventhub.rahulshettyacademy.com/login");
		driver.manage().window().maximize();
		login = new Login(driver);
	}
	
	@Test
	public void login() throws Exception {
		login.login("admin@gmail.com","Admin@12345");
	}
}
