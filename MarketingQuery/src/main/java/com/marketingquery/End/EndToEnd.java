package com.marketingquery.End;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingquery.Base.Base;
import com.marketingquery.Pom.LogInPage;
import com.marketingquery.Pom.MarketingQuery;

@Listeners(com.marketingquery.Utility.list.class)

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
	public void MarketingQueryui() throws Throwable {

		
		MarketingQuery mq = new MarketingQuery(driver);
		mq.MarketingQueryField();
		 

	}



}
