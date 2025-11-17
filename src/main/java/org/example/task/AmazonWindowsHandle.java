package org.example.task;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class AmazonWindowsHandle {
	
	public void expThala(WebDriver driver, int time, WebElement element, String value ) {
		WebDriverWait lkj=new WebDriverWait (driver,time);
		lkj.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("value");
	}

	public static void main(String[] args) throws InterruptedException {
		
             WebDriver driver=new ChromeDriver ();
		
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.amazon.in/gp/cart/view.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement one = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		one.sendKeys("Classmate Note Book");
		
		WebElement two = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		two.click();
		
		Thread.sleep (5000);
		
		WebElement three = driver.findElement(By.xpath("//span[contains(text(),'Classmate Premium 6 Subject Notebook - A')]"));
		three.click();
		
		//
		
		Thread.sleep (5000);
		
		String wahid = driver.getWindowHandle();
		System.out.println(wahid);
		
		Set<String> itnan = driver.getWindowHandles();
		System.out.println(itnan);
		
//		List <String> li=new LinkedList <> ();
//		
//		li.addAll(itnan);
//		
//		String five = li.get(1);
//		System.out.println(five);
//		
//		driver.switchTo().window(five);
		
		int m=0;
		 for ( String tho:itnan) 
		 {
			 if(m==1) 
			 {
				 driver.switchTo().window(tho);
			 }m++;
		}
		
		
		 
		 
		 
		
		WebElement four = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		four.click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
