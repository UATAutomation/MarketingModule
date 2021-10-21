package com.marketingcalling.pom;

import java.util.ArrayList;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.marketingcalling.base.Base;
import com.marketingcalling.utility.UtilityFile;

public class MarketCalling extends Base {

	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public MarketCalling(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[text()='Marketing']")
	WebElement Marketing;
	@FindBy(xpath = "//span[text()='Marketing Calling']")
	WebElement MarketingCalling;
	@FindBy(xpath = "//mat-icon[contains(text(),'add')]")
	WebElement add;

	@FindBy(xpath = "//ng-select[@name='Institution']/div[1]/div[1]/div[2]/input[1]")
	WebElement institution;
	@FindBy(xpath = "//ng-select[@placeholder='Institution']/div/div/div[2]/input")
	WebElement searchinstitution;
	@FindBy(xpath = "//button[contains(text(),'New Agent')]")
	WebElement NewAgent;
	@FindBy(xpath = "//input[@name='ContactPerson']")
	WebElement ContactPerson;
	@FindBy(xpath = "//input[@name='AgentName']")
	WebElement AgentName;
	@FindBy(xpath = "//input[@name='EmailId']")
	WebElement EmailId;
	@FindBy(xpath = "//input[@name='ContactNo']")
	WebElement ContactNo;
	@FindBy(xpath = "//mat-select[@name='CountryId']")
	WebElement CountryId;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	@FindBy(xpath = "//span[contains(text(),'Province')]")
	WebElement Province;
	@FindBy(xpath = "//input[@name='City']")
	WebElement City;
	@FindBy(xpath = "//mat-select[@name='ActivityResponse']")
	WebElement ActivityResponse;
	@FindBy(xpath = "//span[text()='Positive']")
	WebElement Positive;
	@FindBy(xpath = "//textarea[@name='Description']")
	WebElement Description;
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement addd;
	@FindBy(xpath = "//mat-icon[contains(text(),'filter_list')]")
	WebElement filterlist;
	@FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement hp;

	public void MarketCallingfield() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		a = new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi = (JavascriptExecutor) driver;

		Thread.sleep(3000);
		/*
		 * String dexpected="Dashboard"; String
		 * dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
		 * Assert.assertEquals(dactual, dexpected);
		 * System.out.println("Enter In Dashboard Page");
		 */
		exi.executeScript("arguments[0].scrollIntoView();", Marketing);
		Thread.sleep(3000);
		Assert.assertEquals(true, Marketing.isDisplayed());
		System.out.println("Marketing Tab Is Visible");
		Marketing.click();
		Thread.sleep(3000);
		exi.executeScript("arguments[0].scrollIntoView();", MarketingCalling);
		Thread.sleep(3000);
		Assert.assertEquals(true, MarketingCalling.isDisplayed());
		System.out.println("MarketingCalling Tab Is Visible");
		MarketingCalling.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		add.click();
		Thread.sleep(4000);

		String qexpected = "Marketing Calling";
		String qactual = driver.findElement(By.xpath("(//span[text()='Marketing Calling'])[2]")).getText();
		Assert.assertEquals(qactual, qexpected);
		System.out.println("Enter In Marketing Calling grid Page");
		
		  
		  institution.click();
		  Thread.sleep(3000);
		  
		  UtilityFile.screenShot(driver);
		  Thread.sleep(3000);
		  searchinstitution.sendKeys("bajaj");
		  Thread.sleep(3000);
		  searchinstitution.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  UtilityFile.screenShot(driver);
		  Thread.sleep(3000);
		 
		NewAgent.click();
		Thread.sleep(3000);
		AgentName.sendKeys("hp");
		Thread.sleep(3000);
		ContactPerson.sendKeys("jiop");
		Thread.sleep(3000);
		EmailId.sendKeys("jiop@gmail.com");
		Thread.sleep(3000);
		ContactNo.sendKeys("8974589658");
		Thread.sleep(3000);
		CountryId.click();
		Thread.sleep(3000);
		dropdown.sendKeys("afgha");
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Province.click();
		Thread.sleep(3000);
		dropdown.sendKeys("balkh");
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		City.sendKeys("pune");
		Thread.sleep(3000);
		ActivityResponse.click();
		Thread.sleep(3000);
		Positive.click();
		Thread.sleep(3000);
		Description.sendKeys("hai");
		Thread.sleep(3000);
		addd.click();
		Thread.sleep(3000);
		filterlist.click();
		Thread.sleep(3000);
		hp.sendKeys("hp");
		 Thread.sleep(3000);
		  UtilityFile.screenShot(driver);
	}
}
