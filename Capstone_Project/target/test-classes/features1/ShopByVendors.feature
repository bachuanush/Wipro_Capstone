
Feature: Order products using Shop By vendor
Scenario Outline: Shop from vendors
Given Website should be opened
When go to sigin page
And login with the details
And Select a vendor from vendors list
And select the product and Add the product to the Wishlist

And product should be added to the wishlist
And select a product from the Wishlist

And add the product to the cart
And product should added to cart

And shop the product from the cart
And enters shipping details with first name "<fname>", last name "<lname>", address "<addrs>", state "<state>", and pincode <pincode>

And place the order after submitting the details
Then Successfuly ordered aproduct from vendors and added it to wishlist and then ordered from the wishlist


    Examples:
      | fname     | lname    |               addrs                    | state        | pincode |
      | Anush     | Kumar    | 123, Hanamkonda, Warangal, Telangana   | Telangana    | 506001  |
      
      
