package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Split {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://github.com/");
		driver.findElement(By.className("flex-shrink-0")).click();
		driver.findElement(By.cssSelector("input.js-login-field")).sendKeys("doaaababneh1111@gmail.com");
		driver.findElement(By.id("password")).sendKeys("doaaababnehdoaa11@");
		driver.findElement(By.cssSelector("input.btn-block")).click();
		Thread.sleep(3000);
		
		String GitHub =driver.findElement(By.cssSelector("h4.mb-2")).getText();
		String  []a =GitHub.split("repository");	
		
		System.out.println(a[2]);
		
	}

}
