package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/root/pkcs/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://18.212.179.102:8080/addressbook/");
	}
}
			
			
			
			
			
			
			
			
		
