@smoke
  Feature:  verify user could use currency dropdown
    Scenario: user use euro currency
    Given user is on home page
    When user clicks on euro currency
    Then euro symbol is shown on products
