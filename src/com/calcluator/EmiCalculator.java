package com.calcluator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class EmiCalculator {

	@Test
	public  void calculatorLoanEmi() throws InterruptedException{
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","D:\\WebDrivers_Selenium\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://emicalculator.net/");

	Actions actions = new Actions(driver);
	
	WebElement loanSlider = driver.findElement(By.id("loanamountslider"));
	WebElement interestSlider = driver.findElement(By.id("loaninterestslider"));
	WebElement tenureSlider = driver.findElement(By.id("loantermslider"));
	
	actions.dragAndDropBy(loanSlider, 83, 0).build().perform();
	Thread.sleep(2000);
	
	actions.dragAndDropBy(interestSlider, 88, 0).build().perform();
	Thread.sleep(2000);
	
	actions.dragAndDropBy(tenureSlider, -111, 0).build().perform();
	Thread.sleep(2000);
	
	WebElement loanEmiElement = driver.findElement(By.id("emiamount"));
	String loanEmiText = loanEmiElement.getText();
	
	Assert.assertEquals(1,99,441, loanEmiText);
	Thread.sleep(2000);
	
	
	driver.close();
	
	}
}
