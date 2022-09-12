Feature: Demo web shop
  Background:
    Given Lunch chrome
  Scenario: Test demo web shop functionality
    Given Demo web shop page is open
    When user enter valid username and password
    Then user login successfully




