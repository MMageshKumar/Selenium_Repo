package org.example.one;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectsss21 {

	public static void main(String[] args) {
		
            WebDriver slt=new ChromeDriver ();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\"
				+ "eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		slt.get("https://www.facebook.com/");
		
		slt.manage().window().maximize();
		slt.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement one = slt.findElement(By.xpath("(//a[@role='button'])[2]"));
		one.click();
		
		
		
		WebElement two=slt.findElement(By.xpath("//select[@title='Day']"));
		
		Select ekk=new Select (two); // this select is just for only for one webElement area
		
		
		
		
		ekk.selectByIndex(2);  // this selects are do both find and click. in index at the list.
		
		ekk.selectByValue("10"); // and non returnable too.
		
		ekk.selectByVisibleText("21");
		
		
		List<WebElement> tho = ekk.getOptions(); // this options is one way to get some option [container]
		                                          //tho mention that is a selection list person
		WebElement three = tho.get(3);
		
		String four = three.getText();
		System.out.println(four);
		
		// in normal for loop
		
		for (int i=0; i<tho.size();i++) {
			
			WebElement five = tho.get(i);
			String six = five.getText();
			System.out.println(six);   }
		
		// enhanced for loop
		
		for (WebElement x:tho) {
			String seven = x.getText();
			System.out.println(seven);}
		
		// for each loop print only addresses
		
		
		
		

	}

}
