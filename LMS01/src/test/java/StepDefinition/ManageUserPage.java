package StepDefinition;

import org.junit.Assert;
import PageObjectModel.*;
import Utility.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
public class ManageUserPage {
	ManageUserPageobject manageUser;
	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		String Title = Helper.getTitle();
		Assert.assertEquals(Title, "LMS");
	}
	@When("User clicks the Tab User")
	public void user_clicks_the_tab() {
		System.out.println("User Click###");
		manageUser.Usermoduleclick();
	}
	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
	}
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
		// manageUser.Usermoduleclick();
	}
	@Then("User should see the page heading as {string}")
	public void user_should_see_the_page_heading_as(String string) {
		Assert.assertEquals("Manage User", string);
	}
}