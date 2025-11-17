package org.example.two;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripttt24 { 

	public static void main(String[] args) throws InterruptedException { 
		
		WebDriver driver=new ChromeDriver ();
		
		System.setProperty("WebDriver.ChomeDriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.linkedin.com/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor vayal=(JavascriptExecutor) driver;   //------> type casting
		
	    WebElement one = driver.findElement(By.xpath("//input[@id='username']"));
		vayal.executeScript("arguments[0].setAttribute('value','rock')", one);  //-----------> only namma than eluthanum.
		
		WebElement two = driver.findElement(By.xpath("//input[@id='password']"));
		vayal.executeScript("arguments[0].setAttribute('value','maypassword')", two);
		
		WebElement three = driver.findElement(By.xpath("//input[@id='password']"));
		vayal.executeScript("arguments[0].click()", three);	 
		
		WebElement four = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		Object four1 = vayal.executeScript("return arguments[0].getAttribute('value')", four);
		
		System.out.println(four1);
		
		//For scrolling in JavaScript
		WebElement five = driver.findElement(By.xpath("//a[text()='Send Feedback']"));
		vayal.executeScript("arguments[0].scrollIntoView(true)",five );   //-----> for Down

		Thread.sleep(5000);
		vayal.executeScript("arguments[0].scrollINtoView(false)",one);  //----->for up
		
		
		
		

	}

}
