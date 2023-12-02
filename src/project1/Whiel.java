package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		
		int i = 1;
		while(i <=16 ) {
			
			System.out.println(("student  ")+  i +  "  " + driver.findElement(By.className("op")).getText()+ ("  has been removed"));
			driver.findElement(By.id("selectNow")).click();
			driver.findElement(By.id("remove")).click();
			
			i++;

	}

		for (int s = 0; s<17;s++) {
			System.out.println(("student  ")+  s +  "  " + driver.findElement(By.className("op")).getText()+ ("  has been removed"));
			driver.findElement(By.id("selectNow")).click();
			driver.findElement(By.id("remove")).click();
			
			
		}
		int a=20;
		int b=10;
		
		if(a==b ) {
			
			System.out.println("hello");
		}
		else if (a<b) {
			System.out.println("hi");
		}
		else {
			System.out.println("sorry");
			}
	}

}
