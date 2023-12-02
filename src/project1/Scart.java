package project1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> ele =driver.findElements(By.className("product-name"));
		String []itemNeeded = {"Beetroot","Tomato","Pumpkin","Onion","Orange","Pomegranate","Nuts Mixture","Walnuts"};
			List itemneededList =Arrays.asList(itemNeeded);
			
			
		for(int i = 0;i <ele.size() ;i++) {
			
			String[] item = ele.get(i).getText().split("-");
			
			String formatedtext = item[0].trim();
			
			
			if(itemneededList.contains(formatedtext)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				continue;
			}
			System.out.println(formatedtext);
			

	}

	}}
