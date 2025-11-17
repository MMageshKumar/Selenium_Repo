package org.example.one;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseIntro18 { //-------> 17 class debug so,

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
	WebDriver jk=new ChromeDriver ();
	
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\"
//			+ "eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
	
	jk.get("https://www.flipkart.com/");
	
	jk.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	
//	jk.manage().window().maximize();

	//-------------------------------------------------------------------------//
	
	WebElement one = jk.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	one.click();
	
	Actions a=new Actions(jk); //-----> give above variable only possible this object
	
	WebElement two = jk.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
	a.moveToElement(two).perform();
	
//	WebElement three = jk.findElement(By.xpath(""));
//	a.moveToElement(three).perform();
//	
//	WebElement four = jk.findElement(By.xpath(""));
//	a.moveToElement(four).perform();
	
//	a.dragAndDrop(from, to).perform();
//	a.clickAndHold().moveToElement(target).release().perform();
	
	}}
