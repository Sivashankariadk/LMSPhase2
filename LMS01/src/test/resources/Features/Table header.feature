@tag6
Feature: Table header
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
@tag6
  Scenario: Verify Table header
    Given User is on  Login page
    When User is on the Manage user page
    Then User should see the table header as "Empty checkbox-icon , ID with sorticon, Name with Sorticon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names
@tag6
  Scenario: Check box in table header
    Given User in manage user page
    When User checks empty checkbox in header
    Then Check box in all the rows of user table should be checked