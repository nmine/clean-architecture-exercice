package unit;


import be.nmine.challenges.repository.ChallengeRepository;
import be.nmine.challenges.repository.ChallengeRepositoryInMemory;
import be.nmine.challenges.application.usecases.CreateChallengeCommand;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static be.nmine.challenges.domain.challenge.Challenge.ChallengeBuilder.aChallenge;

public class CreateChallengeHandlerTest {

    CreateChallengeHandler createChallengeHandler;

    private ChallengeRepository challengeRepository = new ChallengeRepositoryInMemory();

    @Before
    public void init() {
        createChallengeHandler = new CreateChallengeHandler(challengeRepository);
    }

    @Test
    public void can_create_challenge() {
        //Given
        String challengeTitle = "Ne pas manger de sucre";
        String category = "alimentation";
        //When
        createChallengeHandler.handle(new CreateChallengeCommand(aChallenge().withCategory(category).withTitle(challengeTitle).build()));
        //Then
        Assert.assertEquals("Ne pas manger de sucre",challengeRepository.all().get(0).title);
    }

}
