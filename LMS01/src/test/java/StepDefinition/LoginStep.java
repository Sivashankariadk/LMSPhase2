package StepDefinition;

import java.io.IOException;

import PageObjectModel.BaseClass;
import PageObjectModel.LoginPage;
import Utility.Helper;
import Utility.UserLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		lp = new LoginPage(Helper.getDriver());
	}

	@When("User opens the LMS Website {string}")
	public void user_opens_the_lms_website(String url) {
		Helper.openPage(lp.url);
	}

	@Then("User should see the Login page")
	public void user_should_see_the_login_page() {
		lp.checkTitle();
	}

	@When("User fills the form from the given sheetName\"Data\"")
	public void user_fills_the_form_from_the_given_sheet_name_data() {
		UserLogin ul = new UserLogin();
		try {
			Object data[][] = ul.getTestData("Data");

			String username, password;

			for (int i = 0; i < data.length; i++) {
				username = null;
				password = null;
				for (int j = 0; j < data[i].length; j++) {
					if (j == 0) {
						username = (String) data[i][j];
					}
					if (j == 1) {
						password = (String) data[i][j];
					}
				}
				if (username != null && password != null) {
					if(username.equalsIgnoreCase("null")) {
						username = "";
					}
					if(password.equalsIgnoreCase("null")) {
						password = "";
					}
					System.out.println("User Name: " + username);
					System.out.println("Password: " + password);
					Helper.getDriver().navigate().refresh();
					lp.enterUserName(username);
					lp.enterPassword(password);
					lp.clickLogin();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Then("User should see the LMS Home page")
	public void user_should_see_the_lms_home_page() {
				lp.checkHomePageTitle();
	}

}
