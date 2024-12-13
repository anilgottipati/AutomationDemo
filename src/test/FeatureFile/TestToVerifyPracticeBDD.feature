Feature: TestToVerifythePracticeForm

  Background:
    Given User launch Application

  Scenario: Verify the practice Info
    When User Enter the FirstName
    And User Enter the LastName


  Scenario: Verify the Email  info
    When User Enter the Following details
      | FieldName | Value           |
      | userEmail | Abc@gamil.com   |
      | userEmail | Abcd1@gamil.com |
      | userEmail | Abc2@gamil.com  |


  Scenario Outline: Verify the Mobile  info
    When User Enter the "<FieldName>" and "<Value>"

Examples:
  | FieldName  | Value |
  | userNumber | 812388 |
  | userNumber | 877868 |


  Scenario: Verify the Address  info
    When User Enter the Following details
      | FieldName      | Value   |
      | currentAddress | hyd |

  Scenario: Verify the Submit  info
    When User Click on "submit" Button