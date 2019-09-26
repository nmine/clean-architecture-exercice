package be.nmine.challenges.domain.repository;

import be.nmine.challenges.documentation.GuidedTour;
import be.nmine.challenges.domain.challenge.Challenge;

import java.util.List;
@GuidedTour(rank = 2,
        description = "Business repository , save the business object Challenge",
        name = "BusinessRuleCreateChallenge")
public interface ChallengeRepository {

    Challenge getChallenge(int id);

    void save(Challenge challenge);

    List<Challenge> all();

}
