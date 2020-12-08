Feature: LogoutFeature

  This feature deals with Logout functionality of the application:

  Scenario: 1 - User log out path
    Given  I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    And I click on the login button
    When I click on the logout button
    Then I am redirected to the login Page
