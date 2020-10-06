Feature: Facebook Login use case

@Rameshsoft
Scenario:  Facebook login with valid un and valid pwd
Given when user is on landing page
When user enters valid un as "sadasrk@gmail.com" and pwd as "Test@123"
And when user clicks on login button
Then user should be on home page

@Rameshsoft
Scenario:  Facebook login with valid un and invalid pwd
Given when user is on landing page
When user enters valid un as "srkreddy@gmail.com" and pwd as "Test@123"
And when user clicks on login button
Then user should be on home page

Scenario:  Facebook login with invalid un and valid pwd
Given when user is on landing page
When user enters valid un as "shivaReddy@gmail.com" and pwd as "Test@123"
And when user clicks on login button
Then user should be on home page