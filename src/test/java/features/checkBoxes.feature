Feature: checkBoxes

  This feature deals with check boxes functionality of the application:

  Scenario: 1 - Test to verify Check Boxes
    Given  I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    And I click on the login button
    When I click on link Checkboxes
    Then I verify that checkbox two is checked
    And I un-check checkbox two
    And I check checkbox one
    And verify that checkbox state is not persistent