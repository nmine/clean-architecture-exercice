package be.nmine.challenges.adapters;

import be.nmine.challenges.domain.challenge.Challenge;
import be.nmine.challenges.repository.ChallengeRepository;

import java.util.ArrayList;
import java.util.List;

public class ChallengeRepositoryInMemory implements ChallengeRepository {

    public List<Challenge> challenges = new ArrayList<>();

    @Override
    public Challenge getChallenge(int id) {
        return null;
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
