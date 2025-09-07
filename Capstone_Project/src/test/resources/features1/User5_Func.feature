  
     
Feature: check the locked_user functionalities

Scenario: Validate user5 login functionality
Given redirect to webpage
    
When navigate to login page
And  enter the user5 signin credentials 
       
And user not able to login to website
  
Then validated the user5 login