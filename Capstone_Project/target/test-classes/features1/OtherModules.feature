Feature: Explore all the other Modules
Scenario: Subscribe to the news letter and check other sections
Given open the bstackdemo 
When redirect to sigin page
And enter the login details

And go to the newletter section
And enter the email address and subscribe it
And user should successfully subscribed to the newsletter

And go to the privacy policy section
And read the privacy policy 

And go to the offers section
And check any offers are avilable

And if any offers are available add the products to the cart
And if there are no offers are available, go to the main page

Then Explored all the Modules