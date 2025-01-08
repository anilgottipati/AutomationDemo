Feature: Test To Verify Successful Login1

  Scenario: Test To Verify Successful Login1
    Given user launch the Application
    When User Enter "Admin"
      | FieldName |
      | username  |
    When User Enter "admin123"
      | FieldName |
      | password  |
    And User Click "submit" Button
    Then Verify the "My Actions"


