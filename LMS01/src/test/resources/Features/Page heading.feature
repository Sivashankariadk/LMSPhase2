@tag1
Feature: Page heading
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
  @tag1
  Scenario: Verify the Manage user page heading
    Given User is on any page after Login
    When User is on the Manage user page after clicking User Tab
    Then User should see the page heading as "Manage User"