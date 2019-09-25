package be.nmine.challenges.repository;

import be.nmine.challenges.domain.challenge.Challenge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ChallengeRepositoryInMemory implements ChallengeRepository {
    Logger logger = LoggerFactory.getLogger(ChallengeRepositoryInMemory.class);
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
