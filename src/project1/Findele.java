package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://login.yahoo.com/");
		 driver.findElement(By.id("login-username")).sendKeys("dodoab20@yahoo.com");
		 driver.findElement(By.className("puree-button-primary")).click();
		 driver.findElement(By.id("mbr-forgot-link")).click();
		 driver.findElement(By.name("verifyYid")).click();
		 driver.findElement(By.cssSelector("input#signin")).click();
		 driver.findElement(By.linkText("a")).click();

	}

}
