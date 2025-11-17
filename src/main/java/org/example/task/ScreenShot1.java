package org.example.task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException
	{
	
              WebDriver driver=new ChromeDriver ();
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace"
				+ "\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.classmateshop.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		TakesScreenshot wahid=(TakesScreenshot) driver ;
	
		File one = wahid.getScreenshotAs(OutputType.FILE);
		
		File two=new File ("C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\Sht\\Classmate.png");
		FileUtils.copyFile(one, two);
		
		
		WebElement four = driver.findElement(By.xpath("//div[@class='BtnContent']"));
		File five = four.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(five, two);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
