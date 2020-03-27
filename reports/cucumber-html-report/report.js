$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Addtocart.feature");
formatter.feature({
  "line": 1,
  "name": "Addtocart_runner",
  "description": "",
  "id": "addtocart-runner",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To check Login credentials are valid",
  "description": "",
  "id": "addtocart-runner;to-check-login-credentials-are-valid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is able to open URL in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click signin",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter valid Username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on signin",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpage_definition.the_user_is_able_to_open_URL_in_the_browser()"
});
formatter.result({
  "duration": 19792890500,
  "status": "passed"
});
formatter.match({
  "location": "Loginpage_definition.click_signin()"
});
formatter.result({
  "duration": 2330297900,
  "status": "passed"
});
formatter.match({
  "location": "Loginpage_definition.enter_valid_Username_and_password()"
});
formatter.result({
  "duration": 2305312500,
  "status": "passed"
});
formatter.match({
  "location": "Loginpage_definition.click_on_Signin()"
});
formatter.result({
  "duration": 2707093400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add to cart option",
  "description": "",
  "id": "addtocart-runner;add-to-cart-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Open the URL in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Select an item",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Add to cart option",
  "keyword": "Then "
});
formatter.match({
  "location": "Addtocart_definition.open_the_URL_in_browser()"
});
formatter.result({
  "duration": 17359292500,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_definition.select_an_item()"
});
formatter.result({
  "duration": 3625552300,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_definition.click_on_Add_to_cart_option()"
});
formatter.result({
  "duration": 549414200,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Delete from cart option",
  "description": "",
  "id": "addtocart-runner;delete-from-cart-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC_03"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Open the URL in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Go to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Delete an item from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Deletefromcart_definition.open_the_URL_in_the_browser()"
});
formatter.result({
  "duration": 21720670800,
  "status": "passed"
});
formatter.match({
  "location": "Deletefromcart_definition.go_to_the_cart()"
});
formatter.result({
  "duration": 2587475900,
  "status": "passed"
});
formatter.match({
  "location": "Deletefromcart_definition.delete_an_item_from_the_cart()"
});
formatter.result({
  "duration": 609690400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Proceed to check option",
  "description": "",
  "id": "addtocart-runner;proceed-to-check-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Open the application in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Select an item and add the item to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Click on Proceed to check option",
  "keyword": "Then "
});
formatter.match({
  "location": "Proceedtocheck_definition.open_the_application_in_the_browser()"
});
formatter.result({
  "duration": 17760880000,
  "status": "passed"
});
formatter.match({
  "location": "Proceedtocheck_definition.select_an_item_and_add_the_item_to_the_cart()"
});
formatter.result({
  "duration": 3441355700,
  "status": "passed"
});
formatter.match({
  "location": "Proceedtocheck_definition.click_on_Proceed_to_check_option()"
});
formatter.result({
  "duration": 3165813600,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "The item is in Stock before adding to the cart",
  "description": "",
  "id": "addtocart-runner;the-item-is-in-stock-before-adding-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC_05"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Open URL",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Select the item",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "check whether the selected item is in stock or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Iteminstock_definition.open_URL()"
});
formatter.result({
  "duration": 18144746600,
  "status": "passed"
});
formatter.match({
  "location": "Iteminstock_definition.select_the_item()"
});
formatter.result({
  "duration": 7345474700,
  "status": "passed"
});
formatter.match({
  "location": "Iteminstock_definition.check_whether_the_selected_item_is_in_stock_or_not()"
});
formatter.result({
  "duration": 45086300,
  "status": "passed"
});
});