
package org.example.one;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIntro15 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.crome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\"
				+ "SeleniumTest1\\chromedriver.exe");
		
		WebDriver jk= new ChromeDriver ();

		
		jk.get("https://www.flipkart.com/");
		
		//----------------------------------------------//
		
//		Options one = jk.manage();
//		Window two = one.window();
//		two.maximize();
		//--------> so we can write
		jk.manage().window().maximize();
		
		
		
//		Options six = jk.manage();
//		Timeouts seven = six.timeouts();
//		seven.implicitlyWait(java.time.Duration.ofSeconds(10));//--->get it from time duration store only
		//--------> so we can write
		jk.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
//		Thread.sleep(5000);-------> Static wait
		
		WebElement three = jk.findElement(By.xpath("//a[contains(@class,'_14Me7y')]"));
		three.click();
		
		WebElement four = jk.findElement(By.xpath("//input[contains(@maxlength,'10')]"));
		four.sendKeys("987654321");
		
		String five = four.getAttribute("value");
		System.out.println(five);
		
		WebElement eight = jk.findElement(By.xpath("//span[contains(text(),'CONTINUE')]"));
		String nine = eight.getAttribute("innerText");
		System.out.println(nine);


}}
