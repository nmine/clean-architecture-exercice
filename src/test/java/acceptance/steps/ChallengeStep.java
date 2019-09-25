package acceptance.steps;

import be.nmine.challenges.usecases.CreateChallengeCommand;
import be.nmine.challenges.usecases.CreateChallengeHandler;
import cucumber.api.java8.En;

import static be.nmine.challenges.domain.challenge.Challenge.ChallengeBuilder.aChallenge;

public class ChallengeStep implements En {

    public ChallengeStep(CreateChallengeHandler createChallengeHandler) {
        When("^I create a new challenge with title \"([^\"]*)\" and category \"([^\"]*)\"$", (String title, String category) -> {
            createChallengeHandler.handle(new CreateChallengeCommand(aChallenge().withCategory(category).withTitle(title).build()));
        });
        Then("^I see the challenge display \"([^\"]*)\"  with title \"([^\"]*)\" and category \"([^\"]*)\"$", (String name, String title, String category) -> {

        });
    }
}
