package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	// define driver
	WebDriver driver;

	// define page factory
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define page web elements
	@FindBy(id = "login-email")
	private WebElement email;

	@FindBy(id = "login-password")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement loginbtn;

}
