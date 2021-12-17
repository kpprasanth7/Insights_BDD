Feature: User creation and deletion

Background:
Given user is on landing page

@chrome
Scenario: User is able to create new user id and able to delete
When user entered "SignaInsightsDemo" and "Signa@123"
And clicked on the login button
Then the user should be navigated to homepage
And the user should be navigated to Users page
And the user is able to enter all the details to create new user
Then the user is able to delete the newly created userid
And the user should be logged out from the signainsights