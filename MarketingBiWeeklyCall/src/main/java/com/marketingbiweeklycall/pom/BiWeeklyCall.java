package com.marketingbiweeklycall.pom;

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

import com.marketingbiweeklycall.base.Base;
import com.marketingbiweeklycall.utility.UtilityFile;


public class BiWeeklyCall extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public BiWeeklyCall(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Marketing']")
	WebElement marketing;
	@FindBy(xpath = "//span[text()='Bi-Weekly Call']")
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
	@FindBy(xpath ="//input[@placeholder='New participant...']")
	WebElement participant;
	@FindBy(xpath ="//*[@name='remarks']")
	WebElement remark;
	@FindBy(xpath ="//button[text()='Add']")
	WebElement add;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath ="(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchapp;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath ="//button[text()='Update']")
	WebElement update;
	
	public void BiWeeklyCallField()  
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
			 String aexpected="Bi-Weekly Call";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Bi-Weekly Call'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Bi-Weekly Call Page");
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
			 participant.sendKeys("Purvi");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
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
	
	public void UpdateBiWeeklyCallField()  
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			try
			{
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				nexttab.click();
				Thread.sleep(3000);
				searchapp.sendKeys("Market");
				Thread.sleep(3000);
				a.moveToElement(edit).click(edit).build().perform();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				participant.sendKeys("Durga");
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				update.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}