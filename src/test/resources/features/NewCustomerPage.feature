Feature: Guru99Bank New Customer Page feature.

  Background: 
    Given I navigate to url "http://www.demo.guru99.com/V4/" to test New Customer feature
    When I enter userID as "mngr302250" and password as "vYpAnEg" to login sucessfully
    Then I clicked on New Customer Link.

  Scenario: Verify labels on New Customer Page
    Then heading "Add New Customer" should be present.
    And label customer name with text "Customer Name" should be present
    And label gender with text "Gender" should be present.
    And label Date of Birth with text "Date of Birth" should be present.
    And label Address with text "Address" should be present.
    And label City with text "City" should be present.
    And label State with text "State" should be present.
    And label PIN with text "PIN" should be present.
    And label Mobile Number with test "Mobile Number" should be present.
    And label E-Mail with text "E-mail" should be present.
    And label Password with text "Password" should be present.
