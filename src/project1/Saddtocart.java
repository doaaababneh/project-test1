package project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saddtocart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		List<WebElement> ele =driver.findElements(By.className("product-name"));
		
		for(int i = 0;i <ele.size() ;i++) {
			
			String item = ele.get(i).getText();
			System.out.println(item);
			
			if(item.contains("Banana")) {
				System.out.println(i);
				
driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
		}
	}

}
