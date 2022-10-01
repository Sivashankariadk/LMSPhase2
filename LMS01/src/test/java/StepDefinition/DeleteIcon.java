package StepDefinition;
import PageObjectModel.*;
import Utility.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DeleteIcon {
	public ManageUserPageobject manageUser;
	PaginationPageobject pagination;
	public DeletePageObject deletepage;
	TableHeaderPageobject tabledhead;
	@Given("User Come into Login")
	public void user_come_into_login() {
		deletepage = new DeletePageObject(Helper.getDriver());
		manageUser = new ManageUserPageobject(Helper.getDriver());
	}
	@When("User Come in to the Manage user page")
	public void user_come_in_to_the_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}
	@Then("User should see the delete icon at the top left corner of the user table")
	public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		deletepage.DeleteButton();
	 }
	@Given("User table is displayed in Page")
	public void user_table_is_displayed_in_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
		deletepage = new DeletePageObject(Helper.getDriver());
	}
	@When("no rows is checked")
	public void no_rows_is_checked() {
		
		tabledhead = new TableHeaderPageobject(Helper.getDriver());
		tabledhead.CheckboxSelect();
		
	}
	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
		deletepage = new DeletePageObject(Helper.getDriver());
		deletepage.DeleteClick();
	}
	@Given("User on manage user page")
	public void user_on_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
		deletepage = new DeletePageObject(Helper.getDriver());
	}
	@When("User checks the rows in user table")
	public void user_checks_the_rows_in_user_table() {
		deletepage.SelectRow();
	}
	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
		System.out.println("DeleteButton Enabled");
	}
	
}