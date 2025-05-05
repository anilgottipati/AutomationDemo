@TC02 @TC03 @Regression

Feature: TestToVerifySearchFunctionality
#description: Search Functionality

  Scenario: TestToVerifySearchFunctionality
  Given User Launch the GreenKart Application
    And User Enter "Cucumber" in Search box
    Then "Cucumber" should get displayed


  Scenario: TestToVerifyAddToCart
    Given User Launch the GreenKart Application
    And User Enter "Cucumber" in Search box
    And User Click on Add To Cart for "Cucumber"
    Then Verify the Items Count should be "1"

