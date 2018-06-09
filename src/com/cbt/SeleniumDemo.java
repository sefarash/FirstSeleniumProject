package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/rismayilov/Documents/selenium dependencies/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
		
//		System.setProperty("webdriver.gecko.driver",
//				"C:/Users/rismayilov/Documents/selenium dependencies/drivers/geckodriver.exe");
//		
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("https://google.com/");
//		
//		
//		System.setProperty("webdriver.edge.driver",
//				"C:/Users/rismayilov/Documents/selenium dependencies/drivers/MicrosoftWebDriver.exe");
//		
//		WebDriver driver2 = new EdgeDriver();
//		driver2.get("https://cybertekschool.com/");
//		
//		System.setProperty("webdriver.ie.driver",
//				"C:/Users/rismayilov/Documents/selenium dependencies/drivers/IEDriverServer.exe");
//		
//		WebDriver driver3 = new InternetExplorerDriver();
//		driver3.get("https://cybertekschool.com/");
		
		
		
		

	}

}
