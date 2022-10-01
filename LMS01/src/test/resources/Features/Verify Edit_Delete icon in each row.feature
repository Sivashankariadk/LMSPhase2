@tag5
Feature: Verify Edit_Delete icon in each row
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
   @tag5
    Scenario: Edit Delete presence
    Given User in Login page
    When User come to Manage user page after clicking User Tab
    Then User should see the buttons with edit/delete icon in each row of Edit/Delete coulmn
@tag5
  Scenario: Updating with Edit button
    Given User table is displayed in UserPage
    When User clicks Edit button
    Then "User Details" dialog box should be displayed for editing
@tag5
  Scenario: Fucntionality of delete button
    Given User table in manage user page
    When User clicks delete button
    Then Confirm dialog box should be displayed with Text Are you sure you want to delete (selected user name) ? , button with text No , the button with text yes and close(X) icon