package com.marketingeventssessions.Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.marketingeventssessions.Base.Base;
import com.marketingeventssessions.Utility.UtilityFile;

public class UpdateEventSessions extends Base {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public UpdateEventSessions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Marketing']")
	  WebElement Marketing;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Events']")
	WebElement Events;
	@FindBy(xpath = "//mat-icon[contains(text(),'filter_list')]")
	WebElement nexttab;
	@FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	@FindBy(xpath = "//div[1]/div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement edittab;
	
	@FindBy(xpath = "//div/div[text()='Participants']")
	WebElement Participants;
	@FindBy(xpath = "//div[contains(text(),'Attendees')]")
	WebElement Attendees;
	@FindBy(xpath = "//mat-icon[contains(text(),'add')]")
	WebElement add;
	
	@FindBy(xpath = "//span[contains(text(),'Participant')]")
	WebElement Partitab;
	@FindBy(xpath = "//span[contains(text(),'Attendee')]")
	WebElement Attetab;
	
	@FindBy(xpath = "//*[contains(@name,'attendFilter')]//input[@aria-label='dropdown search']")
	WebElement attendFilter;
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement Add;
	
    
public void UpdateEventSessionsField() throws Throwable 
{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		exi=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver,30);
		a = new Actions(driver);
		
		 String dexpected="Dashboard";
		 String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
		 Assert.assertEquals(dactual, dexpected);	
		 System.out.println("Enter In Dashboard Page");
	
		
		
		exi.executeScript("arguments[0].scrollIntoView();",Marketing );
	    Thread.sleep(3000);
			
		Assert.assertEquals(true, Marketing.isDisplayed());
		System.out.println("Marketing Tab Is Visible");
		
		Marketing.click();
		Thread.sleep(3000);
		exi.executeScript("arguments[0].scrollIntoView();",Events );
		Thread.sleep(3000);
		Assert.assertEquals(true, Events.isDisplayed());
		System.out.println("Notifications Tab Is Visible");
		
		
		Events.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		
		 String eexpected="Events";
		 String eactual=driver.findElement(By.xpath("(//span[text()='Events'])[2]")).getText();
		 Assert.assertEquals(eactual, eexpected);	
		 System.out.println("Enter In Events grid Page");
		

			nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

			searchtab.sendKeys(prop.getProperty("si"));
			Thread.sleep(3000);
			a.moveToElement(edittab).build().perform();
			Thread.sleep(3000);
			edittab.click();
			
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",Participants );
			Thread.sleep(3000);
			Participants.click();
			Thread.sleep(3000);
			add.click();
			Thread.sleep(3000);
			Partitab.click();
			Thread.sleep(3000);
			attendFilter.sendKeys(prop.getProperty("upnm"));
			Thread.sleep(3000);
			attendFilter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			Add.click();
			
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",Attendees );
			Thread.sleep(3000);
			Attendees.click();
			Thread.sleep(3000);          
			add.click();
			Thread.sleep(3000);
			Attetab.click();
			Thread.sleep(3000);
			attendFilter.sendKeys(prop.getProperty("upaf"));
			Thread.sleep(3000);
			attendFilter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			Add.click();
			
}
}