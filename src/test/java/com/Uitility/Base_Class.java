package com.Uitility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base_Class {
	
	public static Properties propy;
	public static WebDriver driver;
	public Base_Class() {
		
		 propy = new Properties();
			try {
				FileInputStream filesss = new FileInputStream (System.getProperty("user.dir") + "\\src\\test\\java\\com\\Configuration\\Configration.Properties");
				propy.load(filesss);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        }
		public void DeffBrowser() {
			
			String BrowserName = propy.getProperty("Browser01");
			
			if(BrowserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestData.pageLoadTimeout, TimeUnit.SECONDS);
			}
			else if(BrowserName.equalsIgnoreCase("Internet Explorer"));
		    }
		
		public static void launchURL(String URL) {
			
			driver.get(propy.getProperty("url1"));
			
		    }
		
}
