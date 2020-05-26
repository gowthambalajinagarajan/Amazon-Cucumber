Feature: Verify Amazon Page

Scenario Outline: Verify Tabs in Home Page

Given User launch the application
When User Click on the tab "<tab>"
Then User should see the respective details page

Examples:
|tab|
|Mobile|
|Pantry|
|Amazon Pay|
