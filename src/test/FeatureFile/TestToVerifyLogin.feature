@run
Feature: Test To Verify Successful Login
  #shopping basket features
Background:
  Given that i am on the shopping website

  Scenario: Test To Verify Successful Login

#    When i add an item to the basket
#    Then i can view the item in my basket

  Scenario: Test To Verify UnSuccessful Login

#    When i add an item to the basket
#    Then i can view the item in my basket

  Scenario: Test To Verify Invali User Credentails

#    When i add an item to the basket
#    Then i can view the item in my basket

  Scenario Outline: Test To Verify Invalid User Credentails

    When i add an item to the basket
    Then i can view the item in my basket
  Examples:
    |UserName|
    |yuyy    |
    |jhjgjg  |
    |hghghg  |