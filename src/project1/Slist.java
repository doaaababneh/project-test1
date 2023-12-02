package project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1:5500/index.html");
		List<WebElement> student= driver.findElements(By.className("op"));
		 
		for(WebElement option :student) {
			
			if(option.getText().equalsIgnoreCase("Doaa")) {
				System.out.println(option.getText()+option);
				continue;
			}
		}
	}

}
