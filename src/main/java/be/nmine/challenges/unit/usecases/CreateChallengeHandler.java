package be.nmine.challenges.unit.usecases;

import be.nmine.challenges.repository.ChallengeRepository;

public class CreateChallengeHandler {

    private final ChallengeRepository challengeRepository;

    public CreateChallengeHandler(final ChallengeRepository challengeRepository) {
        this.challengeRepository = challengeRepository;
    }

    public void handle(CreateChallengeCommand createChallengeCommand) {
        challengeRepository.save(createChallengeCommand.challenge);
    }
}
