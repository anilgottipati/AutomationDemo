Feature: DemoPage


  Scenario: TestToVerifyTextInputField
    Given User launch the Application
    When User Enter the Text in Text Input
    Then Text should be Entered

  Scenario: TestToVerifyClickMe
    Given User launch the Application
   When I Click on Click Me Green
    Then Click Me Purple Should get displayed