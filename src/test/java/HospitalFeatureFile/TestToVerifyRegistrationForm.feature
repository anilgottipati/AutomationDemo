Feature: Test To Verify Registration Form

  Scenario: Test To Verify Registration Form
    Given user launch the Hospital Application
    When User Enter "Automation"
      | FieldName |
      | patient_name  |
    And User Enter "25"
      | FieldName |
      | age  |
    And User Enter "25"
      | FieldName |
      | email  |
    And User Select the Option "Female" from "gender" dropdown
    And User Select the Option "Existing Patient" from "registration_type" dropdown
    And User Click "submit" Button

