package be.nmine.challenges.steps;

import be.nmine.challenges.application.usecases.CreateChallengeCommand;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import be.nmine.challenges.repository.ChallengeRepository;
import cucumber.api.java.en.When;

import static be.nmine.challenges.domain.challenge.Challenge.from;

public class ChallengeStep {

    private CreateChallengeHandler createChallengeHandler;
    private ChallengeRepository challengeRepository;

    @When("I create a new challenge with title {string} and category {string}")
    public void iCreateANewChallengeWithTitleAndCategory(String challengeTitle, String category) {
        createChallengeHandler.handle(new CreateChallengeCommand(from(challengeTitle, category)));
    }
}
