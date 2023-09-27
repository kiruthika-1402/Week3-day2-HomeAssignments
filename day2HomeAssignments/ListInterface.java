package week3.day2HomeAssignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		// Sending values to the search field
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
		
		// Click on the search icon
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	    Thread.sleep(3000);
	    
	    // Click men in gender
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		
		// Click fasion bag in category
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
        // Print the items found using gettext method
		String text = driver.findElement(By.xpath("//div[text()='925']")).getText();
		System.out.println(text);
	    
		// Print the list of the brand of the products
		List<WebElement> brandedBags = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(brandedBags);
		
        // Print the list of the bag names
		for (int i = 0; i < brandedBags.size(); i++) {
			
			String text2 = brandedBags.get(i).getText();
			System.out.println(text2);
		}

	}

}
