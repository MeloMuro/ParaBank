Feature: DataTable Register Functionality

  Background:

    Given Navigate to para bank
    When Click to register
    Then User should form message

  Scenario: Create a user registration
    And Send keys in locators
      | firstName | David |
      | lastName | Smit |
      | address | No.1 |
      | city | California |
      | state | Ney York |
      | zipcode | 12345 |
      | phoneNmr |5642 |
      | ssn | 166666 |
      | userName | David Smit |
      | password | 12345ds |
      | passwordRpt | 12345ds |

    And Click to register button
    Then Success message should be displayed

