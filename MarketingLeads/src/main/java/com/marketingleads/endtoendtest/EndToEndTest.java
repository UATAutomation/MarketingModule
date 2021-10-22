package com.marketingleads.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingleads.base.Base;
import com.marketingleads.pom.Leads;
import com.marketingleads.pom.LogInPage;

@Listeners(com.marketingleads.itestlistener.list.class)

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
	public void LeadsFieldData() 
	{
		try 
		{
			Leads bwc = new Leads(driver);
			bwc.LeadsField();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
}