Feature: Login to Facebook

Scenario: Launch Browser
    Given user launches the browser

Scenario Outline: Login with Valid Credentials
    Given User navigates to the Facebook login page at "https://www.facebook.com"
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to login by clicking on the login button

Examples: 
    | username | password |
    | valid    | valid    |



