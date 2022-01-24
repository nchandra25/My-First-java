Feature: Help & Contact Page 
  

@TC_RF_0004
  Scenario: User can go Help & Contact Page click Buying as a guest
  
    Given Lanch dell "<URL>"
    And User click in the Help & Contact  link                                      
    Then User  click Buying as a guest
    Then Verify Buying as a guest  page is display 
