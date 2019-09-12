package be.nmine.challenges.steps;

import cucumber.api.java.en.Given;

public class UserStep {
    @Given("I'm authenticated as {string} {string}")
    public void iMAuthenticatedAs(String firstName, String lastName) {
    }
}
