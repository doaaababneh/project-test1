package project1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scartveg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		 List<WebElement> ele =driver.findElements(By.className("product-name"));
		
		 
		 String[]	veg = {"Cauliflower","Tomato","Mushroom","Onion","Mango","Pomegranate","Almonds"};
		 String []   fro = {"Cucumber","Beans","Potato","Apple","Musk Melon","Raspberry","Pista"};
		  List itemvegList = Arrays.asList(veg);
		  List itemfroList = Arrays.asList(fro);
		  
		  for(int i=0;  i<ele.size() ;i++) {
			 String[] items = ele.get(i).getText().split("-");
			 String modText= items[0].trim();
			 
			 if(itemvegList.contains(modText)) {
			for(int k =1;k<10;k++) {
				 
			 driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
			 }
			 }
			 else if (itemfroList.contains(modText)) {
				 
				 for(int e =1;e <15;e++) {
					 
					 driver.findElements(By.xpath("//a[@class='increment']")).get(i).click(); 
					 
				 }
				 
		  }
		  }
		  }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}
