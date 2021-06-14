package com.metproject.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.metproject.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void lobUser() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("user31");
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
		Thread.sleep(10000);
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("search"))),"Login not successful");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(OR.getProperty("World"))).click();

	
	}

}
