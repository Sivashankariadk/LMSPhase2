@tab4
Feature: Add New User button
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
@tab4
  Scenario: Verify the presence of Add new user button
    Given User reached LoginPage
    When User is on Manage user page after clicking user
    When  User clicks Add New User button
    Then User should see the button with text + icon and Add New User
    Then User should see the "User details" dialog box