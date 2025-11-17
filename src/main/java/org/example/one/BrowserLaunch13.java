package org.example.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch13 {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver ();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace"
			+ "\\SeleniumTest1\\chromedriver.exe");
		
		
	driver.get("https://www.selenium.dev/downloads/");
	
	
	driver.close();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
