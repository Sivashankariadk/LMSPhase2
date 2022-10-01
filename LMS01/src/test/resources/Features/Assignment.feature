Feature: AssignmentPage

Background: Validating Login

Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
When User enters <username> and <password>
Then User should see the LMS Home page

Scenario: Checking Header and Footer in Assignment page
Given User is logged on to LMS website
When User clicks Assignment in header
Then User should see a heading with text Manage Assignment on the page
Then User should see the text as Showing one to three of three entries below the table
Then User should see the footer as In total there are three assignements

Scenario: checking search functionality
Given User is on Assignment page
Then Text box used for search has text as Search
When User clicks on search with sql into search box
Then Entries for sql are shown
When User selects Assignment using checkbox
When User clicks on Edit button
Then User lands on Assignment Details form
When User edits Name and click save
Then User can see updated Name
When User edits Description and click save
Then User can see updated Description
When User edits Grade and click save
When User edits Due Date and click save
Then User can see updated Due Date
When User clicks Cancel button
Then User can see Assignment Details form disappears
When User clicks Save button in Assignment
Then User can see Successful Assignment Updated message

Scenario: checking delete functionality
Given User currently on Assignment page
When User clicks on Delete button after selecting an assignment
Then User lands on Confirm Deletion form
When User clicks Yes button
Then User can see Successful Assignment Deleted message
When User clicks No button
Then User can see Confirm Deletion form disappears

Scenario: checking multiple functionality
Given User present on Assignment page
When User selects more than one Assignment using checkbox
Then Assignments get selected
Given User present on Assignment page
When User clicks on Delete button on top left corner
Then User can see Confirm Deletion form
Given User see Confirm Deletion form
When User clicks Yes button on Delete Form
Then User can see Successful Deleted message
Given User see Confirm Deletion form
When User clicks No button on Delete Form
Then User can see Confirm Deletion form gets closed

Scenario: checking new assignment
Given User stays on Assignment page
When User clicks A New Assignment button
Then user can see Assignment details form
When User clicks Save button without entering data
Then User gets message Name is required
When user enters Assignment name
Then User can see Name entered
When user enters Assignment description
Then User can see Description entered
When user enters assignment grade
Then user can see Grade entered
When user enters assignment due date
Then user can see Assignment due date
When User now clicks Save button 
Then User gets message Successful assignment created
When User now clicks Cancel button
Then User can now see assignment Details form disappears

Scenario: checking submit button
Given User on Assignment Page
When User Click on Submit
Then User can see need to fill required fields
When User enter reguired details and submit
Then User can see Submit Assignment Sucessfully

Scenario: checking ASC order
Given Users are on Assignment Page
When User clicks on the Ascending down arrow near to the Assignment name 
Then User can see the results in Ascending order of Assignment name
When User clicks onthe Ascending down arrow near to the Assignment Description 
Then User can see the results in Ascending order of Assignment Description

Scenario: checking DESC order
Given Users are currently on Assignment Page
When User clicks onthe Descending arrow down near to the Assignment name
Then User can see the results in Descending order of Assignment name
When User clicks onthe Descending arrow down near to the Assignment Description
Then User can see the results in Descending order of Assignment Description







  