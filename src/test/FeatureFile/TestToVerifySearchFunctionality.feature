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


  Scenario: TestToVerifyCheckout
    Given User Launch the GreenKart Application
    And User Enter "Cucumber" in Search box
    And User enter 2 Kg for "Cucumber - 1 Kg"
    And User Click on Add To Cart for "Cucumber"
    Then Verify the Item Price should be equal to Added Items

  Scenario: TestToVerifyCheckoutCauliflower
    Given User Launch the GreenKart Application
    And User Enter "Cauliflower" in Search box
    And User enter 2 Kg for "Cauliflower - 1 Kg"
    And User Click on Add To Cart for "Cauliflower"
    Then Verify the Item Price should be equal to Added Items
    When User click on Cart button
    Then Verify the Product Items should match with Items Added

  Scenario: TestToVerifyCheckoutFindElements
    Given User Launch the GreenKart Application
    When User Select vegetable "Cucumber - 1 Kg" for 2 kg
#    And User Click on Add To Cart for "Cucumber"
#    Then Verify the Item Price should be equal to Added Items