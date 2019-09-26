package be.nmine.challenges.infrastructure;

import be.nmine.challenges.application.usecases.CreateChallengeCommand;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import be.nmine.challenges.documentation.GuidedTour;
import be.nmine.challenges.domain.repository.ChallengeRepository;
import be.nmine.challenges.infrastructure.dto.ChallengeDTO;
import org.springframework.web.bind.annotation.*;

import static be.nmine.challenges.infrastructure.dto.ChallengeDTOFactory.from;

@RestController
@GuidedTour(rank = 0,
        description = "Infrastructure , Rest controller that will execute the business rule by caling the handler",
        name = "BusinessRuleCreateChallenge")
public class RestChallengesController {

    private final CreateChallengeHandler createChallengeHandler;
    private final ChallengeRepository challengeRepository;

    public RestChallengesController(final CreateChallengeHandler createChallengeHandler, ChallengeRepository challengeRepository) {
        this.createChallengeHandler = createChallengeHandler;
        this.challengeRepository = challengeRepository;
    }

    @RequestMapping(value = "/challenge/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ChallengeDTO getChallengeFromId(@PathVariable("id") int id) {
        return from(challengeRepository.getChallenge(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createChallenge(@RequestBody ChallengeDTO challenge) {
        createChallengeHandler.handle(new CreateChallengeCommand(from(challenge)));
    }
}
