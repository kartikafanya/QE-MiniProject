Feature: Register
  As a user
  I want to register with full name, email and password

  Scenario: register with null full name , null email and null password
    Given I go to register page
    When I click register button
    Then I will get error message data is required
    And I can't register

  Scenario: register with full name, null email and null password
    Given I go to register page
    When I click register button
    Then I will get error message data is required
    And I can't register

  Scenario: register null full name , with email and null password
    Given I go to register page
    When I click register button
    Then I will get error message data is required
    And I can't register

  Scenario: register with full name, null email and with password
    Given I go to register page
    When I click register button
    Then I will get error message data is required
    And I can't register

  Scenario: register with full name , with email and null password
    Given I go to register page
    When I click register button
    Then I will get error message data is required
    And I can't register

  Scenario: register with full name, with email and with password
    Given I go to register page
    When I click register button
    Then I will not get error message data is required
    And I can register

  Scenario: register with full name , invalid email / within @, with password
    Given I go to register page
    When I click register button
    Then I will get error message data is required
    And I can't register