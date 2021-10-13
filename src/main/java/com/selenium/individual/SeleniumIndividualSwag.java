package com.selenium.individual;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIndividualSwag {
@Test
	public static void Individual() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("user-name"));
		WebElement username=driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password"));
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		//String Title = driver.getTitle();
		//Assert.assertEquals("SWAGLABS", Title);
		WebElement addtocart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		WebElement gotocart=driver.findElement(By.className("shopping_cart_link"));
		gotocart.click();
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		driver.findElement(By.name("firstName"));
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("manju");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName"));
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("kumar");
		driver.findElement(By.name("postalCode"));
		WebElement zip=driver.findElement(By.name("postalCode"));
		zip.sendKeys("600001");
		Thread.sleep(1000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,400)");
		WebElement continueto=driver.findElement(By.id("continue"));
		continueto.click();
		Thread.sleep(1000);
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(1000);
		WebElement backtohome=driver.findElement(By.id("back-to-products"));
		backtohome.click();
		Thread.sleep(1000);
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		jse1.executeScript("scrollBy(0,-400)");
		Thread.sleep(1000);
		WebElement button=driver.findElement(By.id("react-burger-menu-btn"));
		button.click();
		Thread.sleep(1000);
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(1000);
		driver.close();
}
}


