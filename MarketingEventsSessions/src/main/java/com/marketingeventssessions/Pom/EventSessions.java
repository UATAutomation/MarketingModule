package com.marketingeventssessions.Pom;

import java.util.List;
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




public class EventSessions extends Base{
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public EventSessions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//span[contains(text(),'04')]")
	  WebElement endmin;
	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Marketing']")
	  WebElement Marketing;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Events']")
	WebElement Events;
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement Title;
	@FindBy(xpath = "(//app-hours[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1])[1]")
	WebElement StartHours;
	@FindBy(xpath = "//html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	WebElement searchStartHours;
	
	@FindBy(xpath = "(//app-minutes[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1])[1]")
	WebElement StartMinutes;
	@FindBy(xpath = "//div//input[@placeholder='End Date']")
	WebElement EndDate;
	
	@FindBy(xpath = "//div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	WebElement searchPartnerclick;
	@FindBy(xpath = "//*[@placeholder='Category']//span[text()='Category']")
	WebElement Category;
	@FindBy(xpath = "//*[@name='categoryFilter']//input[@aria-label='dropdown search']")
	WebElement categoryFilter;
	@FindBy(xpath = "//*[@placeholder='Institution']//span[text()='Institution']")
	WebElement institution;
	@FindBy(xpath = "//*[@name='instituteFilter']//input[@aria-label='dropdown search']")
	WebElement searchinstitution;
	@FindBy(xpath = "//div//mat-select[@placeholder='Session/Branding']")
	WebElement SessionBranding;
	@FindBy(xpath = "//span[text()='Session']")
	WebElement Session;
	@FindBy(xpath = "//div//input[@placeholder='Start Date']")
	WebElement StartDate;
	@FindBy(xpath = "//mat-tab-body/div[1]/div[1]/div[2]/div[5]/app-hours[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	WebElement EndHours;
	@FindBy(xpath = "(//app-minutes[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1])[2]")
	WebElement EndMinutes;
	@FindBy(xpath = "//button[text()='ADD']")
	WebElement Add;
	@FindBy(xpath = "//button//span[text()='ADD']")
	WebElement Add2;
	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement Add3;
	@FindBy(xpath = "//div//input[@placeholder='Contact Number']")
	WebElement ContactNumber;
	@FindBy(xpath = "//div//input[@placeholder='Email ID']")
	WebElement EmailID;
	@FindBy(xpath = "//div//input[@placeholder='Designation']")
	WebElement Designation;

	@FindBy(xpath = "//input[@placeholder='Agent Company Name']")
	WebElement Agent;
	@FindBy(xpath = "//div//input[@placeholder='Primary Contact Name']")
	WebElement ContactName;
	@FindBy(xpath = "//*[@placeholder='Country']//span[text()='Country']")
	WebElement Country;
	@FindBy(xpath = "//*[@name='cntyFilter']//input[@aria-label='dropdown search']")
	WebElement cntyFilter;

	@FindBy(xpath = "//*[@placeholder='Province']//span[text()='Province']")
	WebElement Province;
	@FindBy(xpath = "//div//input[@placeholder='City/Town']")
	WebElement cityTown;
	@FindBy(xpath = "//*[@name='provinceFilter']//input[@aria-label='dropdown search']")
	WebElement provinceFilter;

	@FindBy(xpath = "//div//input[@placeholder='Student Name']")
	WebElement StudenName;
	
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	
	@FindBy(xpath = "//p[text()=' Account ']")
	WebElement account;
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logout;
	
	    
	public void EventSessionsField() throws Throwable 
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
			
			
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);

			Title.sendKeys(prop.getProperty("tit"));
			Thread.sleep(3000);
			Category.click();
			
			Thread.sleep(3000);
			
			System.out.println("==============");
			System.out.println("Elements present in Category Field ");

			List<WebElement> listi = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement listsi : listi) 
			{
			System.out.println(listsi.getText());
				}
			categoryFilter.sendKeys("admission day");
			Thread.sleep(3000);
			categoryFilter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			System.out.println("==============");
			System.out.println("Elements present in SessionBranding Field ");

			SessionBranding.click();
			Thread.sleep(3000);
			
			
			List<WebElement> list = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement lists : list) 
			{
			System.out.println(lists.getText());
				}
			Session.click();
			Thread.sleep(3000);
            a.moveToElement(StartDate).build().perform();
            Thread.sleep(3000);
			
			StartDate.sendKeys(prop.getProperty("sd"));
			Thread.sleep(3000);
			
			a.moveToElement(StartHours).build().perform();
			Thread.sleep(3000);
			StartHours.click();
			Thread.sleep(3000);
			searchStartHours.click();
			Thread.sleep(3000);
			
			a.moveToElement(StartMinutes).build().perform();
			Thread.sleep(3000);
			StartMinutes.click();
			Thread.sleep(3000);
			searchStartHours.click();
			Thread.sleep(3000);
			
			a.moveToElement(EndDate).build().perform();
			Thread.sleep(3000);
			EndDate.sendKeys(prop.getProperty("ed"));
			Thread.sleep(3000);
		
			a.moveToElement(EndHours).build().perform();
			Thread.sleep(3000);
			EndHours.click();
			Thread.sleep(3000);
			searchStartHours.click();
			Thread.sleep(3000);
			
			a.moveToElement(EndMinutes).build().perform();
			Thread.sleep(3000);
			EndMinutes.click();
			Thread.sleep(3000);
			endmin.click();
			Thread.sleep(3000);
			
			
			System.out.println("==============");
			System.out.println("Elements present in New Agent ");
			exi.executeScript("arguments[0].scrollIntoView();",Agent );
		    Thread.sleep(3000);
			a.moveToElement(Agent).build().perform();
			Thread.sleep(3000);
			Agent.sendKeys(prop.getProperty("Ag"));
			Thread.sleep(3000);
			ContactName.sendKeys(prop.getProperty("cn"));
			Thread.sleep(3000);
			Designation.sendKeys(prop.getProperty("Des"));
			Thread.sleep(3000);
			
			ContactNumber.sendKeys(prop.getProperty("Cnu"));
			Thread.sleep(3000);
			EmailID.sendKeys(prop.getProperty("ei"));
			Thread.sleep(3000);
			
			
			Country.click();
			Thread.sleep(3000);
			cntyFilter.sendKeys(prop.getProperty("couf"));
			Thread.sleep(3000);
			searchPartnerclick.click();
			Thread.sleep(3000);
			

			Province.click(); 
			Thread.sleep(3000);
			provinceFilter.sendKeys(prop.getProperty("pf"));
			Thread.sleep(3000);
			searchPartnerclick.click();
			Thread.sleep(3000);
			
			cityTown.sendKeys(prop.getProperty("cit"));
			Thread.sleep(3000);
			a.moveToElement(StudenName).build().perform();
			Thread.sleep(3000);
			StudenName.sendKeys(prop.getProperty("stn"));
			Thread.sleep(3000);
			Add.click();
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",institution );
		    Thread.sleep(3000);
			a.moveToElement(institution).build().perform();
			Thread.sleep(3000);
			institution.click();
			Thread.sleep(3000);
			a.moveToElement(searchinstitution).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			searchinstitution.sendKeys(prop.getProperty("si"));
			
			Thread.sleep(3000);
			searchinstitution.sendKeys(Keys.ENTER);
		    Add2.click();
			Thread.sleep(3000);
			a.moveToElement(Add3).build().perform();
			Thread.sleep(3000);
			Add3.click();
			
			 exi.executeScript("arguments[0].scrollIntoView();",account );
			 account.click();
			 Thread.sleep(3000);	
			 logout.click();
			
			
			
			
			
			
		
			
			
			
}
}
