package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// define driver
	WebDriver driver;

	// define page factory
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define page web elements
	@FindBy(id = "email")
	private WebElement emailbtn;

	@FindBy(id = "pass")
	private WebElement passwordbtn;

	@FindBy(id = "send2")
	private WebElement loginbtn;

	// login to application
	public void login() {
		emailbtn.sendKeys("jlyk@gmail.com");
		passwordbtn.sendKeys("P@ssw0rd");
		loginbtn.click();
	}
}
