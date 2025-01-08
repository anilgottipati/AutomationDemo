Feature: Test To Verify Successful Login

  Background:


  Scenario: Test To Verify Successful Login
    Given user launch the Application
    When User Enter "Admin1"
      | FieldName |
      | username  |
    When User Enter "admin1231"
      | FieldName |
      | password  |
    And User Click "submit" Button
    Then Verify the "Invalid credentials"