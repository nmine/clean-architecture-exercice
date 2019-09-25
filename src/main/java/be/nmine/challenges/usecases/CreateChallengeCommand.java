package be.nmine.challenges.usecases;

import be.nmine.challenges.domain.challenge.Challenge;

public class CreateChallengeCommand {

    public Challenge challenge;

    public CreateChallengeCommand(Challenge challenge) {
        this.challenge = challenge;
    }
}
