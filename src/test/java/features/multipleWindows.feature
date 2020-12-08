Feature: Multiple Windows

  This feature deals Multiple Windows functionality of the application:

  Scenario: 1 - Test to verify Multiple Windows
    Given  I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    And I click on the login button
    When I click on the Multiple Windows link
    And I click on the Click Here link
    Then a new window is open with text New Window and closed
    And I am redirected to Opening a New Window page