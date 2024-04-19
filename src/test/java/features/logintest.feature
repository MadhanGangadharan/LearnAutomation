

Feature: Salesforce login
  Scenario: Test positive Login
    Given user navigates to SalesforceLogin page "https://dhu000001f6eqma0-dev-ed.develop.my.salesforce.com/"
    When user fills in username "madhan12322@salesforce.com" and password "CRMADevorg@1"
    Then Login should be successfull
