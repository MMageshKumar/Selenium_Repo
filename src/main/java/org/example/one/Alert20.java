package org.example.one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert20 {

	public static void main(String[] args) {
		
		WebDriver mg=new ChromeDriver ();
		
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		mg.get("http://demo.automationtesting.in/Alerts.html");
		
		mg.manage().window().maximize();
		mg.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
//		Web driver to alert
//		Simple Alert
		
		WebElement one = mg.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		one.click();
		
		WebElement two = mg.findElement(By.xpath("//button[@class='btn btn-danger']"));
		two.click();
		
		mg.switchTo().alert().accept();
		
//		Confirm alert
		
		WebElement three = mg.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		three.click();
		
		WebElement four = mg.findElement(By.xpath("//button[@class='btn btn-primary']"));
		four.click();

		mg.switchTo().alert().dismiss();
		
//		Prompt alert
		
		WebElement five = mg.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		five.click();
		
		WebElement six = mg.findElement(By.xpath("//button[@class='btn btn-info']"));
		six.click();
		
		mg.switchTo().alert().sendKeys("Mag");
		mg.switchTo().alert().accept();
		
		
		
		
		
		
		

	}

}
