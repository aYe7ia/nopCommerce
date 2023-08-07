@smoke
  Feature: verify users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user is on login page
    When user login with valid email
    And user login with valid password
    And user clicks on login button
    And user login to the system successfully
    Then user logout to homepage
    And user is on login page again
    And user login with invalid email
    And user login with invalid password
    And user clicks on login button with invalid data
    Then user login to the system unsuccessfully







