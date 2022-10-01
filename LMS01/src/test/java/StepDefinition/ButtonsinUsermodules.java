package StepDefinition;

import org.testng.Assert;
import PageObjectModel.*;
import Utility.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ButtonsinUsermodules {
	ManageUserPageobject manageUser;
	PaginationPageobject pagination;
	ButtonsPageobject button;
	@Given("User reached LoginPage")
	public void User_is_on_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		button = new ButtonsPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}
	@When("User is on Manage user page after clicking user")
	public void User_is_on_Manage_user_page_after_clicking_user() {
		System.out.println("User Click###");
		manageUser.Usermoduleclick();
	}
	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
		button.AddnewUser();
	}
	@Then("User should see the button with text + icon and Add New User")
	public void user_should_see_the_button_with_text_icon_and_add_new_user() {
		button = new ButtonsPageobject(Helper.getDriver());
		Assert.assertEquals(button.AddNewUserPrence(), "Add New User");
	}
	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String string) {
		Assert.assertEquals("User details", string);
		button.AddnewUserClose();
	}
}









