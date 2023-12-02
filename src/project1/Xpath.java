package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@placeholder=' ']")).sendKeys("aaa@ii.com");
		driver.findElement(By.linkText("Forgotten&nbsp;username?")).click();
	}

}
