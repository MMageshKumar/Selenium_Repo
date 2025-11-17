package org.example.one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectsss22 {
	
	public static void main(String[] args) {
	
		 WebDriver sltt=new ChromeDriver ();
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\"
					+ "eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
			
			sltt.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
			
			sltt.manage().window().maximize();
			sltt.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement one = sltt.findElement(By.xpath("//select[@name='dropdown']"));
		one.click();
		
	    Select voyal=new Select (one);
	    
	  //  List<WebElement> two = voyal.getOptions();
	    
	    
	    	voyal.selectByIndex(3);	
		
	    
	    
		
		
		
		
		
		
		
	}
}
