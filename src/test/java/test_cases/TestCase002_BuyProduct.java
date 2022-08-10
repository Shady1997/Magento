package test_cases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.PageBase;
import pages.PantsPage;
import pages.UserPage;

public class TestCase002_BuyProduct extends TestBase {

	// define page objects
	HomePage homePage;
	LoginPage loginPage;
	UserPage userPage;
	PantsPage pantsPage;

	// Login to application
	@Test(priority = 3, groups = "smoke", description = "Login to Magento Web Application")
	private void login() throws InterruptedException {
		// define object from home page class
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.chooseLogin();
		// scroll to middle of page
		PageBase.scrollWithSpecificSize(driver, 300, 300);
		// register to application
		loginPage.login();
		// take screenshot to login page
		PageBase.captureScreenshot(driver, "LoginPage");
		// wait for 3 sec
		Thread.sleep(3000);
		// verify login successfully
		PageBase.assertToObjectExistWithGetText(driver, "My Dashboard");
	}

	// hover woman tab
	@Test(priority = 4, groups = "smoke", description = "Hover Woman List")
	private void hoverWomanList() throws InterruptedException {
		userPage = new UserPage(driver);
		userPage.hoverWebElement();
		// take screenshot to hover the woman item
		PageBase.captureScreenshot(driver, "hoverwomanitem");
		// wait for 3 sec
		Thread.sleep(3000);
		userPage.choosePantsItem();
		// wait for 3 sec
		Thread.sleep(3000);
	}

	// add item to card
	@Test(priority = 5, groups = "smoke", description = "Add new Item to card and check grand total")
	private void addItemToCard() throws InterruptedException {
		pantsPage = new PantsPage(driver);
		pantsPage.addNewItem();
		// take screenshot to check grand total
		PageBase.captureScreenshot(driver, "totalprice");
		assertEquals(true, pantsPage.checkGrandTotal() <= 350.00, "Total grand not match expected");
	}
}
