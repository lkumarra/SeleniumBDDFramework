Feature: Guru99 Bank login page feature
  As a user i wants to verify the login page feature.

  Background: 
    Given As a user i navigate to url "http://www.demo.guru99.com/V4/"

  Scenario: Verify userId and Password label
    Then UserId label is "UserId"
    And Password Label is "Password"

  Scenario: Verify alert text
    When I enter userId as "" and password ""
    Then I get a alert with text "User or Password is not valid"
