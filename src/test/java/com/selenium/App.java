package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/root/pkcs/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://54.197.91.205:8080/addressbook/");
		driver.findElement(By.name("loginbutton")).click();
	}
}
		
