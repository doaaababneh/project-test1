package project1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sscreen1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://127.0.0.1:5500/index.html");
		
		Date stamptime =new Date();
		String time = stamptime.toString().replace(":", "-");
		//System.out.println(time);
		

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(".//screenshots//"+time+".png"));
		
		int i = 0 ;
		for(i=0;i<17;i++) {
			if(i==17) {
				
			}
			
			driver.findElement(By.id("selectNow")).click();
		driver.findElement(By.id("remove")).click();
			
}

	}

}
