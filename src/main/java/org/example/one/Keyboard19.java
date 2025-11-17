package org.example.one;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard19 {

	public static void main(String[] args) throws Throwable {
		
              WebDriver Zink=new ChromeDriver ();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\"
				+ "eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		Zink.get("https://www.facebook.com/");
		
		Zink.manage().window().maximize();
		
		Robot Rob=new Robot () ;
		
		Rob.keyPress(KeyEvent.VK_J);     Rob.keyRelease(KeyEvent.VK_J);
		
		Rob.keyPress(KeyEvent.VK_O);     Rob.keyRelease(KeyEvent.VK_O);
		
		Rob.keyPress(KeyEvent.VK_PERIOD);  Rob.keyRelease(KeyEvent.VK_PERIOD);
		
		Rob.keyPress(KeyEvent.VK_SHIFT);  Rob.keyPress(KeyEvent.VK_2); 
		Rob.keyRelease(KeyEvent.VK_SHIFT); Rob.keyRelease(KeyEvent.VK_2);
		
		Rob.keyPress(KeyEvent.VK_H);       Rob.keyRelease(KeyEvent.VK_H);
		
		Rob.keyPress(KeyEvent.VK_CONTROL);  Rob.keyPress(KeyEvent.VK_A);
		Rob.keyRelease(KeyEvent.VK_A); Rob.keyRelease(KeyEvent.VK_CONTROL);
		
		Rob.keyPress(KeyEvent.VK_CONTROL);  Rob.keyPress(KeyEvent.VK_C);
		Rob.keyRelease(KeyEvent.VK_C); Rob.keyRelease(KeyEvent.VK_CONTROL);


		
		Actions Act=new Actions (Zink);
		
		WebElement one = Zink.findElement(By.xpath("//input[@name='pass']"));
		Act.moveToElement(one).contextClick().perform();
		
		for (int i=0; i<4;i++) {
		Rob.keyPress(KeyEvent.VK_DOWN);  Rob.keyRelease(KeyEvent.VK_DOWN);}
		

		Rob.keyPress(KeyEvent.VK_ENTER);  Rob.keyRelease(KeyEvent.VK_ENTER);
			

}}
