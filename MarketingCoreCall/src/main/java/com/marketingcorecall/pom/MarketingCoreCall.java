package com.marketingcorecall.pom;

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

import com.marketingcorecall.Base.Base;
import com.marketingcorecall.Utility.UtilityFile;





public class MarketingCoreCall extends Base {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public MarketingCoreCall(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Marketing']")
	  WebElement Marketing;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Core Call']")
	WebElement CoreCall;
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement Title;
	
	@FindBy(xpath = "//*[@name='institution']/div/div/div[2]")
	WebElement institution;
	@FindBy(xpath = "//form[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement searchinstitution;
	
	@FindBy(xpath = "//form[1]/div[2]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement searchinstitution2;
	
	
	@FindBy(xpath = "//div//input[@placeholder='Activity Date']")
	WebElement ActivityDate;
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement Add;
	@FindBy(xpath = "//div//input[@placeholder='Topic']")
	WebElement Topic;
	
	@FindBy(xpath = "//span[contains(text(),'Mode Of Communication')]")
	WebElement Communication;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement ComnicatinFilter;

	@FindBy(xpath = "//textarea[@name='Description']")
	WebElement Description;
	@FindBy(xpath = "//div//input[@placeholder='City/Town']")
	WebElement cityTown;
	@FindBy(xpath = "//input[@aria-label='dropdown search'] ")
	WebElement CallDonefilter;

	@FindBy(xpath = "//span[contains(text(),'Call Done By')]")
	WebElement CallDoneBy;
	
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	
	@FindBy(xpath = "//p[text()=' Account ']")
	WebElement account;
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logout;
	@FindBy(xpath = "//mat-icon[contains(text(),'filter_list')]")
	WebElement nexttab;
	@FindBy(xpath = "//tbody/tr[2]/td[6]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	    
	public void MarketingCoreCallField() throws Throwable 
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
			exi.executeScript("arguments[0].scrollIntoView();",CoreCall );
			Thread.sleep(3000);
			Assert.assertEquals(true, CoreCall.isDisplayed());
			System.out.println("CoreCall Tab Is Visible");
			
			
			CoreCall.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			 String cexpected="Core Call";
			 String cactual=driver.findElement(By.xpath("(//span[text()='Core Call'])[2]")).getText();
			 Assert.assertEquals(cactual, cexpected);	
			 System.out.println("Enter In CoreCall grid Page");
			
			
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);

			
			institution.click();
			Thread.sleep(3000);
			searchinstitution.sendKeys(prop.getProperty("si"));
			Thread.sleep(3000);
			searchinstitution.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
			institution.click();
			Thread.sleep(3000);
			searchinstitution2.sendKeys(prop.getProperty("si2"));
			Thread.sleep(3000);
			searchinstitution2.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
		    
			
			ActivityDate.sendKeys(prop.getProperty("ad"));
			Thread.sleep(3000);
			
			Topic.sendKeys(prop.getProperty("tp"));
			Thread.sleep(3000);
			                        
			CallDoneBy.click();
			Thread.sleep(3000);
	        CallDonefilter.sendKeys(prop.getProperty("cdf"));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
			CallDonefilter.sendKeys(Keys.ENTER);
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
			
			a.moveToElement(Description).build().perform();
            Thread.sleep(3000);
            
	        Description.sendKeys(prop.getProperty("des"));
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
		    Add.click();
		    Thread.sleep(3000);
		    nexttab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
            searchtab.sendKeys(prop.getProperty("st"));
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
		    
		    exi.executeScript("arguments[0].scrollIntoView();",account );
			account.click();
			Thread.sleep(3000);	
			logout.click();
			
			
			
			
			
			
		
			
			
			
}
}
