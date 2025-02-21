Feature: TestToVerifytheAlert

  Background:
    Given User launch the Rahul Academy Application

  Scenario: TestToVerifytheAlert
    When User Click on Alert
    And Alert Popup Message get displayed
    And User Click on OK Button
    Then Alert PopUp should Closed

