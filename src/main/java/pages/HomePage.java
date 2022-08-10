package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// define driver
	WebDriver driver;

	// define page factory
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define page web elements
	@FindBy(xpath = "//a[@href='#header-account']")
	private WebElement accountbtn;

	@FindBy(xpath = "//a[@title='Register']")
	private WebElement registerbtn;

	@FindBy(xpath = "//a[@title='Log In']")
	private WebElement loginbtn;

	// choose login
	public void chooseLogin() {
		accountbtn.click();
		loginbtn.click();
	}

	// choose register
	public void chooseRegister() {
		accountbtn.click();
		registerbtn.click();
	}

}
