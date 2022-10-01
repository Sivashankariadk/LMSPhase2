package StepDefinition;

import PageObjectModel.*;
import Utility.*;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pagination {
	ManageUserPageobject manageUser;
	PaginationPageobject pagination;

	@Given("User is on Homeapage after Login")
	public void user_is_on_homeapage_after_login() throws InterruptedException {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		String Title = Helper.getTitle();
		Assert.assertEquals(Title, "LMS");
		pagination = new PaginationPageobject(Helper.getDriver());
	}

	@When("User is on the Manage user page after User click")
	public void user_is_on_the_manage_user_page_after_user_click() throws InterruptedException {

		System.out.println("User Click###");
		manageUser.Usermoduleclick();
		Thread.sleep(2000);
	}

	@Then("User should see the pagination controls below data table")
	public void user_should_see_the_pagination_controls_below_data_table() throws InterruptedException {
		Thread.sleep(2000);
		pagination.PaginationPresence();
		System.out.println("##User can see pagination controls below data table");
	}

	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		System.out.println("User is on manage user page");
		manageUser.Usermoduleclick();
	}

	@When("Manage user table has less than or equal to {int} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(Integer int1) {
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	}

	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
	}

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}

	@When("User cliks next link of pagination")
	public void user_cliks_next_link_of_pagination() {
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
	}

	@Given("last page of User records are displayed")
	public void last_page_of_user_records_are_displayed() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}

	@When("User cliks previous link of pagination")
	public void user_cliks_previous_link_of_pagination() {
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
	}

	@When("User clicks << icon in pagination")
	public void user_clicks_icon_in_pagination1() {
	}

	@Then("User should see the First page of the table")
	public void user_should_see_the_first_page_of_the_table() {
	}

	@When("User clicks >> icon in pagination")
	public void user_clicks_icon_in_pagination() {
	}

	@Then("User should see the last page of the table")
	public void user_should_see_the_last_page_of_the_table() {
	}

	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
		pagination = new PaginationPageobject(Helper.getDriver());
	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() {
	}

	@Then("User should see the text  {string} below the user table")
	public void user_should_see_the_text_below_the_user_table(String string) {
		pagination.paginationText();
	}
}