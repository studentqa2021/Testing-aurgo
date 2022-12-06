package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LumaLoginFunction {

	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to(Constants.URL);
		SeleniumPageFactory pf = new SeleniumPageFactory(driver);
		//click sign in
		pf.getSigninBtn().get(0).click();
		//put user
		pf.getEmail().click();
		pf.getEmail().sendKeys(Constants.user);
		//put pass
		pf.getPassword().click();
		pf.getPassword().sendKeys(Constants.passWord);
		//click second sign in
		pf.getSecondsigninBtn().click();
		
	}
	
	
}
