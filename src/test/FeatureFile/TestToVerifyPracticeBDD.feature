Feature: TestToVerifythePracticeForm

  Background: User launch Application

  Scenario: Check Login is successfull
    Given user is on login page
    And user enters username and password
    When user click on login
    Then user is navigate to homepage

    |username|password|
    |Radhika |4747    |

    Scenario: After Login
    Then account services will display
  |Open New Account |
  |Accounts Overview|
  |Transfer Funds   |
  |Bill Pay         |
  |Find Transactions|
  |Update Contact Info|
  |Request Loan       |
  |Log Out|



Scenario : User on Request loan
    And User Click on Request Loan
    When User Enter on Loan Amount
    When User Enter Down Payment

  |amount|downPayment|
  |1000|200|

Scenario: When User Click on Apply
   When User will see Loan Provider
   And User will see current date
  Then User will see Status

  |loanProviderName| responseDate| loanStatus|
  |Wealth Securities Dynamic Loans (WSDL) |20-12-2024  |Approved|

