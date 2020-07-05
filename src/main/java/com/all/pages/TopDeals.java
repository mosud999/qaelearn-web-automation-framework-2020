package com.all.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TopDeals {

	WebDriver driver;
	
	@FindBy(xpath="//a[@id='account']//span[@class='ArrowSprite-w7d9ld-0 cWRlFD h-padding-l-tiny']//*[local-name()='svg']")
	WebElement topDealsSignInDropDownIcon;
	
	@FindBy(xpath="//li[@id='accountNav-signIn']//a[@class='Link-sc-1khjl8b-0 NavigationLink-kfyxgv-0 giDkbS']")
	WebElement topDealsSignInBtn;
	
	
	/*----------Constructor---------*/
	public TopDeals(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*----------End of Constructor---------*/
	
	
	public void verifyTopDealsPage() {
		String expectedUrlOfTopDealsPage = "https://www.target.com/c/top-deals/-/N-4xw74?lnk=dNav_topdeals";
		String actualUrlOfTopDealsPage = driver.getCurrentUrl();
		Assert.assertEquals(actualUrlOfTopDealsPage, expectedUrlOfTopDealsPage);
	}
	
	
	public void clickOnSignInDropDownIcon() throws InterruptedException {
		topDealsSignInDropDownIcon.click();
		Thread.sleep(3000l);
	}
	
	public TaregetLogin clickOnSignInBtn() throws InterruptedException {
		com.utilities.SharedMethods.clickOnElement(topDealsSignInBtn, driver, 2);
		Thread.sleep(3000l);
		return new TaregetLogin(driver);
	}
	
}
