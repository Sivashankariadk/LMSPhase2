package StepDefinition;
import PageObjectModel.*;
import Utility.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TableHeader {
	ManageUserPageobject manageUser;
	PaginationPageobject pagination;
	ButtonsPageobject button;
	TableHeaderPageobject table;
	@Given("User is on  Login page")
	public void user_is_on_login_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		button = new ButtonsPageobject(Helper.getDriver());
		table = new TableHeaderPageobject(Helper.getDriver());
	}
	@When("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() {
		manageUser.Usermoduleclick();
	}
	@Then("User should see the table header as \"Empty checkbox-icon , ID with sorticon, Name with Sorticon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void user_should_see_the_table_header_as_empty_checkbox_icon_id_with_sorticon_name_with_sorticon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {
		table.TableHeadingPresence();
	}
	@Given("User in manage user page")
	public void user_in_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		button = new ButtonsPageobject(Helper.getDriver());
		table = new TableHeaderPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}
	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
		table.CheckboxSelect();
	}
	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
	}
}
