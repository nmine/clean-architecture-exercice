package be.nmine.challenges.application.usecases;

import be.nmine.challenges.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateChallengeHandler {

    @Autowired
    private ChallengeRepository challengeRepository;

    public void handle(CreateChallengeCommand createChallengeCommand) {
        challengeRepository.save(createChallengeCommand.challenge);
    }
}
