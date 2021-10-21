package com.marketingmarketingcalling.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingmarketingcalling.base.Base;
import com.marketingmarketingcalling.pom.LogInPage;
import com.marketingmarketingcalling.pom.MarketingCalling;

@Listeners(com.marketingmarketingcalling.itestlistener.list.class)

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
	public void AddingMarketingCalling() 
	{
		try 
		{
			MarketingCalling cc = new MarketingCalling(driver);
			cc.MarketingCallingAdd();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2, groups = { "regration" })
	public void CheckedCheckedAllInstitutionsData() 
	{
		try 
		{
			MarketingCalling ecc = new MarketingCalling(driver);
			ecc.CheckedAllInstitutions();	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3, groups = { "regration" })
	public void UpdateMarketingCallingFields() 
	{
		try 
		{
			MarketingCalling ucc = new MarketingCalling(driver);
			ucc.UpdateMarketingCalling();	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}