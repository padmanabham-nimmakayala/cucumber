Feature: feature to test security page functionality

Background: login functionality
Given i need to navigate to webpage
And login to prohealth home page
Then prohealth frontoffice dashboard should be displayed

Scenario: security usertable details

And mousehover on settings and security and click on users
Then users page should be displayed
Then all the table headings should be displayed
And verify the add button at the top
Then close the browser

