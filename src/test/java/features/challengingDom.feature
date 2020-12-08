Feature: Challenging DOM

  This feature deals with Challenging Dom functionality of the application Page:

  Scenario: 1 - Test to verify Challenging Dom Functionality:

    Given I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    And I click on the login button
    And I should see the landing page
    When I click on link Challenging Dom
    Then I click on Challenging Dom Bar
    And I can see correct value in row two with columnName Sit
    And I can see correct value in row five with columnName Amet
    And I can see correct value in row six with columnName Amet

