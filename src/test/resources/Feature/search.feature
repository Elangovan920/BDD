@all
Feature: login functionality
Background: 
Given the user should be in facebook home page
@group1
Scenario: to check login functionality with valid creditionals
When the user fills the valid login creditionals in username and password field
|user|pass|
|user1|pass1|
|user2|pass2|
|user3|pass3|
And click the login button
Then the user should navigate to the home page

@group2
Scenario: to check login functionality with invalid creditionals
When the user fills the invalid login creditionals in username and password field
|user|pass|
|user1|pass1|
|user2|pass2|
|user3|pass3|
And click the login button
Then the user should navigate to the invalid page

