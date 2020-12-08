Feature: LoginFeature

  This feature deals with login functionality of the application:

  Scenario: 1 - User login with valid credentials
    Given I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    When I click on the login button
    Then I should see the landing page
