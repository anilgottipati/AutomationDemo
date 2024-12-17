Feature: TestToVerifythePracticeForm

  Scenario: Launch the form Browser
    Given User launch Application

    Scenario: When user enter details
      Given User Enter FirstName
      And User Enter  LastName
      When User Click Gender
      When User Enter  Email
      Then User Enter Mobile

  Scenario: When user enter details1
     And User Enter below details
    |Option|Value|
    |firstName|Radhika|
    |firstName|Radhika|
    |firstName|Radhika|
    |firstName|Radhika|


      Scenario: Verify the details
        When user enter following details
        |FieldName| Value|
        |FirstName|Radhika|
        |LastName|C|
        |Gender|Female|
        |Email |47@gmail|
        |Mobile|47477444|
