package MnpStepDefinition;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	@Test(priority = 1)
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {

		TestBase.initialization();
	}
	@Test(priority = 2)
	@When("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("Log in to Facebook", title);
	}

	@Test(priority = 3)
	@Then("^user login with username and password$")
	public void user_enters_username_and_password() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 4)
	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String homeTitle = homePage.validateHomePageTitle();
		Assert.assertEquals("Log in to Facebook", homeTitle);
	}

	@Test(priority = 5)
	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		Thread.sleep(3000);
		boolean flag = homePage.verifyCorrectUserName();
		Assert.assertEquals(true, flag);
	}

}
