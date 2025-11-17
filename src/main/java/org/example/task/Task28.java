package org.example.task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task28 {

	public static void main(String[] args) {
		
             WebDriver driver=new ChromeDriver () ;
		
		System.setProperty("WebDriver.ChromeDriver","C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.w3schools.com/css/css_table.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().window().maximize();
		
		List<WebElement> one = driver.findElements(By.tagName("tr"));
		
		for (int i=0; i<3 ; i++) {
			System.out.println(one.get(i).getText());}
		
		System.out.println("-----------------------------");
		
		for (int j=one.size()-3 ; j<one.size();j++ ) {
			System.out.println(one.get(j).getText()); }
		
		System.out.println("-----------------------------");
		
		for (int k=0; k<one.size();k++) {
			WebElement two = one.get(k);
			String two1 = two.getText();
			System.out.println(two1);
			
			}
		System.out.println("-----------------------------");

		
		List<WebElement> zero = driver.findElements(By.id("customers"));   //---> this element store all in index 0, so we can't take them out from here.
		String zero1=zero.get(0).getText();
		
		System.out.println("========================================");
		
		int wahid = zero1.indexOf("Island Trading Helen Bennett UK");
		System.out.println(wahid);
		
		System.out.println("========================================");
		
         List <String> jkl=new ArrayList <>();
	

	}

}
