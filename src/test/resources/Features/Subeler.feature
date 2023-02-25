Feature: User can search and receive information about company

  Background: Background:
    Given User on the main URL


  Scenario: User can search information and can add new company
    Given  User enter the valid credentials
    Then User navigate to Subeler page successfully
    And User enter information in search box
    #Then User can see all branches successfully or can add branches successfully