Feature: Amazon HomePage Header

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on amazon homePage

  @smokeTest
  Scenario: Amazon searchBox functionality check with valid product
    And I enter "Hand Sanitizer" in searchBox
    When I click on search Button
    Then I should see "Hand Sanitizer" is properly appear
    But I should not see "mobile" is appear
    And I verify "Amazon.com : Hand Sanitizer" in product title

  @pending @mahmud @RegressionTest
  Scenario: Amazon searchBox functionality check with valid product1
    And I enter "Mask" in searchBox
    When I click on search Button
    Then I should see "Mask1" is properly appear
    But I should not see "mobile" is appear
    And I verify "Amazon.com : Mask" in product title

  @test @IntegrationTest
  Scenario: Amazon searchBox functionality check with valid product2
    And I enter "MacBook" in searchBox
    When I click on search Button
    Then I should see "MacBook" is properly appear
    But I should not see "mobile" is appear
    And I verify "Amazon.com : MacBook" in product title





