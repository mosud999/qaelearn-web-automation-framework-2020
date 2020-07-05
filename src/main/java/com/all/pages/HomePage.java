package com.all.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath="//span[@class='sc-AxjAm gpxuTj']")
	WebElement logo;
	
	@FindBy(xpath="//a[@id='secondary']//span[@class='ArrowSprite-w7d9ld-0 cWRlFD h-padding-l-tiny']//*[local-name()='svg']")
	WebElement deals;
	
	@FindBy(xpath="//div[@class='Row-uds8za-0 iFzQdH'][contains(text(),'Top Deals')]")
	WebElement topDeals;
	
	
	/*----------Constructor---------*/
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}/*----------End of Constructor---------*/

	public void verifyHomepage() {
		String expectedHomePageUrl = "https://www.target.com/";
		String actualHomepageUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualHomepageUrl, expectedHomePageUrl);
	}
	
	public void verifyLogo() {
		Assert.assertTrue(logo.isDisplayed());
	}
	
	public TopDeals clickOnTopDealsSection() throws InterruptedException {
		deals.click();
		Thread.sleep(3000l);
		topDeals.click();
		return new TopDeals(driver);
	}


}
