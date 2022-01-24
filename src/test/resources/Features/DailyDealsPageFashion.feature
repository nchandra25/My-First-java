Feature: Daily Deals Page 
  

@TC_RF_0002
  Scenario: In The Daily Deals page user can go Fashion Link and click Mens Shoes
  
    Given Lanch dell "<URL>"
    And  User click Daily Deals link                                   
    Then User Mouse Over to the Fashion Link
    Then User click in 'Men's Shoes' link  
    And Verify Men's Shoes page is display
    
