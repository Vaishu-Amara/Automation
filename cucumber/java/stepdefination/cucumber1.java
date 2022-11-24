package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber1 {
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is in newtours application");
	}

	@When("user needs to enter method name and password")
	public void user_needs_to_enter_method_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is in newtours application");
	}

	@Then("user clicks on sign on button")
	public void user_clicks_on_sign_on_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is in newtours application");
	}

	@And("user navigated to user application")
	public void user_navigated_to_user_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is in newtours application");
	}

}
