

Feature: Brand Outlet Page 
  

  @TC_RF_0003 
  Scenario: User can see In the Brand Outlet Page Up to 30% off Burberry
  
    Given Lanch dell "<URL>"
    And User click in the Brand Outlet  link
    When User click in the  Up to 30% off Burberry  
    Then Verify Up to 30% off Burberry page is display
    
    
