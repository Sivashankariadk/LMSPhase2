
Feature: Login

Scenario Outline: Validating Login
Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User fills the form from the given sheetName"<SheetName>" 
Then User should see the LMS Home page
Examples:
|SheetName|
|Data|