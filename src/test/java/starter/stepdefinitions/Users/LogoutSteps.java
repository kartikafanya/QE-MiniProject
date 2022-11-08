package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        System.out.println("I have logged in");
    }

    @When("I click logout button")
    public void iClickLogoutButton() {
        System.out.println("I click logout button");
    }

    @Then("I will go to logout page")
    public void iWillGoToLogoutPage() {
        System.out.println("I will go to logout page");
    }

    @And("I can logout successfully")
    public void iCanLogoutSuccessfully() {
        System.out.println("I can logout successfully");
    }
}
