package be.nmine.challenges.unit.usecases;


import be.nmine.challenges.adapters.ChallengeRepositoryInMemory;
import be.nmine.challenges.domain.challenge.Challenge;
import be.nmine.challenges.repository.ChallengeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        createChallengeHandler.handle(new CreateChallengeCommand(Challenge.from(challengeTitle,category)));
        //Then
        Assert.assertEquals("Ne pas manger de sucre",challengeRepository.all().get(0).title);
    }

}
