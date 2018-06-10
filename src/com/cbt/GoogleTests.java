package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {

	public static void main(String[] args) {
		// Test case 1: verify title
        //1. Open chrome
		
		//C:/Users/rismayilov/Documents/selenium dependencies/drivers/chromedriver.exe")
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rismayilov/Documents/selenium dependencies/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//2. go to url www.google.com
		// get() goes to a website
		driver.get("https://www.google.com");
		//3. Verify title
		// Expected: Google
		String expected = "Google";
		// getTitle() --> gets the title of the web
		String actual = driver.getTitle();
		
		if(expected.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			}
		System.out.println("Expected :\t " + expected);
		System.out.println("Actual:\t"+ actual);
		}
		}
		
		

