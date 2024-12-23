Feature: TestToVerifythePracticeForm

  Background: User launch Application

  Scenario: Check login
    Given User enter below details
    And user enters username and password

    |Option|Value|
    |username|Radhika|
    |password |4747  |

    When user click on login
    Then user is navigate to homepage

    Scenario: launch updatebrowser
    Then enter following details
    |FieldName|Value|
    |FirstName|R|
    |LastName |C|
    |Address  |bvrm|
    |City     |hyd|
    |State    |tel|
    |ZipCode  |886|
    |Phonenumber|47655655|
    Then click on "UPDATE PROFILE"

    Scenario: After Register
    Then account services will display
  |Open New Account |
  |Accounts Overview|
  |Transfer Funds   |
  |Bill Pay         |
  |Find Transactions|
  |Update Contact Info|
  |Request Loan       |
  |Log Out|



Scenario : User Click on Request loan
  Given User enter details
    And User Click on Request Loan
    When User Enter on Loan Amount
    When User Enter Down Payment

      |Option|Value|
      |amount|1000|
      |downPayment|200|

Scenario: When User Click on Apply
   When User will see Loan Provider
   And User will see current date
  Then User will see Status

    |Option|Value|
  |loanProviderName| Wealth Securities Dynamic Loans (WSDL)|
  |responseDate |20-12-2024  |
  |loanstatus   |Approved    |

