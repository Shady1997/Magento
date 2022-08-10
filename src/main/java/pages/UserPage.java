package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	// define driver
	WebDriver driver;

	// define page factory
	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define page web elements
	@FindBy(xpath = "//li[@class='level0 nav-1 first parent']")
	private WebElement womanItems;

	@FindBy(xpath = "//a[text()='Dresses & Skirts']")
	private WebElement dressItem;

	@FindBy(xpath = "//a[text()='Pants & Denim']")
	private WebElement pantsItem;

	public void hoverWebElement() {
		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the woman tab.
		action.moveToElement(womanItems).perform();

		// Performing the mouse hover action on the dress and shirts tab.
		action.moveToElement(dressItem).perform();
	}

	public void choosePantsItem() {
		pantsItem.click();
	}
}
