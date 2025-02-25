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


  Scenario: TestToEnterDymnamic
    When User Enter the Name "Surendra"
    And User Enter the Hide Example "SurendraExample"


  Scenario: TestToClick
    When User Enter the Hide Example "SurendraExample"
    And User click on the "Hide"
    And User click on the "Show"



  Scenario Outline: TestToVerifyExamples
    When User Enter the Hide Example "<UserName>"
    And User click on the "Hide"
    And User click on the "Show"

    Examples:
    |UserName|
    |Surendra|
    |Shyam|
    |Anil|
    |Sai|



  Scenario: TestToEnterMultipleTimes
    When User Enter the Following detail
      | FieldName |
      | Surendra |
      | Shyam |
      | Anil |
      | Sai |
      | Sunil |




