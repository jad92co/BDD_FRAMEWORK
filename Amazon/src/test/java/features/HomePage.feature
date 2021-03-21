Feature: SearchBox Functionality check

  @smokeTest
  Scenario: Amazon searchBox functionality check with valid product
    Given I am on amazon homePage
    And I enter "Hand Sanitizer" in searchBox
#    When I click on search Button
#    Then I should see Hand Sanitizer is properly appear
#    But I should not see mobile is appear
#    And I verify Hand Sanitizer in product title

  @pending @mahmud
  Scenario: Amazon searchBox functionality check with valid product
    Given I am on amazon homePage
    And I enter Hand Sanitizer in searchBox
    When I click on search Button
    Then I should see Hand Sanitizer is properly appear
    But I should not see mobile is appear
    And I verify Hand Sanitizer in product title














