Feature: Login
  As a user
  I want to login with my email and password
  So i can access all of the feature

  Scenario: Login with null email and null password
    Given I go to login page
    When I click login button
    Then I will get error message data is required
    And I can't login

  Scenario: Login with valid email and invalid password
    Given I go to login page
    When I click login button
    Then I will get error message data is required
    And I can't login

  Scenario: Login with invalid email and valid password
    Given I go to login page
    When I click login button
    Then I will get error message data is required
    And I can't login

  Scenario: Login with valid email and invalid password
    Given I go to login page
    When I click login button
    Then I will get error message data is required
    And I can't login

  Scenario: Login with valid email and valid password
    Given I go to login page
    When I click login button
    Then I will not get error message
    And I can login successfully

  Scenario: Login with null email and invalid password
    Given I go to login page
    When I click login button
    Then I will get error message data is required
    And I can't login

  Scenario: Login with valid email and null password
    Given I go to login page
    When I click login button
    Then I will get error message data is required
    And I can't login

