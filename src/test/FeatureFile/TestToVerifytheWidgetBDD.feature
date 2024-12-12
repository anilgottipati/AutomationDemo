Feature: TestToVerifytheWidget

Feature: TestToVerifythePracticeForm

  Background:
    Given User launch the Application

  Scenario: Verify the Widget Info
    When User Enter the FirstName
    And User Enter the LastName


  Scenario: Verify the Email  info
    When User Enter the Following details
      | FieldName | Value           |  |
      | userEmail | Auto@gamil.com  |  |
      | userEmail | Auto1@gamil.com |  |
      | userEmail | Auto2@gamil.com |  |
      | userEmail | Auto3@gamil.com |  |
      | userEmail | Auto4@gamil.com |  |

  Scenario Outline: Verify the Mobile  info
    When User Enter the "<FieldName>" and "<Value>"

Examples:
  | FieldName  | Value |
  | userNumber | 87888 |
  | userNumber | 87868 |
  | userNumber | 87848 |
  | userNumber | 87288 |

  Scenario: Verify the Address  info
    When User Enter the Following details
      | FieldName      | Value   |  |
      | currentAddress | Chennai |  |

  Scenario: Verify the Submit  info
    When User Click on "submit" Button