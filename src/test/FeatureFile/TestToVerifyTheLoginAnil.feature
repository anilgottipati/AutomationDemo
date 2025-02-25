Feature: TestToVerifytheAlert

  Background:
    Given User launch the Rahul Academy Application

  Scenario: TestToVerifytheAlert
    When User Click on Alert
    And Alert Popup Message get displayed
    And User Click on OK Button
    Then Alert PopUp should Closed



  Scenario: TestToSample1
    When User Enter the Name
    And User Enter the Hide Example

# Example 1
  Scenario: TestToEnterDymnamic
    When User Enter the Name "Anil"
    And User Enter the Hide Example "AnilExample"


  Scenario: TestToClick
    When User Enter the Hide Example "AnilExample"
    And User click on the "Hide"



