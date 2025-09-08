 
    
    Feature: Website Automation with user1
    
  Scenario: shopping with the user1 id
    Given open the browser
    When go to the login page
    
    And login to the website with user1 credentials
    
    And search the product
    And High to Low filters
    And Low to High filters
    
    And select the brands from the vendors filter
    And select a product from the particular brand
    
    And apply the low to high filter
    And apply the high to low filter
       

	And logout from the page
    Then the user is successfully selected product and applied filter

