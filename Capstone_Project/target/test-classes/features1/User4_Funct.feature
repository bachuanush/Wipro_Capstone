 
     
     Feature: check the fav_user functionalities

  Scenario: Validate user4 prevoius orders and login
    Given go to website
    
    When redirect to login
    And signin with the user3
    And user should had logged in with user3 credentials
    
    And go to the favourites page 
    And view the products
    And remove products from favourites
    
    And click on logout option 
    And logged out from the bstackdemo
    
    Then validated the user4 functionalities