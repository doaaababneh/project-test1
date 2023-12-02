package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://web.telegram.org/k/");
		Assert.assertEquals((driver.findElement(By.className("i18n")).getText()), "Log in to Telegram by QR Code");
	}

}
