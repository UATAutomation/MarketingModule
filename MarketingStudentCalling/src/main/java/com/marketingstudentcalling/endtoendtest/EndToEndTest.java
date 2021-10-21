package com.marketingstudentcalling.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingstudentcalling.base.Base;
import com.marketingstudentcalling.pom.LogInPage;
import com.marketingstudentcalling.pom.StudentCalling;

@Listeners(com.marketingstudentcalling.itestlistener.list.class)

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
	public void AddingStudentCalling() 
	{
		try 
		{
			StudentCalling sc = new StudentCalling(driver);
			sc.AddStudentCalling();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
}