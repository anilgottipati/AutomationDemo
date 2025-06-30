Feature: TestToVerifyTheDropDownOption

  Background:
    Given User launch The SauceDemo Application
#    Given User launch Application
#      | Url |
#      |demoqa.com/automation-practice-form|

  Scenario: TestToVerifyTheDropDownOption
    And User Enter UserName and Password
    And Click on Login
    Then Home Page Should get displayed

  Scenario: TestToVerifyTheDropDownOption
    And User Enter username and Password
    And Click on Login
    Then Home Page Should get displayed

  Scenario: TestToVerifyTheproblemuser

    And User Enter username and Password for Problem User
    And Click on Login
    Then Home Page Should get displayed


  Scenario: TestToVerifyTheLogin
    And User Enters "performance_glitch_user" and "secret_sauce"
    And Click on Login
    Then Home Page Should get displayed

  Scenario: TestToVerifyTheErrorLogin
    And User Enters "error_user" and "secret_sauce"
    And Click on Login
    Then Home Page Should get displayed


  Scenario: TestToVerifyTheErrorLogin1

    And User Enters "error_user" and "secret_sauce"
    And Click on "Login"
    Then Home Page Should get displayed



  Scenario Outline: TestToVerifyTheScenariooutlineExampleDemo

    And User Enters "<Username>" and "<Password>"
    And Click on "Login"
    Then Home Page Should get displayed
    Examples:
      |Username|Password  |
    | locked_out_user       |  secret_sauce        |
    |  problem_user               |secret_sauce|
    |  performance_glitch_user      |    secret_sauce      |
