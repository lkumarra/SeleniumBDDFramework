Feature: Guru99Bank home page feature

  Background: 
    Given I navigate to url "http://www.demo.guru99.com/V4/"
    When I enter userID as "mngr302250" and password as "vYpAnEg"
    Then I successfully login.

  Scenario: Verify welcome message and manager id.
    When I am home page
    Then A welcome message "Welcome To Manager's Page of Guru99 Bank" should present.
    And user userID with message "Manger Id : mngr302250" should present.

  Scenario Outline: Verify all links on home page.
    When I am on home page.
    Then All links <links> should be present on homepage.

    Examples: 
      | links                |
      | Manager              |
      | New Customer         |
      | Edit Customer        |
      | Delete Customer      |
      | New Account          |
      | Edit Account         |
      | Delete Account       |
      | Deposit              |
      | Withdrawal           |
      | Fund Transfer        |
      | Change Password      |
      | Balance Enquiry      |
      | Mini Statement       |
      | Customised Statement |
      | Log out              |
