Feature: As a User, User can use all dashboard functions

  Background:
    Given User on the main URL

  Scenario:  The Users can enter information successfully Firmalar page.
    Given User get new Vergi Numarası
    Given User enter the valid credentials
    Then  User navigate to Firmalar page successfully
    And   User can click Firma Ekle button successfully
    Then  Enter all information
@test
  Scenario: The Users Check Numbers
    Given User enter the valid credentials
    Then  User navigate to Firmalar page successfully
    And   User check the numbers of the company information

