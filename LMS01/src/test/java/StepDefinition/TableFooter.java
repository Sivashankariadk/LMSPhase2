package StepDefinition;

import PageObjectModel.*;
import Utility.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TableFooter {
	ManageUserPageobject manageUser;
	PaginationPageobject pagination;
	@Given("User login in to the LMS website")
	public void user_login_in_to_the_lms_website() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
	}
	@When("User lands Manage user page")
	public void user_lands_manage_user_page() {
		manageUser.Usermoduleclick();
	}
	@Then("User should see the table footer as {string}.")
	public void user_should_see_the_table_footer_as(String Actualtablefooter) {
		pagination = new PaginationPageobject(Helper.getDriver());
	}
}