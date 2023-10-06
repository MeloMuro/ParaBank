Feature: New Account Functionality
  Background: Given Navigate to parabank.parasoft.com
    When Click to register button and adminPage
    And Enter first name last name, address,city, state, zip code, SSN, username, password, confirm and click to register
    And User should register  successfully.
    Then User should logout successfully

  Scenario: User can be new account
    When Navigate to parabank.parasoft.com
    Then Click to new open new account
    And Select savings
    And User should verify less money amount
    And Select amount money
    And Click to new account button
    Then User should open successfully new account and congragulate

