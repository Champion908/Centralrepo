Feature: Home page functionality
@sanity
Scenario: Validate title
Given User is at the landing page
Then Page title should contains "amazon"

@functional
Scenario: Verify cart icon
Given User is at the landing page
Then Cart icon should get display

@regression
Scenario: Login to app
Given User is at the landing page
When User click on signin button
And User enters as "9765088873"
And User enters password as "Patil@908" with Signin

