package StepDefinition;

import org.testng.Assert;
import PageObjectModel.*;
import Utility.*;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	public class EditDelete {		
		ManageUserPageobject manageUser;
		PaginationPageobject pagination;
		ButtonsPageobject button;
		@Given("User in Login page")
		public void User_cin_Login_page() {
			manageUser = new ManageUserPageobject(Helper.getDriver());
			button = new ButtonsPageobject(Helper.getDriver());
			manageUser.Usermoduleclick();
			
		}
			@When("User come to Manage user page after clicking User Tab")
			public void User_comes_to_Manage_user_page_after_clicking_user() {
				
				System.out.println("User Click###");
				manageUser.Usermoduleclick();
			}
			
			@Then("User should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
			public void user_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
				
				Assert.assertTrue(button.EditDeletePrence().contains("Edit / Delete"));
			  
			}
			@Given("User table is displayed in UserPage")
			public void User_table_is_displayed_in_User_page() {
				manageUser = new ManageUserPageobject(Helper.getDriver());
				manageUser.Usermoduleclick();
				
			}
			@When("User clicks Edit button")
			public void user_clicks_edit_button() {
			
				button = new ButtonsPageobject(Helper.getDriver());
				button.EditDeleteClick();
			   
			}
			@Then("{string} dialog box should be displayed for editing")
			public void dialog__box_should_be_displayed_for_editing(String string) {
				
				button.EditDeleteButtonclose();
			    
			}
			@Given("User table in manage user page")
			public void User_table_in_manage_user_page() {
				button = new ButtonsPageobject(Helper.getDriver());
				manageUser = new ManageUserPageobject(Helper.getDriver());
				manageUser.Usermoduleclick();
				
			}
			
			@When("User clicks delete button")
			public void user_clicks_delete_button() {
				button.DeleteClick();
			}
			@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete \\(selected user name) ? , button with text No , the button with text yes and close\\(X) icon")
			public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete_selected_user_name_button_with_text_no_the_button_with_text_yes_and_close_x_icon() {
			   				button.DeleteClose();	
			}
				}