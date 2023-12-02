package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://127.0.0.1:5500/index.html");
		
		driver.findElement(By.cssSelector("[value='save me']")).click();
		Thread.sleep(5);
		String aletrmaseege =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(aletrmaseege);
		
		

	}

}
