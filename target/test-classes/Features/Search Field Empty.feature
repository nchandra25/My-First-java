Feature: Search Field Empty
  

  @TC_RF_0001 
  Scenario: Without Entering input in the search field
  
    Given Lanch dell "<URL>"
    And User Do not Enter anyting in the search field  
    When User click in the Search button   
    Then Verify user item is not display and warning message pop up
