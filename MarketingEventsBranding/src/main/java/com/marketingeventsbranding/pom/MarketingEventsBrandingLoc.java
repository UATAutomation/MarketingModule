package com.marketingeventsbranding.pom;

import java.util.List;
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
import com.marketingeventsbranding.base.Base;
import com.marketingeventsbranding.utility.UtilityFile;


public class MarketingEventsBrandingLoc extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public MarketingEventsBrandingLoc(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[text()='Marketing']")
	WebElement marketing;
	@FindBy(xpath = "//span[text()='Events']")
	WebElement events;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//input[@name='EventTitle']")
	WebElement eventtitle;
	@FindBy(xpath = "//*[@name='EventCategoryId']//span[text()='Category']")
	WebElement category;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch; 
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement selectcate;
	@FindBy(xpath ="//*[@name='SessionORBranding']//div[@class='mat-select-value']")
	WebElement Ssessionorbranding;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
	WebElement selectbranding;
	@FindBy(xpath ="(//*[@placeholder='Start Date'])[2]")
	WebElement startdate;
	@FindBy(xpath ="//*[@name='InstitutionId']//span[text()='Institution']")
	WebElement institution;
	@FindBy(xpath ="//span[text()='ADD']")
	WebElement instiadd;
	@FindBy(xpath = "//input[@name='DocumentName']")
	WebElement docnm;
	@FindBy(xpath = "//input[@name='DocumentFile']")
	WebElement choosefile;
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement upload;
	@FindBy(xpath ="//button[text()=' Add ']")
	WebElement add;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath ="(//input[@class='dx-texteditor-input'])[4]")
	WebElement searchtab;
	@FindBy(xpath = "(//td[@aria-label='Column Session / Branding']//div)[1]")
	WebElement braorsescolmn;
	@FindBy(xpath = "//span[text()='OK']")
	WebElement OK;
	
	
	
	public void MarketingEventsBrandingField()  
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
			 Thread.sleep(3000);
			 exi.executeScript("arguments[0].scrollIntoView();",events);
			 Thread.sleep(3000);
			 events.click();
			 Thread.sleep(3000);
			 
			 String aexpected="Events";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Events'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Events Page");
			 UtilityFile.screenShot(driver);
			 
			 additional.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 eventtitle.sendKeys("BusOwner");
			 Thread.sleep(3000);
			 category.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 
			 System.out.println("This Is Category Values :-");
			 List<WebElement>catlists=driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 for(WebElement catlist:catlists)
			 {
				 System.out.println(catlist.getText());
			 }
			 
			 dropdownsearch.sendKeys("Canada");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 selectcate.click();
			 Thread.sleep(3000);
			 Ssessionorbranding.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 
			 System.out.println("This Is Session OR Branding Values :-");
			 List<WebElement>list= driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			 for(WebElement lists : list) 
			 {
				 System.out.println(lists.getText());
			 }
			 
			 selectbranding.click();
			 Thread.sleep(3000);
			 startdate.sendKeys("22/09/2021");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 institution.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 dropdownsearch.sendKeys("Bajaj");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 selectcate.click();
			 Thread.sleep(3000);
			 instiadd.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 exi.executeScript("arguments[0].scrollIntoView();",additional);
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 additional.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 docnm.sendKeys("Birth Certificate");
			 Thread.sleep(3000);
			 choosefile.sendKeys("C:\\Users\\funak\\Desktop\\EmptyExcel.xlsx");
			 Thread.sleep(3000);
			 upload.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 add.click(); 
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 nexttab.click();
			 Thread.sleep(3000);
			 searchtab.sendKeys("BusOwner");
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 
			 String mexpected="Session / Branding";
			 String mactual=driver.findElement(By.xpath("(//td[@aria-label='Column Session / Branding']//div)[2]")).getText();
			 Assert.assertEquals(mactual, mexpected);	
			 System.out.println("Present Column Session / Branding ");
			 
			 braorsescolmn.click();
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 OK.click();
			 Thread.sleep(3000);
			 
			 String iname=driver.findElement(By.xpath("//*[@id='screenshot']/div[2]//div[@class='dx-scrollable-wrapper']//tr[1]//td[2]")).getText();
			 System.out.println("Institution Name is : "+iname);
				
			 String value=driver.findElement(By.xpath("//*[@id='screenshot']/div[2]//div[@class='dx-scrollable-wrapper']//tr[1]//td[6]")).getText();
			 System.out.println("Select Session / Branding Value is : "+value);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}