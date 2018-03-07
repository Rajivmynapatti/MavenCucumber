Feature: Smoke testing for Login and logout process



Scenario: Login test
Given User Enter url
When User Enter Username and Password
And Click on Login button
Then User should be logged in Successfully
When User is logged in and Perform all the operations
When User will click on Logout button
Then User should be logout successfully.

