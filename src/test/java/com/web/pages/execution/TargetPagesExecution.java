package com.web.pages.execution;




import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.all.pages.HomePage;
import com.all.pages.TaregetLogin;
import com.all.pages.TopDeals;
import com.browser.setup.BaseClass;

public class TargetPagesExecution extends BaseClass{

	@Test
	public void targetAllPageExecution() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomepage();
		homePage.verifyLogo();
		TopDeals topDeals = homePage.clickOnTopDealsSection();
		topDeals.verifyTopDealsPage();
		topDeals.clickOnSignInDropDownIcon();
		TaregetLogin taregetLogin = topDeals.clickOnSignInBtn();

	}
}
