@tag7
Feature: UserID
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
    @tag7
  Scenario: Verify ID functionality
    Given User is on manage user page
    When User clicks ID in any row
    Then User details dialog box displayed with user information