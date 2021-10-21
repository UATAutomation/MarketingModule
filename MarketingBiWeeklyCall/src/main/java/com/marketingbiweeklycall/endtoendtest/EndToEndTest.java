package com.marketingbiweeklycall.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingbiweeklycall.base.Base;
import com.marketingbiweeklycall.pom.BiWeeklyCall;
import com.marketingbiweeklycall.pom.LogInPage;

@Listeners(com.marketingbiweeklycall.itestlistener.list.class)

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
	public void CreateBiWeeklyCall() 
	{
		try 
		{
			BiWeeklyCall bwc = new BiWeeklyCall(driver);
			bwc.BiWeeklyCallField();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2, groups = { "regration" })
	public void UpdateBiWeeklyCall() 
	{
		try 
		{
			BiWeeklyCall ubwc = new BiWeeklyCall(driver);
			ubwc.UpdateBiWeeklyCallField();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
}