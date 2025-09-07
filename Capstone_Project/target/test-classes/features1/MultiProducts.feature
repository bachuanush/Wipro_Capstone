Feature: select products from the different brands and add multiple products to cart
Scenario: adding multiple products to cart from different brands
Given open the website
When redirect to the authenticate page
And enter the user details
And user had successfully entered to the page

And search the different products 
And sort the products from the increasing order
And add items to the cart from each brands

And different items should added successfully to cart
And Increase the product quantity in the cart

Then Added different items from the different brands to the cart successfully