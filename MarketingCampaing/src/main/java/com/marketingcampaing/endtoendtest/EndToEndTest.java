package com.marketingcampaing.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingcampaing.base.Base;
import com.marketingcampaing.pom.Campaigns;
import com.marketingcampaing.pom.LogInPage;

@Listeners(com.marketingcampaing.itestlistener.list.class)

public class EndToEndTest extends Base 
{
	@BeforeTest(alwaysRun = true)
	public void intibase() 
	{
		try 
		{
			Base base = new Base();
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
			LogInPage log1 = new LogInPage(driver);
			log1.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 1, groups = { "regration" })
	public void CampaignsFieldData() 
	{
		try 
		{
			Campaigns bwc = new Campaigns(driver);
			bwc.CampaignsField();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
}