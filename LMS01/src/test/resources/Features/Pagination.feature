@tag1
Feature: Pagination
Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page
@tag1
  Scenario: Verify the presence of pagination
    Given User is on Homeapage after Login
    When User is on the Manage user page after User click
    Then User should see the pagination controls below data table
@tag1
  Scenario: Verify the Pagination control with less rowsUser is on Manage user page
    Given User is on Manage user page
    When Manage user table has less than or equal to 5 rows
    Then Pagination control should be disabled
@tag1
  Scenario: Verify the Pagination control with less rows
    Given User is on Manage user page
    When Manage user table has more than 5 rows
    Then Pagination control should be enabled
@tag1
  Scenario: Verify pagination next link
    Given User table is displayed in manage user page
    When User cliks next link of pagination
    Then Next page should be displayed
@tag1
  Scenario: Verify pagination next link after last record of user table
    Given last page of User records are displayed
    When User cliks next link of pagination
    Then Next link of pagination should be disabled
@tag1
  Scenario: Verify pagination previous link in first page of user table
    Given First page of user table is displayed
    When User cliks previous link of pagination
    Then Previous link of pagination should be disabled
@tag1
  Scenario: Verify button with << icon
    Given User table is displayed in manage user page
    When User clicks << icon in pagination
    Then User should see the First page of the table
@tag1
  Scenario: Verify button with >> icon
    Given User table is displayed in manage user page
    When User clicks >> icon in pagination
    Then User should see the last page of the table
@tag1
  Scenario: Verifiy the entry details below data table
    Given User is logged on to the LMS website
    When User lands on Manage User page
    Then User should see the text  "Showing 1 to 4 of 4 entries" below the user table