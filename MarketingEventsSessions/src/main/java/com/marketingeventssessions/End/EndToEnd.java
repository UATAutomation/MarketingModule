package com.marketingeventssessions.End;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marketingeventssessions.Base.Base;
import com.marketingeventssessions.Pom.EventSessions;
import com.marketingeventssessions.Pom.LogInPage;
import com.marketingeventssessions.Pom.UpdateEventSessions;

@Listeners(com.marketingeventssessions.Utility.list.class)

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
	public void EventSessionsui() throws Throwable {

		
		  
		  EventSessions es = new EventSessions(driver);
		  es.EventSessionsField();
		 

	}

	@Test(priority = 2, groups = { "smoke" })
	public void login() {

		LogInPage log1 = new LogInPage(driver);
		log1.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
	}

	@Test(priority = 3, groups = { "smoke" })
	public void UpdateEventSessionsui() throws Throwable {

		UpdateEventSessions ues = new UpdateEventSessions(driver);
		ues.UpdateEventSessionsField();
		

	}

}
