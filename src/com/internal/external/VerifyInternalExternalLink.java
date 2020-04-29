package com.internal.external;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyInternalExternalLink {


	public static void main (String[]args){

		WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\WebDrivers_Selenium\\chromedriver.exe");	
	 driver=new ChromeDriver();
	
	
	
	driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		
		if (url.contains("wikipedia.org")){
		System.out.println("It is an Internal Link – Redirected to another page in the Same Application – Passed");
		}
		else{
		System.out.println("It is an External Link – Redirected to another page in the Other Application -Failed");
		}
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		
		url = driver.getCurrentUrl();

		if (! url.contains("wikipedia.org")){
			System.out.println("It is an External Link – Redirected to another page in the Other Application – Passed");
			}
			else{
			System.out.println("It is an Internal Link – Redirected to another page in the same Application – Failed");
			}
			driver.close();
	}
}