  
    Feature: check the Image_not_Loading User functionalities

  Scenario: Validate user2 product image not displayed and login
    Given open the Browser
    When redirect to sigin
    And login with the user2
    And user had looged in
    
    And check the products
    And image should not be displayed for the products
    
    And then click on logout 
    And logout successfully
    
    Then validated the user2 functionalities
