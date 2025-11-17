package org.example.two;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate27 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver () ;
		
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.navigate().to("https://www.classmateshop.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@id='main_menu_make_your_notebook']")).click();
		
		 JavascriptExecutor lk=(JavascriptExecutor) driver;
		
		WebElement two = driver.findElement(By.xpath("//input[@id='page_172']"));
		lk.executeScript("arguments[0].click()", two);
		
		driver.findElement(By.xpath("//button[contains(@class,'Mui')]")).click();
		
		//------------navigation Action area (In Browse)------------//
		
		Thread.sleep (3000); //-----------> this is for our vision understanding. 
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//-----------Navigation Boolean area (for webElement)---------//
		
		boolean twocheck1 = two.isDisplayed();
		System.out.println(twocheck1);
		
		boolean twocheck2 = two.isEnabled();
		System.out.println(twocheck2);
		
		boolean twocheck3 = two.isSelected();
		System.out.println(twocheck3);
		
		
		
		
		

	}

}
