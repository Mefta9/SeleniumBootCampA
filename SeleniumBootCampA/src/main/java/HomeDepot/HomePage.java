package HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	//1. Locator for My Account to click on HomePage
	@FindBy(id = "headerMyAccountTitle") WebElement MyAccount;
	@FindBy(xpath = "//*[text()='Register']") WebElement Register;
	
	//2. Create a page factory constructor
	// see the 3 lines below- to use, just change the class name.

	public HomePage (WebDriver driver) {
		this.driver=driver;  // 
		PageFactory.initElements(driver, this); // Element locator factory
		
	}
	
	public void MyAcc() {
		MyAccount.click();
	}
	
	//3. Method
	public void ClickOnRegister(){
		Register.click();
	}
	
	
}
