Feature: TestToVerifytheLogin

  Background:
    Given User launch Application
      | Url |
    |parabank.parasoft.com/parabank/index.htm|

  Scenario: Verify the Registration Flow
    When user Click on the "Register"
    Then Verify the "Signing up is easy!" should get display
    When User Fill the Registration details
    |Field Name|value|
    |First Name |Testing|
    |Last Name  |Automation|
    |Address    |Chennai   |
    |Username  |1234      |
    And user Click on the "Register"
    Then Verify the Message "Welcome 1234"


