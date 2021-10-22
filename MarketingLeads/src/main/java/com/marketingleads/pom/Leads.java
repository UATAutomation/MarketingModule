package com.marketingleads.pom;

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

import com.marketingleads.base.Base;
import com.marketingleads.utility.UtilityFile;


public class Leads extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public Leads(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Marketing']")
	WebElement marketing;
	@FindBy(xpath = "//span[text()='Leads']")
	WebElement leads;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement fname;
	@FindBy(xpath = "//input[@placeholder='Date of Birth']")
	WebElement dob;
	@FindBy(xpath = "//input[@name='Email']")
	WebElement mail;
	
	@FindBy(xpath = "//*[@name='LeadSource']//div[@class='mat-select-value']")
	WebElement source;
	@FindBy(xpath = "//*[@name='LeadStatus']//div[@class='mat-select-value']")
	WebElement status;
	@FindBy(xpath = "//*[@name='Citizenship']//div[@class='mat-select-value']")
	WebElement citizen;
	@FindBy(xpath = "//*[@name='Country']//div[@class='mat-select-value']")
	WebElement country;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch; 
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement selectclick;
	@FindBy(xpath ="//button[@type='submit']")
	WebElement save;
	
	
	public void LeadsField()  
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
			 leads.click();
			 Thread.sleep(3000);
			 String aexpected="Leads";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Leads'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Leads Page");
			 UtilityFile.screenShot(driver);
			 additional.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 source.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 dropdownsearch.sendKeys("phone");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 status.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 dropdownsearch.sendKeys("open");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 fname.sendKeys("Gogya");
			 Thread.sleep(3000);
			 dob.sendKeys("02/06/1995");
			 Thread.sleep(3000);
			 citizen.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 dropdownsearch.sendKeys("iran");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 mail.sendKeys("gogya11@gmail.com");
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",country);
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 country.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 dropdownsearch.sendKeys("iran");
			 Thread.sleep(3000);
			 selectclick.click();
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",save);
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 save.click();
			 Thread.sleep(3000);
			 
			 
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}