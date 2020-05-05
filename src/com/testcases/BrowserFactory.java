package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserFactory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver ; 
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers_Selenium\\chromedriver.exe");
		 
		driver = new ChromeDriver(); // Launching chrome
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://book.spicejet.com");
		
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.linkText("SIGN UP")).click();
		Thread.sleep(2000);
		
		Select title = new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
		title.selectByVisibleText("MS");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@Id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName']")).sendKeys("Jagrati");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@Id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName']")).sendKeys("Lodha");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@Id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER']")).sendKeys("787190006");
		Thread.sleep(2000);
		
		driver.findElement(By.name ("CONTROLGROUPREGISTERVIEW$MemberInputRegisterView$PasswordFieldAgentPassword")).sendKeys("Jaggu@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@Id = 'CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm']")).sendKeys("Jagrati@123");
		Thread.sleep(2000);
	
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys("jagrati123@gmail.com");
		
	}
	}
