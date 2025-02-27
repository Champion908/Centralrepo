Feature: Registar Form

Scenario: Validate the title
Given User is at the landing page
Then Page title should contain "HYR Tutorials"

Scenario: Fill the all detail
Given User is at the landing page
When Enter the First Name "Vinod"
And Enter the Last Name "Mishra"
And Enter the Email "abc@gmail"
And Enter the Password "Test@123"
And Enter the Repeat Password "Test@123"
And Click on reset