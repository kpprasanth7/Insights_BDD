Feature: SignaInsights Login

Background:
Given user is on landing page

@chrome
Scenario Outline: Login with different credentials and logout
When user entered "<Username>" and "<Password>"
And clicked on the login button
Then the user should be navigated to homepage
And the user should be logged out from the signainsights

Examples:
|Username|Password|
|SignaInsightsDemo|Signa@123|
|Vasanth.palani|Signa@123|

@edge
Scenario Outline: Login and navigate to users page and logout
#Given user is on landing page
When user entered "<Username>" and "<Password>"
And clicked on the login button
Then the user should be navigated to homepage
And the user should be navigated to Users page
And the user should be logged out from the signainsights

Examples:
|Username|Password|
|SignaInsightsDemo|Signa@123|