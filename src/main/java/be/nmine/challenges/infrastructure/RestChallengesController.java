package be.nmine.challenges.infrastructure;

import be.nmine.challenges.infrastructure.dto.ChallengeDTO;
import be.nmine.challenges.repository.ChallengeRepository;
import be.nmine.challenges.application.usecases.CreateChallengeCommand;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import org.springframework.web.bind.annotation.*;

import static be.nmine.challenges.infrastructure.dto.ChallengeDTOFactory.from;

@RestController
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
