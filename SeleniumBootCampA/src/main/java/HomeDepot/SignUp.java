package HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public WebDriver driver; 
	
	@FindBy(id = "email") WebElement email;
	@FindBy(id = "password-input-field") WebElement pass;
	@FindBy(id = "zipCode") WebElement Zip;
	@FindBy(id = "phone") WebElement phone;
	@FindBy(xpath = "//*[@for = 'kmsi-checkbox']") WebElement chkboxA;
	@FindBy(xpath = "//*[@for = 'verify-phone-checkbox']") WebElement chkboxB;
	@FindBy(id = "recaptcha-anchor-label") WebElement Recaptcha;
	@FindBy(xpath = "//span[text()='Create an Account']") WebElement submit;

	public SignUp (WebDriver driver) {
		this.driver=driver;  // 
		PageFactory.initElements(driver, this); // Element locator factory
}
	public void emailc() {
		email.sendKeys("mefta@gmail.com");
	}
	
	public void password() {
		pass.sendKeys("Iam@myhome9");
	}
	
	public void Zipc() {
		Zip.sendKeys("20855");
	}
	
	public void phonen() {
		phone.sendKeys("3012224312");
		
	}
	
	public void checkbox1() {
		chkboxA.click();
	}
	public void checkbox2() {
		chkboxB.click();
	}
	
	public void robot() {
		Recaptcha.click();
	}
	
	public void submitApp() {
		submit.click();
	}
	
}

