package project1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\webdriver\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.gecho.driver", "C:\\gecko\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ASUS\\Desktop\\webdriver\\Edge\\msedgedriver.exe");
		
WebDriver driver = new ChromeDriver ();
WebDriver driver1 =new FirefoxDriver();
WebDriver driver2 =new EdgeDriver();

driver.get("https://www.youtube.com/");
driver1.get("https://www.youtube.com/");
driver2.get("https://www.youtube.com/");




	}

}
