package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/rismayilov/Documents/selenium dependencies/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://testing-ground.scraping.pro/login");
		
		driver.findElement(By.id("usr")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[type='submit'])).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		//driver.findElement(By.xpath("[id='case_login']"));
//		username.sendKeys("tutorial");
//		username.click();
		
		
		String expected = "Web Scraper Testing Ground";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
			System.out.println("pass");
	    else 
		System.out.println("fail");
	    System.out.println("Expected :\t " + expected);
	    System.out.println("Actual:\t"+ actual);
	    
	    driver.close();

	}

}
