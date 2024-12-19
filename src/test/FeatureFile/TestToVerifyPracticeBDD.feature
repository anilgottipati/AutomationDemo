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
    |userEmail |47@gmail|
    |userNumber|47477444|
    |stateCity-label| Haryana|

    Scenario: Verify Alerts message
      Given User launch Application
      And user on alerts page
      And User click on "alertButton"
      Then I Verify "You clicked a button" and Click "OK"



