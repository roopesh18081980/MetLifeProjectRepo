package com.metproject.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.metproject.base.TestBase;

public class CreatePlanSponsor extends TestBase {
	
	@Test
	public void plansponsorprofile() throws InterruptedException 
	{
		driver.findElement(By.xpath(OR.getProperty("new"))).click();
		driver.findElement(By.xpath(OR.getProperty("plansponsor"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
		
		//Profile Page
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tapestry']")));
				
		driver.findElement(By.xpath(OR.getProperty("plansponsorname"))).click();
		driver.findElement(By.xpath(OR.getProperty("plansponsorname"))).sendKeys("PS_NEW_TEST");
		driver.findElement(By.xpath(OR.getProperty("taxidnumber"))).sendKeys("223256256");
		
		driver.switchTo().defaultContent();
		//Navigate to Contracts Page
		driver.findElement(By.xpath(OR.getProperty("contracts"))).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tapestry']")));
		driver.findElement(By.xpath(OR.getProperty("add"))).click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
		Thread.sleep(5000);
		// Contracts Profile
		driver.findElement(By.xpath(OR.getProperty("commonname"))).sendKeys("PS_Contract");
		driver.findElement(By.xpath(OR.getProperty("groupidnumber"))).sendKeys("223256257");
		driver.findElement(By.xpath(OR.getProperty("contracteffectivatedate"))).click();
		driver.findElement(By.xpath(OR.getProperty("contracteffectivatedate"))).sendKeys("01/01/2010");
		
		Thread.sleep(5000);
		
		//Select productdropdown = new Select(driver.findElement(By.xpath(OR.getProperty("product"))));
		//productdropdown.selectByVisibleText("Non-Par - MLIC");
		
		//Select contractstatusdropdown = new Select(driver.findElement(By.xpath(OR.getProperty("contractstatus"))));
		//contractstatusdropdown.selectByVisibleText("FA-Post-Contract Execution");
		
		
		dropdownlist(OR.getProperty("product"), "Non-Par - MLIC");
		dropdownlist(OR.getProperty("contractstatus"), "FA-Post-Contract Execution");
		dropdownlist(OR.getProperty("issuestate"), "NY");
		
		
		driver.findElement(By.xpath(OR.getProperty("netpricing"))).sendKeys("5");
		driver.findElement(By.xpath(OR.getProperty("liabilityassumptiondate"))).click();
		driver.findElement(By.xpath(OR.getProperty("liabilityassumptiondate"))).sendKeys("01/01/2010");
		driver.findElement(By.xpath(OR.getProperty("contractexecutiondate"))).click();
		driver.findElement(By.xpath(OR.getProperty("contractexecutiondate"))).sendKeys("01/01/2010");
		driver.findElement(By.xpath(OR.getProperty("aggregatepayments"))).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath(OR.getProperty("contractprofilesave"))).click();
		
		Thread.sleep(5000);
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert = new Alert();
		driver.switchTo().alert().accept();
		
		
		
		//dropdownlist(OR.getProperty("product"), "Non-Par - MLIC");
		
	
		
		
		
		
	}


		
	}


