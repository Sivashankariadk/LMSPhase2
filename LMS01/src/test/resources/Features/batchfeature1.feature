
@TC003
Feature: Batch Heading   
 Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
  
    
    Scenario: Validate the heading
    Given  User is on the LMS Home program page
    When User clicks Batch button on top
    Then User should see a heading with text Manage Batch on the page
    
    Scenario: Validating the default state of Delete button 
    Given User is on the LMS Home Program pages
   When User is on Batch page1
    Then Verify that the Delete button next to the search box is Disabled
    
    Scenario: Validate that number of records (rows of data in the table) displayed 
    Given User is on the LMS Homes page
    When User is on Batch pages
    Then Verify that number of records (rows of data in the table) displayed on the page are 5
    Scenario: Search by Batch Name
    Given User is on Batch pagess
   
    When user clicks on search box with "Batch Name" entered in it
    Then records of that  "Batch Name" are displayed
    #editfeature
    Scenario: Edit Feature
    Given User is on Batch page
    When User clicks on Edit button1
    Then User lands on Batch Details form.
    Scenario: Edit Batch Name
    Given User is on Batch details page
    When User "edits Name"
    Then User can see edited Name
    Scenario: Edit  Batch Description
    Given User ison Batch details page
    When user edit "edits description"
    Then User can see edited descricption
Scenario: Edit program name
    Given User is onn Batch details page
    When user prog "edits program name"
    Then user can see edited program name
Scenario: change status
   Given User is on Batch detailS page
    When user changes status
    Then User can see updated Status
    Scenario: Edit No of classes
    Given User is on BatcH details page
    When user edits "No of classes"
    Then user can see updated No of classes
    Scenario: Click Cancel1
    Given User is on Batch dEtails page
    When user clicks cancel button
    Then User can see Batch Details are not updated
    Scenario: click save
    Given User is on Batch details pAge
    When user clicks save buttona
    Then User can see Successful Batch Updated alert
    Scenario: Verify Edited BatcH details
    Given User is on Batch  page2
    When User searches with newly updated "Batch Name"
    Then User verifies that the details are correctly updated.
    Scenario: Select Batch
    Given UseR is on Batch page
    When User selects more than one Batch using checkbox
    Then Baches gets selected
    #Delete  multiple batches
    Scenario: Delete  multiple batches 
    Given  User is on Batch paGe
    When User clicks on Delete button
    Then User lands on Confirm Deletion form.
    Scenario: Click Yes
    Given  UsER is on Batch page
    When User clicks Yes button in Batch
    Then User can see 'Successful BatchDeleted' message
Scenario: Verify deleted batches
    Given  USer is on Batch page
    When User Searches for "Deleted Batch names"
    Then There should be zero results.
   Scenario: click no
    Given  UsEr is oN Batch page
    When User clicks No buttona
    Then User can see Batches are still selected and not deleted
    Scenario: delete feature
    Given user is on Batch page3
    When user clicks delete  button for any batch
    Then user will get confirm deletion popup
Scenario: Click Yes
    Given user is  ON THEBatch pagea
    When User clicks Yes buttoN
    Then User can see 'Successful BatchDeleted' messagE
    Scenario: Verify deleted batch
    Given user is on Batch pagec
    When User Searches foR "Deleted Batch name"
    Then There should be Xero results.
    Scenario: click no
    Given user is on Batch PPage
    When User clicks NO bUtton
    Then User can see Batch is not deleted.
    Scenario: Add Batch
    Given User is on Batch details pagem
    When User clicks A New Batch button
    Then user can see Batch details form
    Scenario: Empty form submission
    Given User is on Batch details pagen
    When User clicks Save button without entering data1
    Then User gets message Name is requireda
    Scenario: Click Cancel
    Given User is on Batch details pagev
    When User clicks Cancel button0
    Then User can see Batch Details form disappears
     Scenario: Enter Batch Name
    Given User is on Batch details pagex
    When user enters "name" in text box
    Then User can see Name entereda
    Scenario: Enter Program name
    Given User is on Batch details pagez
    When User selects "Program name"
    Then User can see 'Program Name' selected
    Scenario: Select Status
    Given User is on Batch details pagea
    When User selects Status using radiobutton
    Then User can see 'Active/Inactive' status selected
    Scenario: Enter No of classes
    Given User is on Batch details pageq
    When User enters 'No of classes' in text boxv
    Then User can see 'No of classes' entered
    Scenario: Click Save
    Given User is on Batch details pagee
    When User clicks Save button
    Then User gets message 'Successful batch created'
    Scenario: Verify Added Batch is created
    Given User is on Batch details paget
    When User searches with newly created "Batch Name"
    Then records of the newly created  "Batch Name" is displayed
    #Pagination feature
    Scenario: Verify previous link on the first page
    Given User is logged on to LMS websitea
    When User is on first page of Manage Batch 
    Then Verify that previous link is disabled
    Scenario: Verify next link
    Given User is on the page number '1' 
    When User clicks navigate > buttons
    Then User navigated to page number '2'
    Scenario: Verify previous link
    Given User is on page number '2'
    When User clicks navigate < buttonss
    Then User navigated to page number '1'
    Scenario:Verify next link on the last page
    Given User is logged on to LMS website
    When User is on last page of Manage Batch
    Then Verify that next link is disabled
    #Results in Ascending order feature
    Scenario: Verify that the results are displayed in Ascending order of Batch name
    Given User is on Batch pageoo
    When User clicks on the Ascending arrow (down ) near to the Batch name 
    Then User can see the results in Ascending order of Batch name
    Scenario: Verify that the results are displayed in Ascending order of batch Description
    Given User is on Batch pagett
    When User clicks on the Ascending arrow (down ) near to the Batch Description 
    Then User can see the results in Ascending order of Batch Description
    Scenario: Verify that the results are displayed in Ascending order of Batch Status
    Given User is on Batch pageff
    When User clicks on the Ascending arrow (down ) near to the Batch Status 
    Then User can see the results in Ascending order of Batch Status
    Scenario:Verify that the results are displayed in Ascending order No of Classes
    Given User is on Batch pagezz
    When User clicks on the Ascending arrow (down ) near to the No Of Classes
    Then User can see the results in Ascending order of No of Classes
    Scenario: Verify that the results are displayed in Ascending order of Program Name
    Given User is on Batch pageqq
    When User clicks on the Ascending arrow (down ) near to the Program Name
    Then User can see the results in Ascending order of Program Name
   #Results in Descending order feature
   Scenario:Verify that the results are displayed in Descending order of Batch name
   Given User is on Batch pagexx
   When User clicks onthe Descending arrow (down ) near to the Batch name
   Then User can see the results in Descending order of Batch name
   Scenario:Verify that the results are displayed in Descending order of Batch Description
   Given User is on Batch pageiil
   When User clicks onthe Descending arrow (down ) near to the Batch Description
   Then User can see the results in Descending order of Batch Description
   Scenario:Verify that the results are displayed in Descending order of Batch Status
   Given User is on Batch pagery
   When User clicks onthe Descending arrow (down ) near to the Batch Status
   Then User can see the results in Descending order of Batch Status
   Scenario:Verify that the results are displayed in Descending order No of Classes
   Given User is on Batch paged
   When User clicks on the Descending arrow (down ) near to the No Of Classes
   Then User can see the results in Descending order of No of Classes
   Scenario:Verify that the results are displayed in Descending order of Program Name
   Given User is on Batch pageaa
   When User clicks on the Descending arrow (down ) near to the Program Name
   Then User can see the results in Descending order of Program Name

    
