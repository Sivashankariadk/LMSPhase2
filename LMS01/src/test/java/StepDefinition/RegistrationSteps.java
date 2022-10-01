package StepDefinition;



import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjectModel.*;
import Utility.Helper;
import Utility.*;

public class RegistrationSteps extends BaseClass{

	@Given("User landed on the LMS Website")
	public void user_landed_on_the_lms_website() {
	    registrationPage = new RegistrationPage(Helper.getDriver());
	    Assert.assertEquals(Helper.getTitle(), "LMS"); 			
	}
	
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		try {
		registrationPage.ClickBtnRegister();
		}catch(Exception ex) {
			System.out.println("WARNING! Register button does not exist");
		}
	}
	
	@Then("User sees the heading on the form as {string}")
	public void user_sees_the_heading_on_the_form_as(String expectedHeader) {
		try {
		 String Header = registrationPage.getRegSiteHeader();
		 System.out.println("header: "+Header);
		 Assert.assertEquals(Header, expectedHeader);
		}catch(Exception ex) {
			System.out.println("WARNING! Heading does not exist");
		}
	}
	
	@Given("User is on the Registration Page")
	public void user_is_on_the_registration_Page() {
		try {
		registrationPage.getRegSiteHeader();
		}catch(Exception ex) {
			System.out.println("WARNING! Registeration page header does not exist");
		}
	}
	
	@Then("User sees a button with text {string} on the form")
	public void user_sees_a_button_with_text_on_the_form(String expectedvalue) {
		try {
		String LoginBtnTxt = registrationPage.GetLoginBtnText();
		 Assert.assertEquals(LoginBtnTxt,expectedvalue);
		}catch(Exception ex) {
			System.out.println("WARNING! Login button does not exist");
		}	    
	}
	
	@Then("User Clicks the Log in button")
	public void user_clicks_the_log_in_button() {
		try {
		registrationPage.ClickBtnLogin();
		}catch(Exception ex) {
			System.out.println("WARNING! Login button does not exist");
		}
	}
	
	@Then("User lands on Log in page")
	public void user_lands_on_log_in_page() {
		try {
		Boolean isVisible = registrationPage.isLoginPageHeaderVisible();
		Assert.assertTrue(isVisible);
		}catch(Exception ex) {
			System.out.println("WARNING! Login page header does not exist");
		}
	}
	@Then("User lands on Registration Page")
	public void user_lands_on_registration_Page() {
		try {
		Boolean isVisible = registrationPage.isLoginPageHeaderVisible();
		Assert.assertTrue(isVisible);
		}catch(Exception ex) {
			System.out.println("WARNING! Login page header does not exist");
		}
	    
	}
		
	@Then("User see a button with text {string} on the form")
	public void user_see_a_button_with_text_on_the_form(String expectedvalue) {
		try {
		String SignUpBtnTxt = registrationPage.GetSignUpBtnText();
		 Assert.assertEquals(SignUpBtnTxt,expectedvalue);
		}
		catch(Exception ex) {
			System.out.println("WARNING! Signup button does not exist");
		}		    
	}
	
	
	@When("User fills the First Name in Alphabets only")
	public void user_fills_the_first_name_in_alphabets_only() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.FirstName, "FirstName One");
		}catch(Exception ex) {
			System.out.println("WARNING! First Name control does not exist");
		}
	}
	
	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed() {
		try {
		String FirstNameDisplay = registrationPage.getRegFormControlValues(RegFormControls.FirstName);
		 Assert.assertEquals(FirstNameDisplay,"FirstName One");
		}catch(Exception ex) {
			System.out.println("WARNING! First Name control does not exist");
		}
	}
	
	@When("User fills the Last Name in Alphabets only")
	public void user_fills_the_last_name_in_alphabets_only() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.LastName, "LastName Two");
		}catch(Exception ex) {
			System.out.println("WARNING! Last Name control does not exist");
		}
	}
	
	@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed() {
		try {
		String LastNameDisplay = registrationPage.getRegFormControlValues(RegFormControls.LastName);
		 Assert.assertEquals(LastNameDisplay,"LastName Two");
		 
		}catch(Exception ex) {
			System.out.println("WARNING! Last Name control does not exist");
		}
	}
	
	@When("User fills the Address\\(House number) Field using Alpha Numerics and or Symbols")
	public void user_fills_the_address_house_number_field_using_alpha_numerics_and_or_symbols() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Address,"12345");
		}catch(Exception ex) {
			System.out.println("WARNING! Address control does not exist");
		}
	}
	
	@Then("The Address will be displayed")
	public void the_address_will_be_displayed() {
		try {
		String AddressDisplay = registrationPage.getRegFormControlValues(RegFormControls.Address);
		 Assert.assertEquals(AddressDisplay,"12345");
		}catch(Exception ex) {
			System.out.println("WARNING! Address control does not exist");
		}
	}
	
	@When("User fills the Street name Field using Alpha Numerics and or Symbols")
	public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.StreetName,"ABC Street");
		}catch(Exception ex) {
			System.out.println("WARNING! StreetName control does not exist");
		}
	}
	
	@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed() {
		try {
		String StreetDisplay = registrationPage.getRegFormControlValues(RegFormControls.StreetName);
		 Assert.assertEquals(StreetDisplay,"ABC Street");
		}catch(Exception ex) {
			System.out.println("WARNING! StreetName control does not exist");
		}
	}
	
	@When("User fills the {int} digit Zip code using Numbers only")
	public void user_fills_the_digit_zip_code_using_numbers_only(Integer int1) {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Zip,"97229");
		}catch(Exception ex) {
			System.out.println("WARNING! Zip control does not exist");
		}
	}
	
	@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed() {
		try {
		String ZipCodeDisplay = registrationPage.getRegFormControlValues(RegFormControls.Zip);
		 Assert.assertEquals(ZipCodeDisplay,"97229");
		}catch(Exception ex) {
			System.out.println("WARNING! Zip control does not exist");
		}
	}
	
	@When("User fills the City Name in Alphabets only")
	public void user_fills_the_city_name_in_alphabets_only() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.City,"Portland");
		}catch(Exception ex) {
			System.out.println("WARNING! City control does not exist");
		}
	}
	
	@Then("The City Name will be displayed")
	public void the_city_name_will_be_displayed() {
		try {
		String cityDisplay = registrationPage.getRegFormControlValues(RegFormControls.City);
		 Assert.assertEquals(cityDisplay,"97229");
		}catch(Exception ex) {
			System.out.println("WARNING! City control does not exist");
		}
	}
	
	@When("User selects the respective State Name from the DropBox")
	public void user_selects_the_respective_state_name_from_the_drop_box() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.State,"Oregon");
		}catch(Exception ex) {
			System.out.println("WARNING! State control does not exist");
		}
	}
	
	@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed() {
		try {
		String stateDisplay = registrationPage.getRegFormControlValues(RegFormControls.State);
		 Assert.assertEquals(stateDisplay,"Oregon");
		}catch(Exception ex) {
			System.out.println("WARNING! State control does not exist");
		}
	}
	
	@When("User fills the valid {int} digit Mobile number in Numerics")
	public void user_fills_the_valid_digit_mobile_number_in_numerics(Integer int1) {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.PhoneNumber,"5033334444");
		}catch(Exception ex) {
			System.out.println("WARNING! PhoneNo control does not exist");
		}
	}
	
	@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed() {
		try {
		String phnoDisplay = registrationPage.getRegFormControlValues(RegFormControls.PhoneNumber);
		 Assert.assertEquals(phnoDisplay,"5033334444"); 		 
		}catch(Exception ex) {
			System.out.println("WARNING! PhoneNo control does not exist");
		}
	}
	
	@When("User Selects the Date of Birth from the Calender")
	public void user_selects_the_date_of_birth_from_the_calender() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Birthdate,"01-02-1999");
		}catch(Exception ex) {
			System.out.println("WARNING! BirthDate control does not exist");
		}
	}
	
	@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed() {
		try {
		String BDDisplay = registrationPage.getRegFormControlValues(RegFormControls.Birthdate);
		 Assert.assertEquals(BDDisplay,"01-02-1999");
		}catch(Exception ex) {
			System.out.println("WARNING! Birthdate control does not exist");
		}
	}
	
	@When("User fills the valid unique UserName")
	public void user_fills_the_valid_unique_user_name() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"TestOne");
		}catch(Exception ex) {
			System.out.println("WARNING! UserName control does not exist");
		}
	}
	
	@Then("UserName will be displayed")
	public void user_name_will_be_displayed() {
		try {
		String UNDisplay = registrationPage.getRegFormControlValues(RegFormControls.UserName);
		 Assert.assertEquals(UNDisplay,"TestOne");
		}catch(Exception ex) {
			System.out.println("WARNING! UserName control does not exist");
		}
	}
	
	@When("User fills the valid Password with {int} Upper case, {int} Numeric and {int} special charecter and {int} charecters")
	public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(Integer int1, Integer int2, Integer int3, Integer int4) {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Password,"Test@&111");
		}catch(Exception ex) {
			System.out.println("WARNING! Password control does not exist");
		}
	}
	
	@Then("User Password will  be displayed")
	public void user_password_will_be_displayed() {
		try {
		String PWDDisplay = registrationPage.getRegFormControlValues(RegFormControls.Password);
		 Assert.assertEquals(PWDDisplay,"Test@&111");
		}catch(Exception ex) {
			System.out.println("WARNING! Password control does not exist");
		}
	}
	
	@When("User fills the valid email ID")
	public void user_fills_the_valid_email_id() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Email,"Test@gmail.com");
		}catch(Exception ex) {
			System.out.println("WARNING! email ID control does not exist");
		}
	}
	
	@Then("email ID will be Displayed")
	public void email_id_will_be_displayed() {
		try {
		String emailDisplay = registrationPage.getRegFormControlValues(RegFormControls.Email);
		 Assert.assertEquals(emailDisplay,"Test@gmail.com");
		 registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! emaildID control does not exist");
		}
	}
	
	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
		try {
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	    
	}

	@Then("User should get a message\"Please fill all fields above\"")
	public void user_should_get_a_message_please_fill_all_fields_above() {
		try {
		String signUpErrorMsg =registrationPage.getErrMsgSignUp();
		Assert.assertEquals("Please fill all fields above",signUpErrorMsg);	
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid First Name")
	public void user_clicks_sign_up_button_with_invalid_first_name() {
        try {
		registrationPage.setRegFormControlValues(RegFormControls.FirstName,"aaaaaaaaaaaaaa");
		registrationPage.ClickBtnSignUp();
        }catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid First Name\"")
	public void user_should_get_a_message_please_fill_valid_first_name() {
		try {
		String FirstNameErrorMsg =registrationPage.getFNErrMsg();
		Assert.assertEquals("Please fill valid First Name",FirstNameErrorMsg);	
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid Last Name")
	public void user_clicks_sign_up_button_with_invalid_last_name() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.LastName,"bbbbbbbbbbbbbbbb");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid Last Name\"")
	public void user_should_get_a_message_please_fill_valid_last_name() {
		try {
		String LastNameErrorMsg =registrationPage.getLNErrMsg();
		Assert.assertEquals("Please fill valid Last Name",LastNameErrorMsg);	
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid Address")
	public void user_clicks_sign_up_button_with_invalid_address() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Address,"####");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid Address\"")
	public void user_should_get_a_message_please_fill_valid_address() {
		try {
		String AddressErrorMsg =registrationPage.getAddrsErrMsg();
		Assert.assertEquals("Please fill valid Address",AddressErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid Street Name")
	public void user_clicks_sign_up_button_with_invalid_street_name() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.StreetName,"####");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid Street Name\"")
	public void user_should_get_a_message_please_fill_valid_street_name() {
		try {
		String streetErrorMsg =registrationPage.getStreetErrMsg();
		Assert.assertEquals("Please fill valid Street Name",streetErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	
	@When("User clicks Sign Up button with invalid Zip")
	public void user_clicks_sign_up_button_with_invalid_zip() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Zip,"####");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid Zip\"")
	public void user_should_get_a_message_please_fill_valid_zip() {
		try {
		String zipErrorMsg =registrationPage.getZipErrMsg();
		Assert.assertEquals("Please fill valid Zip",zipErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid  City")
	public void user_clicks_sign_up_button_with_invalid_city() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.City,"####");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid City\"")
	public void user_should_get_a_message_please_fill_valid_city() {
		try {
		String cityErrorMsg =registrationPage.getCityErrMsg();
		Assert.assertEquals("Please fill valid City",cityErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button without selecting  State")
	public void user_clicks_sign_up_button_without_selecting_state() {
		try {
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please select State\"")
	public void user_should_get_a_message_please_select_state() {
		try {
		String stateErrorMsg =registrationPage.getStateErrMsg();
		Assert.assertEquals("Please select State",stateErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid Phone Number")
	public void user_clicks_sign_up_button_with_invalid_phone_number() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.PhoneNumber,"####");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid Phone Number\"")
	public void user_should_get_a_message_please_fill_valid_phone_number() {
		try {
		String PhoneNoErrorMsg =registrationPage.getPhNoErrMsg();
		Assert.assertEquals("Please fill valid Phone Number",PhoneNoErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button without selecting BirthDate")
	public void user_clicks_sign_up_button_without_selecting_birth_date() {
		try {
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please select BirthDate\"")
	public void user_should_get_a_message_please_select_birth_date() {
		try {
		String birthDtErrorMsg =registrationPage.getBithDtErrMsg();
		Assert.assertEquals("Please select BirthDate",birthDtErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid UserName")
	public void user_clicks_sign_up_button_with_invalid_user_name() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"####");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid UserName\"")
	public void user_should_get_a_message_please_fill_valid_user_name() {
		try {
		String userNameErrorMsg =registrationPage.getUNErrMsg();
		Assert.assertEquals("Please fill valid UserName",userNameErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with invalid Password")
	public void user_clicks_sign_up_button_with_invalid_password() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.Password,"#");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Please fill valid Password \"")
	public void user_should_get_a_message_please_fill_valid_password() {
		try {
		String passwordErrorMsg =registrationPage.getPwdErrMsg();
		Assert.assertEquals("Please fill valid Password",passwordErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User clicks Sign Up button with existing User name")
	public void user_clicks_sign_up_button_with_existing_user_name() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"TestOne");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String string) {
		try {
		String UnAlreadyexistsErrorMsg =registrationPage.getUNExistsInfoErrMsg();
		Assert.assertEquals(string,UnAlreadyexistsErrorMsg);
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@When("User enters all Field value and click Sign Up button.")
	public void user_enters_all_field_value_and_click_Sign_Up_button() {
		try {
		registrationPage.setRegFormControlValues(RegFormControls.FirstName,"LMSUI");
		registrationPage.setRegFormControlValues(RegFormControls.LastName,"Application");
		registrationPage.setRegFormControlValues(RegFormControls.Address,"12345");
		registrationPage.setRegFormControlValues(RegFormControls.StreetName,"NE West Ave");
		registrationPage.setRegFormControlValues(RegFormControls.City,"Beaverton");
		registrationPage.setRegFormControlValues(RegFormControls.State,"Portland");
		registrationPage.setRegFormControlValues(RegFormControls.Zip,"97229");
		registrationPage.setRegFormControlValues(RegFormControls.Birthdate,"01-01-1987");
		registrationPage.setRegFormControlValues(RegFormControls.PhoneNumber,"5033331234");
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"LMSLMS");
		registrationPage.setRegFormControlValues(RegFormControls.Password,"Hello@123");
		registrationPage.setRegFormControlValues(RegFormControls.Email,"LMSLMS@gmail.com");
		registrationPage.ClickBtnSignUp();
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}

	@Then("User should get a message\"Registeration successful\"")
	public void user_should_get_a_message_registeration_successful() {
		try {
		String text = registrationPage.getSuccessfulSignUpMsg() ;
		Assert.assertEquals(text,"Registeration successful");
		}catch(Exception ex) {
			System.out.println("WARNING! This control does not exist");
		}
	}	
	}


