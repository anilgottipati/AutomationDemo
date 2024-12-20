Feature: TestToVerifythePracticeForm

  Background: User launch Application

  Scenario: Check Login is successfull
    Given user is on login page
    And user enters username and password
    When user click on login
    Then user is navigate to homepage
    Then account services will display

    |username|password|Account Services|
    |Radhika |4747    |Open New Account ,Accounts Overview,Transfer Funds,Bill Pay,Find Transactions,Update Contact Info, Request Loan, Log Out|




Scenario : User on Request loan
    And User Click on Request Loan
    When User Enter on Loan Amount
    When USer Enter Down Payment

  |amount|downPayment|
  |1000|200|

Scenario: When User Click on Apply
   When User will see Loan Provider
   And User will see current date
  Then User will see Status

  |loanProviderName| responseDate| loanStatus|
  |Wealth Securities Dynamic Loans (WSDL) |20-12-2024  |Approved|

