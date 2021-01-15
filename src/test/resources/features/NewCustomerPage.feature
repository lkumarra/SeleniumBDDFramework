Feature: Guru99Bank New Customer Page feature.

  Background: 
    Given I am on login page.
    When I enter userId as "" and password as ""
    Then I am successfully login.
    And I clicked on New Customer Link.

  Scenario: Verify labels on New Customer Page.
    When I am New Customer Page.
    Then label "Add New Customer" should be present.
    And label "Customer Name" should be present
    And label "Gender" should be present.
    And label "Date of Birth" should be present.
    And label "Address" should be present.
    And label "City" should be present.
    And label "State" should be present.
    And label "PIN" should be present.
    And label "Mobile Number" should be present.
    And label "E-mail" should be present.
    And label "Password" should be present.
