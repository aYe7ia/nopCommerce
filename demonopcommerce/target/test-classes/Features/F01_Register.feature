@smoke
  Feature:  verify that users could register with new accounts
  Scenario: user could register with valid data successfully
    Given user is in home page
    When user clicks on register button
    And user select gender type
    And user enter first name
    And user enter last name
    And user enter day date of birth
    And user enter month date of birth
    And user enter year date of birth
    And user enter email field
    And user enter Password field
    And user confirm password field
    And user clicks on registration button
    Then success message is displayed
    And user clicks on login to enter his profile
