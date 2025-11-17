package org.example.task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagTeamTable {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver () ;
		
		System.setProperty("WebDriver.ChromeDriver","C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.w3schools.com/css/css_table.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().window().maximize();
		
		List<WebElement> one = driver.findElements(By.xpath("//table[@id='customers']"));
		System.out.println(one.size());
		System.out.println(one.get(0).getText());
		
		System.out.println("----------------------------");
		
		for (WebElement A:one)
		{
			WebElement two = one.get(0);
			List<WebElement> three = two.findElements(By.tagName("tr"));
			
			for(int i=0; i<1 ; i++) 
			{
			WebElement four = three.get(3);
			String five = four.getText();
			//System.out.println(five);
			System.out.println("-------------------");
			
			List<WebElement> six = four.findElements(By.tagName("td"));
			for (int j=0; j<1; j++) 
			{
				WebElement seven = six.get(2);
				System.out.println(seven.getText());
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
