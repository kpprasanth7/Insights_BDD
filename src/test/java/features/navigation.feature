Feature: Validation of all different navigations from home page

Background:
Given user is on landing page
When user entered "Vasanth.palani" and "Signa@123"
And clicked on the login button
Then the user should be navigated to homepage

@edge
Scenario: Verify if the Billing Efficiency option is getting navigated to Billing Efficiency page
And the user clicks Insights and Navigate to Billing Efficiency page and verify if it lands in Billing Efficiency page
And the user should be logged out from the signainsights

@test 
Scenario: Verify if the Invoice Life Cycle option is getting navigated to Invoice Life Cycle page
And the user clicks Insights and Navigate to Invoice Life Cycle page and verify if it lands in Invoice Life Cycle page
And the user should be logged out from the signainsights

@edge
Scenario: Verify if the Revenue By Location option is getting navigated to Revenue By Location page
And the user clicks Insights and Navigate to Revenue By Location page and verify if it lands in Revenue By Location page
And the user should be logged out from the signainsights

@chrome
Scenario: Verify if the Technician Overview option is getting navigated to Technician Overview page
And the user clicks Insights and Navigate to Technician Overview page and verify if it lands in Technician Overview page
And the user should be logged out from the signainsights

@edge
Scenario: Verify if the Profit and Loss option is getting navigated to Profit and Loss page
And the user clicks Insights and Navigate to Profit and Loss page and verify if it lands in Profit and Loss page
And the user should be logged out from the signainsights

@test 
Scenario: Verify if the Battery and Warranty option is getting navigated to Battery and Warranty page
And the user clicks Insights and Navigate to Battery and Warranty page and verify if it lands in Battery and Warranty page
And the user should be logged out from the signainsights

@edge
Scenario: Validate if the user is able to navigate to Organizations page
And the user should be navigated to Organizations page
And the user should be logged out from the signainsights

@chrome
Scenario: Validate if the user is able to navigate to Report Registration page
And the user should be navigated to Report Registration page
And the user should be logged out from the signainsights