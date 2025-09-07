
    
     Feature: check the existing_orders_user functionalities

  Scenario: Validate user3 prevoius orders and login
    Given go to website and it should be opened in Browser
    When navigate to sigin
    And login with the user3
    And user should had logged in
    
    And go to the orders page 
    And check the previous orders products
    
    And click on signout 
    And signed out successfully
    
    Then validated the user3 functionalities