package integration;

import be.nmine.challenges.Application;
import be.nmine.challenges.domain.challenge.Challenge;
import be.nmine.challenges.infrastructure.dto.ChallengeDTO;
import be.nmine.challenges.infrastructure.dto.ChallengeDTOFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static be.nmine.challenges.domain.challenge.Challenge.ChallengeBuilder.aChallenge;
import static be.nmine.challenges.infrastructure.dto.ChallengeDTOFactory.from;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestChallengesControllerTest {

    public static final String PATH_CHALLENGE = "/challenge/";
    public static final String TEST_SERVER_URL = "http://localhost:";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void can_get_challenge_from_rest_controller() throws IOException {
        //Given
        String url = TEST_SERVER_URL + port + PATH_CHALLENGE;
        String category = "category";
        String title = "title";
        ChallengeDTO request = from(aChallenge()
                .withCategory(category)
                .withTitle(title).build());
        this.restTemplate.postForEntity(url, request, ChallengeDTO.class);
        //When
        String response = this.restTemplate.getForObject(TEST_SERVER_URL + port + PATH_CHALLENGE + "/1", String.class);
        ChallengeDTO actualChallenge = new ObjectMapper().readValue(response, ChallengeDTO.class);
        //Then
        Challenge expected = aChallenge().withCategory(category).withTitle(title).build();
        Challenge actual = ChallengeDTOFactory.from(actualChallenge);
        assertThat(actual).isEqualTo(expected);
    }
}
