package project1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		
		
		
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("yahoo mail");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.pcTkSc")).click();
		driver.findElement(By.cssSelector("h3.LC20lb")).click();
		driver.findElement(By.cssSelector("a.fuji-button-link")).click();
		Assert.assertEquals((driver.findElement(By.cssSelector("h1.title_title--dark")).getText()),"Sign in to Yahoo&nbsp;Mail");
		
	}

}
