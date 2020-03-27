package com.StepDefinition;

import java.io.IOException;

import com.Pages.Proceedtocheck;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Proceedtocheck_definition extends Proceedtocheck {
	@Given("^Open the application in the browser$")
	public void open_the_application_in_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		url("chrome");
		Launch_URL();
	}

	@When("^Select an item and add the item to the cart$")
	public void select_an_item_and_add_the_item_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		mouseactions();
		Select_item();
	}

	@Then("^Click on Proceed to check option$")
	public void click_on_Proceed_to_check_option() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		Click_Proceedtocheck();
		Screenshot();
	}
}