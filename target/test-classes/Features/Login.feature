@test
Feature: As a Admin User, User can login with credentials.

  Background:
    Given User on the main URL


  Scenario: The User can login successfully with valid credentials
    When  User enter the valid credentials
    Then User should be able to log in


  Scenario Outline: The User cannot login with invalid credentials

    When User enter "<email>" and "<password>" and should be able to see "<message>" message


    Examples:
      | email                 | password  | message                                |
      |                       | Setcard12 | Bu alan zorunludur                     |
      | ibrahimucar@gmail.com |           | Bu alan zorunludur                     |
      |                       |           | Bu alan zorunludur                     |
      | ibrahimucar@gmail.com | Abcdefg   | Kullanıcı adınız veya şifreniz yanlış. |

