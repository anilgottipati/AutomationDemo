Feature: TestToVerifytheLogin

  Background:
    Given User launch Application
      | Url |
    |demoqa.com/automation-practice-form|

  Scenario Outline: Verify the Login Info1
    When User Enter "<FieldName>" in "firstName"
    Examples:
      | FieldName  |
      | Shyam |
      | Summmer |
      | Anil |
      | Winter |

  Scenario: Verify the Login Info
    When User Enter the Following details1
      | FieldName | Value           |
      | firstName | Shyam           |
      | lastName | Rane             |
    When User Enter First Name
    When User Enter "Anil" in "firstName"

    When User Enter "Kumar" in "lastName"
    When User Enter the Following details1
      | FieldName | Value           |
      | firstName | Shyam           |
      | lastName | Rane             |

    When User Enter FirstName "SARAN"
    When User Enter the Following details
      | FieldName      | Value   |  |
      | APjFqb | SUNIL |  |

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
