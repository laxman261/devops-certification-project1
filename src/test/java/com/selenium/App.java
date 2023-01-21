package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "/root/pkcs/chromedriver");
       WebDriver  driver = new ChromeDriver();
       driver.get("http://184.73.138.187:8080/addressbook/");
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("suragimath");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("vihaan");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9886087613");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("pkcsmath@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("28/02/2022");
		
		//click on the save button
		driver.findElement(By.className("v-button-primary")).click();
		
		
		driver.quit();
		System.out.println("Script executed successfully");
	}

}
			
			
			
			
			
		
