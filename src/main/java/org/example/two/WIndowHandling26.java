package org.example.two;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WIndowHandling26 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver ();
		
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement one = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		one.click();

		WebElement two = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		two.sendKeys("Pixel 4a");
		
		WebElement three= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		three.click();
		
		List<WebElement> four = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		WebElement four1 = four.get(0);
		four1.click();
		
		//-------switching to next windows tab-------------//
	
		String ek = driver.getWindowHandle();
		System.out.println(ek);
		
		Set<String> tho = driver.getWindowHandles();
		System.out.println(tho);  //-------> set la, get panna mudiyathu ,do following three any one
		
		//----first method---Enhanced for with if ------// like eleminantion of parent to...one by one
		
//		for (String theen : tho) {
//			
//			if (!ek.equals(theen)) {		
//				driver.switchTo().window(theen);
//			}}
		
		
		//-----second method---Enhanced for with incremental attachment---//	
//		int ukg=8;
//	
//		for (String theen : tho) {
//			System.out.println(theen+"--------------------");
//			
//			if (ukg==9) {
//				driver.switchTo().window(theen);
//				System.out.println(theen);
//			}  ukg++;
//		}
		
		//---------third method--- convert to list-----//
		
		List <String> li=new ArrayList <> ();
			
		 li.addAll(tho);
		 System.out.println(li);
		
		String li1 = li.get(1);
		System.out.println(li1);
		
		driver.switchTo().window(li1);
		
		
		//------regular things------------//
			
		WebElement five = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		five.click();
		
		WebElement six = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
		six.click();
		
		WebElement seven = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		seven.sendKeys("876544");
		
		
		
		
		
		
	
		
		

	}

}
