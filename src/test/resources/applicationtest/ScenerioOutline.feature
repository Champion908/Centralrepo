Feature: Signup 

Scenario Outline: Signup to application with different data
Given User is at the signup page
When User enters the "<name>" on form
And User enters the "<age>" inside the form
And User select the "<gender>"
Then User should get created

Examples:
| name | age | gender |
| Eder | 18 | Male |
| Ron | 22 | Male |
| Diana | 19 | Female |
| Daniel | 25 | Male |
