@TC02 @TC03 @Regression

Feature: TestToVerifyLoginFunctionality
#description: Search Functionality

  Scenario Outline: TestToVerifyLoginFunctionality
    Given User Launch the OrangeHRM Application
    And User Login with "<UserName>" and "<Password>"
    Then "<TestMsg>" should displayed

    Examples:
      | UserName |Password|TestMsg|
    |   Admin       |  admin1232     |   Invalid credentials     |
      |  Admin1        |  admin123  |    Invalid credentials    |
    |   Admin       |admin123  |  Time at Work                |

