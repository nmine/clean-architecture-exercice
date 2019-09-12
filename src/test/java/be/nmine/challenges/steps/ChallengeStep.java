package be.nmine.challenges.steps;

import be.nmine.challenges.application.usecases.CreateChallengeCommand;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import be.nmine.challenges.repository.ChallengeRepository;
import be.nmine.challenges.repository.ChallengeRepositoryInMemory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static be.nmine.challenges.domain.challenge.Challenge.from;

public class ChallengeStep {

    private CreateChallengeHandler createChallengeHandler = new CreateChallengeHandler();;
    private ChallengeRepository challengeRepository = new ChallengeRepositoryInMemory();


    @When("I create a new challenge {string}")
    public void iCreateANewChallenge(String challengeTitle) {
        createChallengeHandler.handle(new CreateChallengeCommand(from(challengeTitle)));
    }

    @Then("I see the challenge display {string}")
    public void iSeeTheChallengeDisplay(String challengeTitle) {

    }
}
