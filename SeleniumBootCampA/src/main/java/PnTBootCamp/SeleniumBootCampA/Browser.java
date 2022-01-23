package PnTBootCamp.SeleniumBootCampA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\mefta\\eclipse-workspace\\SeleniumBootCampA\\src\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");*/
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\mefta\\eclipse-workspace\\SeleniumBootCampA\\src\\Drivers\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.navigate().to("https://www.Facebook.com");

	/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\mefta\\eclipse-workspace\\SeleniumBootCampA\\src\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to("https://www.Amazon.com");*/
	
	driver.manage().window().maximize(); 
	driver.navigate().refresh();
	Thread.sleep(3000);
	
//	String windowHandler = driver.getWindowHandle(); 
//	System.out.println(windowHandler);
//	
//	String url =driver.getCurrentUrl();
//	System.out.println(url);
	
	
	
	
	}

}
