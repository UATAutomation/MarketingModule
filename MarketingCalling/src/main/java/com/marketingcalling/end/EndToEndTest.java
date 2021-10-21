package com.marketingcalling.end;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingcalling.base.Base;
import com.marketingcalling.pom.LogInPage;
import com.marketingcalling.pom.MarketCalling;


@Listeners(com.marketingcalling.itest.list.class)

public class EndToEndTest extends Base {

	@BeforeTest(alwaysRun = true)

	public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}


	@Test(priority = 0, groups = { "smoke" })
	public void login() throws Throwable {

		LogInPage log1 = new LogInPage(driver);
		log1.Logdata(prop.getProperty("email"), prop.getProperty("pass"));

	}

	@Test(priority = 1, groups = { "smoke" })
	public void MarketCallingui() throws Throwable {

		
		  MarketCalling mc = new MarketCalling(driver); 
		  mc.MarketCallingfield();;
		 
	}
}