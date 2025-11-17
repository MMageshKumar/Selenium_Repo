package org.example.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  //------> When 23 line ---automatically imported
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIntro14 {
	
		public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver ();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\"
				+ "eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
			
//		In Facebook	 ----> simple sample.
		
		driver.get("https://www.facebook.com/login/");
	
		//=======================By.Id======================//
		
		
//		
//		WebElement fbusrname = driver.findElement(By.id("email"));
//		fbusrname.sendKeys("mmechmagesh333@gmail.com");
//
//		
//		WebElement fbpass = driver.findElement(By.id("pass"));
//		fbpass.sendKeys("mageshkumar");
//		
//		WebElement fblogin = driver.findElement(By.id("loginbutton"));
//		fblogin.click();
		
		
		//=======================By.Name====================//

//		WebElement fbusrname = driver.findElement(By.name("email"));
//		fbusrname.sendKeys("mmechmagesh333@gmail.com");
//
//		
//		WebElement fbpass = driver.findElement(By.name("pass"));
//		fbpass.sendKeys("mageshkumar");
//		
//		WebElement fblogin = driver.findElement(By.name("login"));
//		fblogin.click();
		
		
		//=======================By.className ====================//Invalid selector exception error

//		WebElement fbusrname = driver.findElement(By.className("inputtext _55r1 "
//				+ "inputtext _1kbt inputtext _1kbt"));
//		fbusrname.sendKeys("mmechmagesh333@gmail.com");
//		
//		WebElement fbpass = driver.findElement(By.className("inputtext _55r1 "
//				+ "inputtext _9npi inputtext _9npi"));
//		fbpass.sendKeys("mageshlumar");
//		
//		WebElement fblogin = driver.findElement(By.className("_42ft _4jy0 _52e0"
//				+ " _4jy6 _4jy1 selected _51sy"));
//		fblogin.click();
		
		
		//=======================By.xpath ( /absolute path)====================//
////		
//		WebElement fbusrname = driver.findElement(By.xpath("html[1]/body/div[1]/div[1]/di"
//				+ "v/div/div/div[1]/div[1]/"));       //----->like this so more large number
//		fbusrname.sendKeys("mmechmagesh333@gmail.com");
//		
//		WebElement fbpass = driver.findElement(By.xpath(""));
//		fbpass.sendKeys("mageshkumar");
//		
//		WebElement fblogin = driver.findElement(By.xpath(""));
//		fblogin.click();
		
		//=======================By.xpath ( //relative path)====================//
		
		
		WebElement fbusrname = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		fbusrname.sendKeys("mmechmagesh333@gmail.com");
		
		WebElement fbpass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		fbpass.sendKeys("mageshkumar");
		
		WebElement fblogin = driver.findElement(By.xpath("//button[@value='1']"));
		fblogin.click();

		// Way 1  <------|
		
//		WebElement fbwayone= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		fbwayone.click();
//		
		// Way  2 <--------| store one place multiple values
		
//		List<WebElement> fbway = driver.findElements(By.xpath("//a[@role='button']"));
//		WebElement fbwaytwo = fbway.get(1);
//		fbwaytwo.click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
