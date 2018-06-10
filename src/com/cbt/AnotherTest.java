package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/rismayilov/Documents/selenium dependencies/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.cybertekschool.com");
		String expected = "cybertekschool";
		String actual = driver.getCurrentUrl();
		
		if(actual.contains(expected))
			System.out.println("pass");
	    else 
		System.out.println("fail");
	    System.out.println("Expected :\t " + expected);
	    System.out.println("Actual:\t"+ actual);
	    
//	    driver.navigate().to("http://google.com");
//	    Thread.sleep(1000);
//	    
//	    driver.navigate().back();
//	    Thread.sleep(1000);
//	    
//	    driver.navigate().forward();
//	    Thread.sleep(1000);
//	    
//	    driver.navigate().refresh();
	    
	    //driver.close();
	    driver.quit();
	    
	}
	}
