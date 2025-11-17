package org.example.two;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables28 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver () ;
		
		System.setProperty("WebDriver.ChromeDriver","C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumTest1\\chromedriver.exe");
		
		driver.get("https://www.w3schools.com/css/css_table.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().window().maximize();
		
		List<WebElement> one = driver.findElements(By.id("customers"));   //---> this element store all in index 0, so we can't take them out from here.
		System.out.println(one.get(0).getText());
		
		        // (or) (b'cos both loop expressions are same, you know that variation)
		
//		for (WebElement n:one) {
//			System.out.println(n.getText());
//		}
		
		System.out.println("-------------------------------");
		
		// TagName is useful for WebTable element identification.NOTE
		
		List<WebElement> four = driver.findElements(By.tagName("tr"));  //------> tr contains here 'td' and 'th' both
		
        	for (int i=0 ; i<four.size(); i++)         {
			System.out.println(four.get(i).getText());  }		

        	
    	System.out.println("-------------------");

		
	    List<WebElement> seven = driver.findElements(By.tagName("th")); //------> getting directly from driver
		
		for (int i=0 ; i<seven.size(); i++)            {
			System.out.println(seven.get(i).getText()); }
		
		
		System.out.println("-------------------");
		
		
        List<WebElement> eight = driver.findElements(By.tagName("td"));  //------> getting directly from driver
		
		      for (int i=0 ; i<eight.size(); i++)       {
			System.out.println(eight.get(i).getText());  }
		
		
		      
		      
		      
	     System.out.println("-------NF1-----------");
	     
	     List<WebElement> ekk = driver.findElements(By.tagName("tr"));
	     
	     for(int i=0; i<ekk.size(); i++) {      //---> here take 'th' from 'tr' using nested loop
	    	 WebElement tho = ekk.get(i);
	    	 
	    	 List<WebElement> theen = tho.findElements(By.tagName("th"));  //--> if case this place show is any of error that is not our fault, overload quality fail.
	    	 for (int j=0; j<theen.size(); j++) {
	    		 System.out.println(theen.get(j).getText());
	    	 }
	     }
	     
	     System.out.println("--------NF2-----------");

	     
	    List<WebElement> twel = driver.findElements(By.tagName("tr")); 
		
		for (int k=0; k<twel.size(); k++ ) {
			WebElement thirt = twel.get(k);              //---> here take 'td' from 'tr' using nested loop
			
			List<WebElement> fourt = thirt.findElements(By.tagName("td"));
			for (int l=0; l<fourt.size(); l++) {
				System.out.println(fourt.get(l).getText());
			}
		}
		
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
