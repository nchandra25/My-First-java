

Feature: Search Items
  

  @TC_RF_0001 
  Scenario: In the search field user can search items
  
    Given Lanch dell "<URL>"
    And User Enter Watch For Men In the Search field  
    When User click in the  Search button    
    Then Verify Watch Product is disply
    
    
  