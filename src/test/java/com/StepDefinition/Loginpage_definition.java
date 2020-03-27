package com.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Pages.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpage_definition{
	WebDriver driver;
	Loginpage lp = new Loginpage(driver);

@Given("^the user is able to open URL in the browser$")
public void the_user_is_able_to_open_URL_in_the_browser() throws Throwable {
	lp.url("chrome");
	lp.Launch_URL();
}
	@When("^click signin$")
	public void click_signin() {
		// Write code here that turns the phrase above into concrete actions
		lp.Signin();
	}

	@When("^Enter valid Username and password$")
	public void enter_valid_Username_and_password() throws IOException {
		// Write code here that turns the phrase above into concrete action
			lp.usernameandpassword();

	}

	@Then("^Click on signin$")
	public void click_on_Signin() {
		// Write code here that turns the phrase above into concrete actions
		lp.Click();
	}
}