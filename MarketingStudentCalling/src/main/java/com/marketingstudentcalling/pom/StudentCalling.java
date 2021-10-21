package com.marketingstudentcalling.pom;

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

import com.marketingstudentcalling.base.Base;
import com.marketingstudentcalling.utility.UtilityFile;


public class StudentCalling extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public StudentCalling(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Marketing']")
	WebElement marketing;
	@FindBy(xpath = "//span[text()='Student Calling']")
	WebElement studentcalling;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//input[@placeholder='Activity Date']")
	WebElement activitydate;
	@FindBy(xpath = "//*[@placeholder='Institution']//div[@class='mat-select-value']")
	WebElement institution;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch; 
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement selectclick;
	@FindBy(xpath ="//*[@name='Student']//div[@class='mat-select-value']")
	WebElement studentname;
	@FindBy(xpath ="//input[@name='CallingReson']")
	WebElement callingreson;
	@FindBy(xpath ="//*[@name='ActivityResponse']//div[@class='mat-select-value']")
	WebElement activityresponse;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[3]")
	WebElement resposeclick;
	@FindBy(xpath ="//*[@name='Remark']")
	WebElement remark;
	@FindBy(xpath ="//button[text()='Add']")
	WebElement add;
	
	public void AddStudentCalling()  
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
			 exi.executeScript("arguments[0].scrollIntoView();",studentcalling);
			 Thread.sleep(3000);
			 studentcalling.click();
			 Thread.sleep(3000);
			 String aexpected="Student Calling";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Student Calling'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Student Calling Page");
			 UtilityFile.screenShot(driver);
			 additional.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 activitydate.sendKeys(prop.getProperty("date"));
			 Thread.sleep(3000);
			 institution.click(); 
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 dropdownsearch.sendKeys("Bajaj");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 selectclick.click();
			 Thread.sleep(2000);
			 UtilityFile.screenShot(driver);
			 studentname.click();
			 Thread.sleep(3000);
			 dropdownsearch.sendKeys("Purvi");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 selectclick.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 exi.executeScript("arguments[0].scrollIntoView();",callingreson);
			 Thread.sleep(3000);
			 callingreson.sendKeys("For New Adding Purpoes");
			 Thread.sleep(3000);
			 activityresponse.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 resposeclick.click();
			 Thread.sleep(3000);
			 remark.sendKeys("good agent response");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 add.click();
			 Thread.sleep(3000); 
			 UtilityFile.screenShot(driver);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}