package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{	@Test
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
	
		System.setProperty("webdriver.chrome.driver","/root/pkcs/chromedriver");
		//System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
		
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		System.out.println("Welcome to the Selenium Scripts - It starts executing here");
		//automation
		driver.get("http://54.197.91.205:8080/addressbook/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Singh");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("Shubham@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("24/06/2022");
		Thread.sleep(2000);
		//click on the save button
		driver.findElement(By.className("v-button-primary")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Script executed successfully");
		
    }
}
