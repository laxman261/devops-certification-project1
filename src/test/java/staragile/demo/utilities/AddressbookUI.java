package staragile.demo.utilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.staragile.demo.utilities.LoggerStackTraceUtil;

public class AddressbookUI {
	

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
		driver.findElement(By.id("gwt-uid-5")).sendKeys("prashant");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Suragimath");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("pkcsmath@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("18/01/2023");
		Thread.sleep(2000);
		//click on the save button
		driver.findElement(By.className("v-button-primary")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Script executed successfully");
		
    }
}
