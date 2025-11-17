package org.example.two;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framee25 { 

	public static void main(String[] args) throws Exception {
		
             WebDriver driver=new ChromeDriver ();
		
		System.setProperty("WebDriver.ChomeDriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
//		driver.switchTo().frame("id")     --->way four
//		driver.switchTo().frame(0);                                      -------> Way One
//		driver.switchTo().frame("login_page"); //                          -------> Way two
		
//		WebElement wahid = driver.findElement(By.xpath("//frame[@noresize='true']"));
//		driver.switchTo().frame(wahid);                                  -------->way three
		

		
		WebElement one = driver.findElement(By.xpath("//input[@type='text']"));
		one.click();
		one.sendKeys("RamaRaju");
		
		Thread.sleep(4000);
		
//		driver.switchTo().parentFrame();    ---> you know from its name
		
//		driver.switchTo().defaultContent(); -----> Come frame comer
		
		WebElement two = driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]"));
		two.click();
		
		
		


		
		

		
				
				
				
				
				
				
				
				
	}

}
