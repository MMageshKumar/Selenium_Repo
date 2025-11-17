package org.example.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextValue16 {
	public static void main(String[] args) {
		
		WebDriver link=new ChromeDriver ();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\"
				+ "eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		link.get("https://www.linkedin.com/login");
		
//		WebElement linkusr = link.findElement(By.xpath("//input[@type='text']"));
//		linkusr.sendKeys("ertyui");
//		
//		WebElement linkpass = link.findElement(By.xpath("//input[@type='password']"));
//		linkpass.sendKeys("xcvbn");
//		
//		WebElement linklogin = link.findElement(By.xpath("//button[@type='submit']"));
//		linklogin.click();
//		
		
//		WebElement forgetpassword = link.findElement(By.xpath("//a[text()='Forgot password?'] "));
//		String show1 = forgetpassword.getText();
//		System.out.println(show1); //-------------> getting text from page
//		
//		
//
//		WebElement forgetpassword2 = link.findElement(By.xpath("//a[contains(text(),'Forgo')] "));
//		String show2 = forgetpassword2.getText();
//		System.out.println(show2); //-------------> getting text from page (contain method)
		
		WebElement forgetpassword3 = link.findElement(By.xpath("//input[contains(@id,'us')] "));
		forgetpassword3.sendKeys("qwertyuiop");
		
		String show4 = forgetpassword3.getAttribute("value");
		//String show4 = forgetpassword3.getAttribute("innerText"); ---->for page text
		System.out.println(show4);
		
		
		

}}
