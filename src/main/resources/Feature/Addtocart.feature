Feature:  Addtocart_runner

@TC_01
Scenario: To check Login credentials are valid
  
Given the user is able to open URL in the browser
When click signin
When Enter valid Username and password
Then Click on signin

@TC_02
Scenario: Add to cart option

Given Open the URL in browser
When Select an item
Then Click on Add to cart option

@TC_03
Scenario: Delete from cart option

Given Open the URL in the browser
When Go to the cart
Then Delete an item from the cart

@TC_04
Scenario: Proceed to check option

Given Open the application in the browser
When Select an item and add the item to the cart
Then Click on Proceed to check option

@TC_05
Scenario: The item is in Stock before adding to the cart

Given Open URL
When Select the item
Then check whether the selected item is in stock or not

@TC_06
Scenario: The payment is happening  without login into the application

Given Open the URL
When Add an item to the cart and proceed to check
Then Navigating to the login page
