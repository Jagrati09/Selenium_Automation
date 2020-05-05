package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String []args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://thedemosite.co.uk/");
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("jagrati09");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("FormsButton2")).click();
		
		
		
		
		
	}
}
