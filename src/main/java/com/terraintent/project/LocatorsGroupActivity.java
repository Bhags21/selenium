package com.terraintent.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsGroupActivity {
	@Test
	public void Logintest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername"));
		WebElement username=driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword"));
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Add Employ")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName"));
		WebElement FullName=driver.findElement(By.id("firstName"));
		FullName.sendKeys("sahana");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName"));
		WebElement FullName1=driver.findElement(By.id("lastName"));
		FullName1.sendKeys("kumar");
        Thread.sleep(1000);
    	WebElement save=driver.findElement(By.cssSelector("#btnSave"));
		save.click();
		Thread.sleep(1000);
		WebElement Edit=driver.findElement(By.tagName("input"));
		Edit.click();
	    driver.close();
}
}
