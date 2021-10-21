package com.marketingcorecall.End;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingcorecall.Base.Base;
import com.marketingcorecall.pom.LogInPage;
import com.marketingcorecall.pom.MarketingCoreCall;

@Listeners(com.marketingcorecall.Utility.list.class)

public class EndToEnd extends Base {

	@BeforeTest(alwaysRun = true)

	public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}

	@Test(priority = 0, groups = { "sanity" })
	public void log() {

		LogInPage log = new LogInPage(driver);
		log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
	}

	@Test(priority = 1, groups = { "sanity" })
	public void MarketingCoreCallui() throws Throwable {

		
		  
		
		MarketingCoreCall mc = new MarketingCoreCall(driver);
		mc.MarketingCoreCallField();
		 

	}



}
