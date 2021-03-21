Feature: Amazon HomePage Header

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am on amazon home page
    When I click on Best seller

  @SmokeTest  @Test
  Scenario: Amazon SearchBox Functionality check with valid credential
    And I enter Hand Sanitizer in searchBox
    When I click on search Button
    Then I verify Hand Sanitizer is appear properly
    And I verify page title as Hand Sanitizer

  @Test
  Scenario: Best seller should be amazon header
    Then I verify page title as best seller

  @Test
  Scenario: Best seller page should have See more Best Sellers in Toys & Games option
    And I click on See more Best Sellers in Toys & Games
    Then I verify Best Sellers in Toys & Games is exist

  @TestSendingValue
  Scenario: Amazon SearchBox Functionality check with valid credential
    And I enter "Hand Sanitizer" in searchBox
    When I click on search Button
    Then I verify "\"Hand Sanitizer\"" is appear properly
    And I verify page title as Hand Sanitizer




