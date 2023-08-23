
Feature: Login into Banking Application with Valid details

  @sanity
  Scenario: Login into Banking Application
    Given open the browser
    And open the URL "http://primusbank.qedgetech.com/"
    When Enter user name as "Admin" Password as "Admin"
    Then Click on LoginButton
  
