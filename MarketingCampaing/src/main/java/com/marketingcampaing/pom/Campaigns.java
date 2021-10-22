package com.marketingcampaing.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.marketingcampaing.base.Base;
import com.marketingcampaing.utility.UtilityFile;


public class Campaigns extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public Campaigns(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Marketing']")
	WebElement marketing;
	@FindBy(xpath = "//span[text()='Campaigns']")
	WebElement campaing;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//input[@name='CampaignName']")
	WebElement name;
	@FindBy(xpath = "//*[@name='CampaignType']//div[@class='mat-select-value']")
	WebElement type;
	@FindBy(xpath = "//*[@name='CampaignStatus']//div[@class='mat-select-value']")
	WebElement status;
	@FindBy(xpath = "//*[@placeholder='Institution']//div[@class='mat-select-value']")
	WebElement institution;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch; 
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement selectclick;
	@FindBy(xpath ="//span[text()='Save']")
	WebElement save;
	
	
	public void CampaignsField()  
	{
			driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try
			{
			 Thread.sleep(3000); 
			 String dexpected="Dashboard"; String
			 dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	 
			 System.out.println("Enter In Dashboard Page");
			 marketing.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 campaing.click();
			 Thread.sleep(3000);
			 String aexpected="Campaigns";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Campaigns'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Campaigns Page");
			 UtilityFile.screenShot(driver);
			 additional.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 name.sendKeys("Dongal");
			 Thread.sleep(3000);
			 type.click();
			 Thread.sleep(3000);
			 dropdownsearch.sendKeys("Banner");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 status.click();
			 Thread.sleep(3000);
			 dropdownsearch.sendKeys("com");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",institution);
			 Thread.sleep(3000);
			 institution.click();
			 Thread.sleep(3000);
			 dropdownsearch.sendKeys("Bajaj");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 save.click();
			 Thread.sleep(3000);
			 
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}