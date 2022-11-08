package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("I go to login page");
    }

    @When("I click login button")
    public void iClickLoginButton(){
        System.out.println("I click login button");
    }

    @Then("I will get error message data is required")
    public void iWillGetErrorMessageDataIsRequired(){
        System.out.println("I will get error message data is required");
    }

    @And("I can't login")
    public void iCanTLogin(){
        System.out.println("I can't login");
    }

    @Then("I will not get error message")
    public void iWillNotGetErrorMessage() {
        System.out.println("I will not get error message");
        
    }

    @And("I can login successfully")
    public void iCanLoginSuccessfully() {
        System.out.println("I can login successfully");
    }
}
