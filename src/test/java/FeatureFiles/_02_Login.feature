Feature: DataTable Login Functionality

 Background:
    Given Navigate to para bank

  Scenario Outline: Sing in with user name and password and click sign in button

    When Send keys user name as "<userName2>" password as "<passWord2>" and click sign in button
    Then Fail message should de displayed
    Examples:
      | userName2     | passWord2 |
      | David smith   |           |
      |               | 987654321 |


 Scenario: Login with user name and password and click sign in button

    When Send keys user name as "David Smit" password as "12345ds" and click sign in button
    Then User should login message

 Scenario: User logs out
   Then Click to logout button









