@tag
Feature: Manage user page
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
  @tag
  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page