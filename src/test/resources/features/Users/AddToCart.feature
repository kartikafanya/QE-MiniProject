Feature: Cart
  As a user
  I want to add a product to cart

  Scenario: Didn't add anything to cart
    Given I go to home page
    When I click cart button
    Then I will go to cart menu
    And I can go to cart menu

  Scenario: Add order to cart
    Given I go to home page
    When I click cart button
    Then I will go to cart menu
    And I can go to cart menu and find list order