package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @Given("I go to register page")
    public void iGoToRegisterPage() {
        System.out.println("I go to register page");

    }

    @When("I click register button")
    public void iClickRegisterButton() {
        System.out.println("I click register button");

    }

    @And("I can't register")
    public void iCanTRegister() {
        System.out.println("I can't register");

    }

    @Then("I will not get error message data is required")
    public void iWillNotGetErrorMessageDataIsRequired() {
        System.out.println("I will not get error message data is required");
    }

    @And("I can register")
    public void iCanRegister() {
        System.out.println("I can register");
    }
}
