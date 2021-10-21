package com.marketingeventsbranding.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingeventsbranding.base.Base;
import com.marketingeventsbranding.pom.LogInPage;
import com.marketingeventsbranding.pom.MarketingEventsBrandingLoc;


@Listeners(com.marketingeventsbranding.itestlistener.ListenerClass.class)
public class EndToEndTest extends Base
{
	@BeforeTest(alwaysRun = true)
	public void BrowserFirst() throws Throwable
	{
		try 
		{
		Base base=new Base();
		base.initialization();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 0, groups = { "smoke" })
	public void login()
	{
		try 
		{
			LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 1, groups = { "regration" })
	public void MarketingEventsBrandingClass() 
	{
		try 
		{
			MarketingEventsBrandingLoc meb=new MarketingEventsBrandingLoc(driver);
			meb.MarketingEventsBrandingField();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
			
			
		}
	}	
	
}
	
