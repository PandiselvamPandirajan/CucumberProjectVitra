Feature: To Validate Login Functionality of Vitra Application

Scenario: To Validate Login with Valid username and Invalid Password

Given To Launch the Chrome browser and hit the Vitra Url

When To Enter Valid Email in Email Field
And To Enter Invalid Password in Password Field
And To Click the Deny button on Cookies
And To Click the login button

Then To Close the Chrome browser
