Feature: To verify facebook login multiple times
Scenario Outline: to verify email and password
Given  user to launch browser
When to pass url
And To pass "<Username>" and "<Password>"
Then user to click continue button

