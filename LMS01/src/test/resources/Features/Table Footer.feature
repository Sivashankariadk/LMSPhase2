@tag3
Feature: Table Footer
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
    @tag3
  Scenario: Verify table footer
    Given User login in to the LMS website
    When User lands Manage user page
    Then User should see the table footer as "In total there are 4 users".