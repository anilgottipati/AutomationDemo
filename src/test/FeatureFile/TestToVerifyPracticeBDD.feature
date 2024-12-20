Feature: TestToVerifythePracticeForm

  Scenario: Check Login is successfull
    Given launch Application
    And user enters username and password
    When user click on login
    Then user is navigate to homepage

    |username|password|
    |Radhika |4747    |





