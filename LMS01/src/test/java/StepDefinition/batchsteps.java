package StepDefinition;


import PageObjectModel.BaseClass;
import PageObjectModel.Batch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Utility.Helper;

public class batchsteps extends BaseClass{
	@Given("User is on the LMS Home program page")
	public void user_is_on_the_lms_home_program_page() {
		bat=new Batch(Helper.getDriver());
	}

	@When("User clicks Batch button on top")
	public void user_clicks_batch_button_on_top() {
	    bat.batchbuttonclick();
	}

	@Then("User should see a heading with text Manage Batch on the page")
	public void user_should_see_a_heading_with_text_manage_batch_on_the_page() {
	    
	    bat.onbatchpage();
	}
	@Given("User is on the LMS Home Program pages")
	public void user_is_on_the_lms_home_program_pages() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	}


	@When("User is on Batch page1")
	public void user_is_on_batch_page1() {
	   bat.batchbuttonclick();
		bat.onbatchpage();
	}

	@Then("Verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	    bat.DeleteDisabled();
	}
	@Given("User is on the LMS Homes page")
	public void user_is_on_the_lms_homes_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	}

	@When("User is on Batch pages")
	public void user_is_on_batch_pages() {
		bat.batchbuttonclick();
		bat.onbatchpage();
	}

	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	    bat.verifyrow5();
	}
	@Given("User is on Batch pagess")
	public void user_is_on_batch_pagess() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	}

	@When("user clicks on search box with {string} entered in it")
	public void user_clicks_on_search_box_with_entered_in_it(String bnamee) {
	    bat.searchBatchname(bnamee);
	}

	@Then("records of that  {string} are displayed")
	public void records_of_that_are_displayed(String dgdg) {
	    bat.searchdeletedbatchname(dgdg);
	}
	@Given("User is on Batch page")
	public void user_is_on_batch_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on Edit button1")
	public void user_clicks_on_edit_button_1() {
	   bat.batchbuttonclick();
		bat.editbutton();
	}

	@Then("User lands on Batch Details form.")
	public void user_lands_on_batch_details_form() {
	    bat.batchform();
	}

	@Given("User is on Batch details page")
	public void user_is_on_batch_details_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User {string}")
	public void user(String editbatchname) {
	    bat.editbutton();
		bat.editbatchname(editbatchname);
	}

	@Then("User can see edited Name")
	public void user_can_see_edited_name() {
	    bat.editedbatchname();
	}
	@Given("User ison Batch details page")
	public void user_ison_batch_details_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user edit {string}")
	public void user_edit(String editbatchdescrib) {
		 bat.editbutton();
	    bat.editbatchdescribtion(editbatchdescrib);
	}

	@Then("User can see edited descricption")
	public void user_can_see_edited_descricption() {
	   bat.editeddescripname();
	}
	@Given("User is onn Batch details page")
	public void user_is_onn_batch_details_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user prog {string}")
	public void user_prog(String editbatchprogname) {
		 bat.editbutton();
		 bat.editprogname(editbatchprogname);
	}

	@Then("user can see edited program name")
	public void user_can_see_edited_program_name() {
	    bat.editedbatchprogname();
	}
	@Given("User is on Batch detailS page")
	public void user_is_on_batch_detail_s_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user changes status")
	public void user_changes_status() {
		 bat.editbutton();
		//bat.changestatus();
	}

	@Then("User can see updated Status")
	public void user_can_see_updated_status() {
	   bat.changedstatus();
	}
	@Given("User is on BatcH details page")
	public void user_is_on_batc_h_details_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user edits {string}")
	public void user_edits(String noofclassedit) {
		bat.editbutton();
	    bat.editbatchclass(noofclassedit);
	}

	@Then("user can see updated No of classes")
	public void user_can_see_updated_no_of_classes() {
		bat.editedclasses();
	    	}
	@Given("User is on Batch dEtails page")
	public void user_is_on_batch_d_etails_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user clicks cancel button")
	public void user_clicks_cancel_button() {
		bat.editbutton();
		bat.cancelbatch();
	}

	@Then("User can see Batch Details are not updated")
	public void user_can_see_batch_details_are_not_updated() {
	    bat.managebatchpage();
	}
	@Given("User is on Batch details pAge")
	public void user_is_on_batch_details_p_age() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user clicks save buttona")
	public void user_clicks_save_buttona() {
	    bat.editbutton();
	    bat.batchformsave();
	}

	@Then("User can see Successful Batch Updated alert")
	public void user_can_see_successful_batch_updated_alert() {
	    	}

	@Given("User is on Batch  page2")
	public void user_is_on_batch_page2() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User searches with newly updated {string}")
	public void user_searches_with_newly_updated(String editbatchname) {
	    bat.searchBatchname(editbatchname);
	}

	@Then("User verifies that the details are correctly updated.")
	public void user_verifies_that_the_details_are_correctly_updated() {
	    	}

	@Given("UseR is on Batch page")
	public void use_r_is_on_batch_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User selects more than one Batch using checkbox")
	public void user_selects_more_than_one_batch_using_checkbox() {
	    bat.checkbox();
	}

	@Then("Baches gets selected")
	public void baches_gets_selected() {
	    
	}
	@Given("User is on Batch paGe")
	public void user_is_on_batch_pa_ge() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() {
	    bat.checkbox();
		bat.multipledelete();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
	  
	}
	@Given("UsER is on Batch page")
	public void us_er_is_on_batch_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks Yes button in Batch")
	public void user_clicks_yes_button_in_Batch() {
		bat.checkbox();
		bat.multipledelete();
		bat.multipledeleteyes();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String string) {
	    
	}
	@Given("USer is on Batch page")
	public void u_ser_is_on_batch_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User Searches for {string}")
	public void user_searches_for(String dgdg) {
	    bat.searchdeletedbatchname(dgdg);
	}

	@Then("There should be zero results.")
	public void there_should_be_zero_results() {
	    
	}
	@Given("UsEr is oN Batch page")
	public void us_er_is_o_n_batch_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks No buttona")
	public void user_clicks_no_button_a() {
		bat.checkbox();
		bat.multipledelete();
		bat.multipledeleteno();

	}

	@Then("User can see Batches are still selected and not deleted")
	public void user_can_see_batches_are_still_selected_and_not_deleted() {
	    
	}
	@Given("user is on Batch page3")
	public void user_is_on_batch_page3() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user clicks delete  button for any batch")
	public void user_clicks_delete_button_for_any_batch() {
	    bat.deleteanybatch();
	}

	@Then("user will get confirm deletion popup")
	public void user_will_get_confirm_deletion_popup() {
	    bat.deleteanybatchpopup();
	}
	@Given("user is  ON THEBatch pagea")
	public void user_is_on_the_batch_pagea() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks Yes buttoN")
	public void user_clicks_yes_butto_n() {
		bat.deleteanybatch();
		bat.deleteanybatchyes();
	}

	@Then("User can see {string} messagE")
	public void user_can_see_messag_e(String string) {
	    
	}
	@Given("user is on Batch pagec")
	public void user_is_on_batch_pagec() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User Searches foR {string}")
	public void user_searches_fo_r(String dgdg) {
	    bat.deletesearch(dgdg);
	}

	@Then("There should be Xero results.")
	public void there_should_be_xero_results() {
	    
	}

	@Given("user is on Batch PPage")
	public void user_is_on_batch_p_page() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks NO bUtton")
	public void user_clicks_no_b_utton() {
	    bat.deleteanybatch();
	    bat.deleteanybatchno();
	}

	@Then("User can see Batch is not deleted.")
	public void user_can_see_batch_is_not_deleted() {
	    
	}
	@Given("User is on Batch details pagem")
	public void user_is_on_batch_details_pagem() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks A New Batch button")
	public void user_clicks_a_new_batch_button() {
	    bat.addnewbatch();
	}

	@Then("user can see Batch details form")
	public void user_can_see_batch_details_form() {
	    bat.batchform();
	}

	@Given("User is on Batch details pagen")
	public void user_is_on_batch_details_pagen() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks Save button without entering data1")
	public void user_clicks_save_button_without_entering_data_1() {
		bat.addnewbatch();
		bat.addnewbatchsavenotentering();
	}

	@Then("User gets message Name is requireda")
	public void user_gets_message_name_is_required_a() {
	    bat.addnewbatchnamerequired();
	}

	@Given("User is on Batch details pagev")
	public void user_is_on_batch_details_pagev() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks Cancel button0")
	public void user_clicks_cancel_button0() {
		bat.addnewbatch();
		bat.addnewbatchcancelnotentering();
	}

	@Then("User can see Batch Details form disappears")
	public void user_can_see_batch_details_form_disappears() {
	    bat.managebatchpage();
	}

	@Given("User is on Batch details pagex")
	public void user_is_on_batch_details_pagex() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("user enters {string} in text box")
	public void user_enters_in_text_box(String enterbname) {
		bat.addnewbatch();
		bat.addnewbatchenterbatchname(enterbname);
	}

	@Then("User can see Name entereda")
	public void user_can_see_name_entered_a() {
	    
	}

	@Given("User is on Batch details pagez")
	public void user_is_on_batch_details_pagez() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User selects {string}")
	public void user_selects(String enterbprogn) {
		bat.addnewbatch();
		bat.addnewbatchenterprogname(enterbprogn);
	}
	@Then("User can see {string} selected")
	public void user_can_see_selected(String string) {
	    
	}

	@Given("User is on Batch details pagea")
	public void user_is_on_batch_details_pagea() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User selects Status using radiobutton")
	public void user_selects_status_using_radiobutton() {
		bat.addnewbatch();
		//bat.changestatusaddnewbatch();
	}

	@Then("User can see {string} status selected")
	public void user_can_see_status_selected(String string) {
	    
	}

	@Given("User is on Batch details pageq")
	public void user_is_on_batch_details_pageq() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User enters {string} in text boxv")
	public void user_enters_in_text_boxv(String noofclass) {
		bat.addnewbatch();
		bat.addnewbatchNoofclass( noofclass);
	}
	@Given("User is on Batch details pagee")
	public void user_is_on_batch_details_pagee() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks Save buttona")
	public void user_clicks_save_button_a() {
		bat.addnewbatch();
		bat.addnewbatchsave();
	    	}

	@Given("User is on Batch details paget")
	public void user_is_on_batch_details_paget() {
	    bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User searches with newly created {string}")
	public void user_searches_with_newly_created(String enterbname) {
	    bat.newbatchsearch( enterbname);
	}

	@Then("records of the newly created  {string} is displayed")
	public void records_of_the_newly_created_is_displayed(String string) {
	    
	}
	@Given("User is logged on to LMS websitea")
	public void user_is_logged_on_to_lms_website_a() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User is on first page of Manage Batch")
	public void user_is_on_first_page_of_manage_batch() {
	    bat.managebatchpage();
	    
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
	   // bat.navigateprevious();
	}

	@Given("User is on the page number {string}")
	public void user_is_on_the_page_number(String string) {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	
	}

	@When("User clicks navigate > buttons")
	public void user_clicks_navigate_buttons() {
		try {
	    bat.navigatenext();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) {
	}

	@Given("User is on page number {string}")
	public void user_is_on_page_number(String string) {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks navigate < buttonss")
	public void user_clicks_navigate_buttonss() {
		try {
		  //  bat.navigatenext();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	@When("User is on last page of Manage Batch")
	public void user_is_on_last_page_of_manage_batch() {
		try {
		//    bat.navigatenext();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
	    
	}

	@Given("User is on Batch pageoo")
	public void user_is_on_batch_pageoo() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Batch name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_name() {
		try {
	 //  bat.ascendingbatchname();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("User can see the results in Ascending order of Batch name")
	public void user_can_see_the_results_in_ascending_order_of_batch_name() {
	    
	}

	@Given("User is on Batch pagett")
	public void user_is_on_batch_pagett() {
		try {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Batch Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_description() {
	 //   bat.ascendingbatchdesc();
	}

	@Then("User can see the results in Ascending order of Batch Description")
	public void user_can_see_the_results_in_ascending_order_of_batch_description() {
	    	}

	@Given("User is on Batch pageff")
	public void user_is_on_batch_pageff() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Batch Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_status() {
	  //  bat.ascendingbatchstatus();
	}
	@Then("User can see the results in Ascending order of Batch Status")
	public void user_can_see_the_results_in_ascending_order_of_batch_status() {
	    
	}

	@Given("User is on Batch pagezz")
	public void user_is_on_batch_pagezz() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_no_of_classes() {
	   bat.ascendingbatchnoofclass();
	}

	@Then("User can see the results in Ascending order of No of Classes")
	public void user_can_see_the_results_in_ascending_order_of_no_of_classes() {
	    
	}

	@Given("User is on Batch pageqq")
	public void user_is_on_batch_pageqq() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() {
	    bat.ascendingbatchprogname();
	}

	@Then("User can see the results in Ascending order of Program Name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
	    
	}

	@Given("User is on Batch pagexx")
	public void user_is_on_batch_pagexx() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_name() {
	    bat.descendingbatchname();
	}

	@Then("User can see the results in Descending order of Batch name")
	public void user_can_see_the_results_in_descending_order_of_batch_name() {
	}

	@Given("User is on Batch pageiil")
	public void user_is_on_batch_pageiil() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_description() {
	    bat.descendingbatchdesc();
	}

	@Then("User can see the results in Descending order of Batch Description")
	public void user_can_see_the_results_in_descending_order_of_batch_description() {
	    
	}

	@Given("User is on Batch pagery")
	public void user_is_on_batch_pagery() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch Status")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_status() {
	    bat.descendingbatchstatus();
	}

	@Then("User can see the results in Descending order of Batch Status")
	public void user_can_see_the_results_in_descending_order_of_batch_status() {
	}

	@Given("User is on Batch paged")
	public void user_is_on_batch_paged() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();
	}

	@When("User clicks on the Descending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_no_of_classes() {
	    bat.descendingbatchnoofclass();
	}
	@Then("User can see the results in Descending order of No of Classes")
	public void user_can_see_the_results_in_descending_order_of_no_of_classes() {
	    
	}

	@Given("User is on Batch pageaa")
	public void user_is_on_batch_pageaa() {
		bat=new Batch(Helper.getDriver());
	    bat.onlmshomepage();
	    bat.batchbuttonclick();	}

	@When("User clicks on the Descending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() {
	   bat.descendingbatchprogname();
	}

	@Then("User can see the results in Descending order of Program Name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
	    
	}






}
