  package com.selenium.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	WebDriver driver;
	public SeleniumPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath ="(//*[@class='authorization-link']")//1 of 2
	private List <WebElement> signinBtn;// findElements()<== new
	@FindBy(xpath ="//*[@id='email']")
	private WebElement email;//findElement()
	@FindBy(xpath ="//*[@title='Password']")
	private WebElement password;
	@FindBy(xpath ="//*[@class='action login primary']")
	private WebElement secondsigninBtn;
	
	public List<WebElement> getSigninBtn() {
		return signinBtn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSecondsigninBtn() {
		return secondsigninBtn;
	}
	
	
	
	
}
//https://magento.softwaretestingboard.com/