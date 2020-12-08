Feature: Page Java Script Alerts

  This feature deals JavaScript Alerts functionality of the application:

  Scenario: 1 - Test to verify JavaScript Alerts functionality of the application:
    Given  I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    And I click on the login button
    And I click on link JavaScripts Alerts

    When I click Button Js Alert
    Then User can close the popup alert
    And User can see: You successfuly clicked an alert on the Javascript Alert Page

    And I click on button JS confirm
    And User can see the alert
    And User can close the alert popup
    And User can see You clicked Cancel on the Javascript Alert Page

    And I click on button JS Prompt
    Then User can enter text check1 into pop up window
    And I can see You entered check1 on the Javascript alert page


