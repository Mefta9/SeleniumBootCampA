package PnTBootCamp.SeleniumBootCampA;

import org.testng.annotations.Test;

import HomeDepot.AccountOption;
import HomeDepot.HomePage;
import HomeDepot.SignUp;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignUpHomeDepot {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
  
	  HomePage ob=new HomePage(driver); // called class with constructor (driver value)
	  ob.MyAcc();
	  Thread.sleep(3000);
	  ob.ClickOnRegister();
	  Thread.sleep(3000);
	  AccountOption oj=new AccountOption(driver);
	  oj.option();
	  Thread.sleep(3000);
	  SignUp oc=new SignUp(driver);
	  oc.emailc();
	  oc.password();
	  oc.Zipc();
	  oc.phonen();
	  oc.checkbox1();
	  oc.checkbox2();
	  oc.robot();
	  oc.submitApp();
  
  
  
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  //SetUp the WebSite
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mefta\\eclipse-workspace\\SeleniumBootCampA\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize(); 
		driver.navigate().refresh();
		Thread.sleep(3000);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
