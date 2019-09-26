package be.nmine.challenges.application.usecases;

import be.nmine.challenges.domain.repository.ChallengeRepository;

public class CreateChallengeHandler {

    private final ChallengeRepository challengeRepository;

    public CreateChallengeHandler(final ChallengeRepository challengeRepository) {
        this.challengeRepository = challengeRepository;
    }

    public void handle(CreateChallengeCommand createChallengeCommand) {
        challengeRepository.save(createChallengeCommand.challenge);
    }

}
