package com.selenium.examples2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutorExample {
	@Test
public static void Js() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();	
driver.get("https://google.com");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("alert('Hello,do no close me!')");
Thread.sleep(2000);
driver.quit();  
}
}