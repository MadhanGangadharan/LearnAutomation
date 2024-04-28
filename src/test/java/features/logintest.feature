#@tag @tag1
Feature: Login functionality of the Salesforce Login page

  #@smoke
  Scenario: Validate that the user is able to login to the app successfully
    Given user navigates to SalesforceLogin page "https://dhu000001f6eqma0-dev-ed.develop.my.salesforce.com/"
    When user fills in username "madhan12322@salesforce.com" and password "CRMADevorg@1"
    Then Login should be successfully

  #@tag_test02
  Scenario: Validate when the user enters the wrong username and password
    Given user navigates to SalesforceLogin page "https://dhu000001f6eqma0-dev-ed.develop.my.salesforce.com/"
    When user fills in username "madhan12322@salesforce.com" and password "CRMA"
    Then Login should fail with the error

  #@tag_test03
  Scenario: Test if the user is able to create a new account after Logging in
    Given user navigates to SalesforceLogin page "https://dhu000001f6eqma0-dev-ed.develop.my.salesforce.com/"
    When user fills in username "madhan12322@salesforce.com" and password "CRMADevorg@1"
    Then Login should be successfull and create a new account "TestingCucumberFramework"
