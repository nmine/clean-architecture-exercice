package be.nmine.challenges.steps;

import be.nmine.challenges.unit.usecases.CreateChallengeCommand;
import be.nmine.challenges.unit.usecases.CreateChallengeHandler;
import be.nmine.challenges.domain.challenge.Challenge;
import cucumber.api.java8.En;

public class ChallengeStep implements En {

    public ChallengeStep(CreateChallengeHandler createChallengeHandler) {
        When("^I create a new challenge with title \"([^\"]*)\" and category \"([^\"]*)\"$", (String title, String category) -> {
            createChallengeHandler.handle(new CreateChallengeCommand(Challenge.from(title, category)));
        });
        Then("^I see the challenge display \"([^\"]*)\"  with title \"([^\"]*)\" and category \"([^\"]*)\"$", (String name, String title, String category) -> {

        });
    }
}
