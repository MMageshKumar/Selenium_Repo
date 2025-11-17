package org.example.one;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustfornweYear23 {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver jk=new ChromeDriver ();
		
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\LENOVO\\eclipse-workspace"
				+ "\\SeleniumTest1\\chromedriver.exe");
		
		jk.get("https://www.facebook.com/login/");
		
		jk.manage().window().maximize();
		jk.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		WebElement one = jk.findElement(By.xpath("//input[contains(@id,'em')]"));
		one.sendKeys("mmechmagesh334@gmail.com");
		
		List<WebElement> two = jk.findElements(By.xpath("//input[contains(@name,'pass')]"));
		WebElement two1 = two.get(0);
		two1.sendKeys("jak rak");
		
	
		//-----------TakesScreenshot-Interface-----------//
		
	    TakesScreenshot jj=(TakesScreenshot)  jk;  //------> Not a object just a casting/for webdriver to crome via takesscreenshot
		
		 //Get Screen shot
		File frm= jj.getScreenshotAs(OutputType.FILE);
		
		 //location
		
		File to=new File("C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\Sht\\fb.png");
		
		 // location and screenshot merge
		FileUtils.copyFile(frm, to);
		
		
		// Element Screenshot
		
		File frm1 = two1.getScreenshotAs(OutputType.FILE);
		File to1=new File("C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\Sht\\fb1.png");
		FileUtils.copyFile(frm1, to1);
 
		
		System.out.println("complited without error");

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
