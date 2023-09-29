package week3.day2HomeAssignments;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
       
		ChromeDriver driver = new ChromeDriver();
	    
		// To maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// To load the url
		driver.get("https://www.amazon.in/");
		
		// locating by id and sending values to the search field
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
	    
		// locating by id and click the search icon
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// locate all webelements using class
		List<WebElement> allmobileprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    
		// declare a list to store all the prices
		List<Integer> allprice = new LinkedList<Integer>();
		
		// declare for each loop to iterate all the webelements from the list
		for (WebElement mobileprice : allmobileprice) {
		    
			// Retrive the text from the webelements
			String text = mobileprice.getText();
			
			// Remove comma from the string
			String pricetext = text.replaceAll("[^0-9]", "");
		    
			// To convert string into integer
			int price = Integer.parseInt(pricetext);
		    
			// To add integer into list
			allprice.add(price);	
		}
		    // Sorted the list in ascending order
		    Collections.sort(allprice);
		    // To print 
		    System.out.println(allprice);
		    
		    // To print the least price of the mobile 
		    System.out.println("lowest price is :"+ allprice.get(0));
		    
		

	}

}
