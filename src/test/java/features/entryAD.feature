Feature: Page with Entry Advertisements

  This feature deals with Entry Advertisements functionality of the application:

  Scenario: 1 - Test to verify modal Window and Dropdown Menu
    Given  I navigate to the login page
    And I enter valid username as "admin" and password as "bluebird"
    And I click on the login button
    When I click on link Entry Ad
    Then I close the Popup Modal window
    And I select Option2 from dropdown menu
