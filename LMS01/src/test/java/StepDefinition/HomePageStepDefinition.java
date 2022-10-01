package StepDefinition;

import PageObjectModel.BaseClass;
import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import Utility.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDefinition extends BaseClass {
	
	
	@When("User enters <username> and <password>")
	public void user_enters_username_and_password() {
		hp = new HomePage(Helper.getDriver());
		hp.UserName.sendKeys("Siva");
		hp.Password.sendKeys("shan");
		hp.LoginBn.click();
	}

	@Given("User is on the LMS Home page")
	public void user_is_on_the_lms_home_page() {
	    hp.checkTitle();
	}

	@When("User should see the LMS page")
	public void user_should_see_the_lms_page() {
	    
	}

	@Then("Verify the title of the Home page")
	public void verify_the_title_of_the_home_page() {
		hp.checkTitle();
	}

	@Then("User should see a heading with text LMS - Learning Management System on the Home page")
	public void user_should_see_a_heading_with_text_lms_learning_management_system_on_the_home_page() {
		hp.checkTitle();
	}

	@Then("User should see a button with text Program on the menu bar")
	public void user_should_see_a_button_with_text_program_on_the_menu_bar() {
	   hp.checkProgramHeader();
	}

	@Then("User should see a button with text Batch on the menu bar")
	public void user_should_see_a_button_with_text_batch_on_the_menu_bar() {
	   hp.checkBatchHeader();
	}

	@Then("User should see a button with text User on the menu bar")
	public void user_should_see_a_button_with_text_user_on_the_menu_bar() {
	   hp.checkUserHeader();
	}

	@Then("User should see a button with text Assignment on the menu bar")
	public void user_should_see_a_button_with_text_assignment_on_the_menu_bar() {
	   hp.checkAssignmentHeader();
	}

	@Then("User should see a button with text Attendance on the menu bar")
	public void user_should_see_a_button_with_text_attendance_on_the_menu_bar() {
	   hp.checkAttendanceHeader();
	}

	@Then("User should see a button with text Logout on the menu bar")
	public void user_should_see_a_button_with_text_logout_on_the_menu_bar() {
	    hp.checkLogoutHeader();
	}
}
