Feature: Smoke testing for Login and logout process

Background: Internet connection should be available and user should be already a registered user

Scenario: Login test
Given User Enter url
When User Enter Username and Password
And Click on Login button
Then User should be logged in Successfully