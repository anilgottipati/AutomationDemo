Feature: TestToVerifytheHospital

Background:
  Given User Launch the Hospital Application

  Scenario: TestToVerifyRegistration1
#    Given User Launch the Hospital Application
    When User enter the full name


  Scenario: TestToVerifyRegistration2
#    Given User Launch the Hospital Application
    When User enter Full name "Anil"

  Scenario: TestToVerifyRegistration3
#    Given User Launch the Hospital Application
    When User enter Full name "Sunil"


  Scenario: TestToVerifyRegistration4
#    Given User Launch the Hospital Application
    When User Select the Gender "Male"
    When USer Select the Department "ENT"


  Scenario: TestToVerifyRegistration5
#    Given User Launch the Hospital Application
  When User Select "Male" from "gender" dropdown
    When User Select "ENT" from "department" dropdown

  Scenario: TestToVerifyRegistration6
#    Given User Launch the Hospital Application
    When User Enter Registration Form details
    |Field|Value|
    |fullName|Anil|

  Scenario Outline: TestToVerifyRegistration7
#    Given User Launch the Hospital Application
    When User enter Full name "<Kishore>"

    Examples:
      | Kishore   |
      | Sunil  |
      | Anil   |
      | Shyam  |
      | Sundar |
