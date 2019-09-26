package be.nmine.challenges.infrastructure;

import be.nmine.challenges.documentation.GuidedTour;
import be.nmine.challenges.domain.challenge.Challenge;
import be.nmine.challenges.domain.repository.ChallengeRepository;

import java.util.ArrayList;
import java.util.List;

@GuidedTour(rank = 1, description = "Infrastructure , concrete implementation fo the business repository",
        name = "BusinessRuleCreateChallenge")
public class ChallengeRepositoryInMemory implements ChallengeRepository {

    public List<Challenge> challenges = new ArrayList<>();

    @Override
    public Challenge getChallenge(int id) {
        return challenges.get(0);
    }

    @Override
    public void save(Challenge challenge) {
        challenges.add(challenge);
    }

    @Override
    public List<Challenge> all() {
        return challenges;
    }
}
