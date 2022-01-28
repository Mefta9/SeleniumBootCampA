package HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountOption {
	public WebDriver driver;
	@FindBy(xpath = "//*[text()='Personal Account']") WebElement Select;

	public AccountOption (WebDriver driver) {
		this.driver=driver;  // 
		PageFactory.initElements(driver, this); // Element locator factory
}

	public void option() {
		Select.click();
	}
}
