package com.marketingquery.Pom;

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

import com.marketingquery.Base.Base;
import com.marketingquery.Utility.UtilityFile;

public class MarketingQuery extends Base {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public MarketingQuery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Marketing']")
	  WebElement Marketing;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Query']")
	WebElement Query;
	@FindBy(xpath = "//input[@placeholder='Agent/Student Name']")
	WebElement AgentStudentName;
	
	@FindBy(xpath = "//mat-select[@name='institution']")
	WebElement institution;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement searchinstitution;
	
	@FindBy(xpath = "//div//input[@placeholder='Activity Date']")
	WebElement ActivityDate;
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[@name='CallingReson']")
	WebElement query;
	
	@FindBy(xpath = "//span[contains(text(),'Mode of Communication')]")
    WebElement Communication;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement ComnicatinFilter;

	@FindBy(xpath = "//textarea[@name='Description']")
	WebElement Description;
	@FindBy(xpath = "//textarea[@name='FutureScope']")
	WebElement FutureScope;
	@FindBy(xpath = "//input[@aria-label='dropdown search'] ")
	WebElement CallDonefilter;
	@FindBy(xpath = "(//div[@class='mat-radio-container'])[1]")
	WebElement resolved;
	
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	
	@FindBy(xpath = "//p[text()=' Account ']")
	WebElement account;
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logout;
	@FindBy(xpath = "//mat-icon[contains(text(),'filter_list')]")
	WebElement nexttab;
	@FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	    
	public void MarketingQueryField() throws Throwable 
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
			exi.executeScript("arguments[0].scrollIntoView();",Query );
			Thread.sleep(3000);
			Assert.assertEquals(true, Query.isDisplayed());
			System.out.println("Query Tab Is Visible");
			
			
			Query.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			 String qexpected="Query";
			 String qactual=driver.findElement(By.xpath("(//span[text()='Query'])[2]")).getText();
			 Assert.assertEquals(qactual, qexpected);	
			 System.out.println("Enter In Query grid Page");
			
			
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);


			ActivityDate.sendKeys(prop.getProperty("date"));
			Thread.sleep(3000);  
			
			
			institution.click();
			Thread.sleep(3000);
			searchinstitution.sendKeys(prop.getProperty("insti"));
			Thread.sleep(3000);
			searchinstitution.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			AgentStudentName.sendKeys(prop.getProperty("asname"));
			Thread.sleep(3000);
			
			a.moveToElement(resolved).build().perform();
			Thread.sleep(3000);
			resolved.click(); 
			Thread.sleep(3000);
			 
			
			System.out.println("==============");
			System.out.println("Elements present in Communication Field ");

			Communication.click();
			Thread.sleep(3000);
			
			List<WebElement> listi = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement listsi : listi) 
			{
			System.out.println(listsi.getText());
				}
			
			
			ComnicatinFilter.sendKeys(prop.getProperty("cf"));
			Thread.sleep(3000);
			ComnicatinFilter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			query.sendKeys(prop.getProperty("qur"));
	        Thread.sleep(3000);
			
	        a.moveToElement(Description).build().perform();
            Thread.sleep(3000);
	        Description.sendKeys(prop.getProperty("des")); 
			Thread.sleep(3000);
			
			
			a.moveToElement(FutureScope).build().perform();
            Thread.sleep(3000);
            FutureScope.sendKeys(prop.getProperty("fs"));
			Thread.sleep(3000);
		    Add.click();
		    
		    Thread.sleep(3000);
		    nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
            searchtab.sendKeys(prop.getProperty("stab"));
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
		    
		    exi.executeScript("arguments[0].scrollIntoView();",account );
			account.click();
			Thread.sleep(3000);	
			logout.click();
			
			
			
			
			
			
		
			
			
			
}
}
