package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back(); //google
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); //amazon
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back(); //google
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
