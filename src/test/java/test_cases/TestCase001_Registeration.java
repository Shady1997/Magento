package test_cases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.PageBase;
import pages.RegistrationPage;

public class TestCase001_Registeration extends TestBase {

	// Register to application
	@Test(priority = 2, groups = "smoke", description = "Register to Magento Web Application")
	private void registration() throws InterruptedException {
		// define obect from home page class
		HomePage homePage = new HomePage(driver);
		RegistrationPage registrationPage = new RegistrationPage(driver);
		homePage.chooseRegister();
		// scroll to middle of page
		PageBase.scrollWithSpecificSize(driver, 300, 300);
		// register to application
		registrationPage.registerNewUser();
		// take screenshot to login page
		PageBase.captureScreenshot(driver, "RegistrationPage");
		// wait for 3 sec
		Thread.sleep(3000);
		// verify login successfully
		PageBase.assertToObjectExistWithGetText(driver, "Thank you for registering with Madison Island");
	}

}
