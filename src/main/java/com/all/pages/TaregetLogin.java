package com.all.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TaregetLogin {

	WebDriver driver;
	
	/*----------Constructor---------*/
	public TaregetLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*----------End of Constructor---------*/
}
