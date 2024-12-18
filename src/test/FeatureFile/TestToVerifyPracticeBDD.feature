Feature: TestToVerifythePracticeForm

  Scenario: Launch the form Browser
    Given User launch Application

    Scenario: When user enter details
      Given User launch Application
      Given User Enter FirstName
#      And User Enter  LastName
#      When User Click Gender
#      When User Enter  Email
#      Then User Enter Mobile
#      Then User Select State
  Scenario: When user enter details1
    Given User launch Application
     And User Enter below details
    |Option|Value|
    |firstName|Radhika|
    |lastName|C|
    |Gender|Female|
    |Email |47@gmail|
    |Mobile|47477444|
    |State | Haryana|


