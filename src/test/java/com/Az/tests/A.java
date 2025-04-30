package com.Az.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	
	
	@Test
	public void display() throws InterruptedException {
		
		System.out.println("Launching Google ");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();
		
		System.out.println("Print A");
	}

}
