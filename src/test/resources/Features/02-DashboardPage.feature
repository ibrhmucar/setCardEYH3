@test
Feature: User can use all dashboard functions

  Background:
    Given User on the main URL

  Scenario:  The Users can create Firma successfully.
    Given User get new Vergi Numarası
    Given User enter the valid credentials
    Then  User navigate to Firmalar page successfully
    And   User can click Firma Ekle button successfully
    Then  Enter all information and create a new company successfully


  Scenario: The Users can't create Firma with invalid information
    Given User enter the valid credentials
    Then  User navigate to Firmalar page successfully
    And   User can click Firma Ekle button successfully
    Then  Enter invalid information and can't create a new company



  Scenario: The Users Check Numbers
    Given User enter the valid credentials
    Then  User navigate to Firmalar page successfully
    And   User check the numbers of the company information
    And   Check the unvan, kontrat tarihi, yemek kartı kullanımı, musteri temsilcisi and durum.

