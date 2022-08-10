package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PantsPage {

	// define driver
	WebDriver driver;

	// define page factory
	public PantsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define page web elements
	@FindBy(xpath = "(//a[text()='View Details'])[2]")
	private WebElement viewDetailsButton;

	@FindBy(id = "attribute92")
	private WebElement itemColor;

	@FindBy(id = "attribute180")
	private WebElement itemSize;

	@FindBy(xpath = "(//button[@class='button btn-cart'])[1]")
	private WebElement addToCardbtn;

	@FindBy(xpath = "(//span[@class='price'])[5]")
	private WebElement grandTotal;

	@FindBy(xpath = "(//button[@class='button btn-proceed-checkout btn-checkout'])[2]")
	private WebElement proceedToCheckout;

	// add item to card
	public void addNewItem() throws InterruptedException {
		viewDetailsButton.click();
		Thread.sleep(2000);
		PageBase.scrollWithSpecificSize(driver, 300, 300);
		Select selectColor = new Select(itemColor);
		selectColor.selectByIndex(1);
		Select selectSize = new Select(itemSize);
		selectSize.selectByIndex(1);
		addToCardbtn.click();
		PageBase.scrollWithSpecificSize(driver, 300, 300);
		Thread.sleep(2000);
	}

	// check grand total
	public double checkGrandTotal() {
		return Double.parseDouble(grandTotal.getText().toString().substring(1));
	}
}
