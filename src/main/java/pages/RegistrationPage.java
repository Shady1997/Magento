package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	// define driver
	WebDriver driver;

	// define page factory
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define page web elements
	@FindBy(id = "firstname")
	private WebElement fnamebtn;

	@FindBy(id = "lastname")
	private WebElement lnametbtn;

	@FindBy(id = "email_address")
	private WebElement emailbtn;

	@FindBy(id = "password")
	private WebElement passwordbtn;

	@FindBy(id = "confirmation")
	private WebElement confirmpasswordbtn;

	@FindBy(id = "is_subscribed")
	private WebElement subscribebtn;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submitbtn;

	// register new user
	public void registerNewUser() {
		fnamebtn.sendKeys(PageBase.generateString(5));
		lnametbtn.sendKeys(PageBase.generateString(5));
		emailbtn.sendKeys(PageBase.generateString(4) + "@gmail.com");
		passwordbtn.sendKeys("P@ssw0rd");
		confirmpasswordbtn.sendKeys("P@ssw0rd");
		subscribebtn.click();
		submitbtn.click();
	}
}
