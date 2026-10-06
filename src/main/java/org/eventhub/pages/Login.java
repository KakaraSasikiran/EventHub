package org.eventhub.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath ="//button[@id='login-btn']")
	private WebElement btn;
	
	public void login(String emailId,String passcode) {
		email.sendKeys(emailId);
		password.sendKeys(passcode);
		btn.click();
	}
}
