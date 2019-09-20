package be.nmine.challenges.repository;

import be.nmine.challenges.domain.challenge.Challenge;

import java.util.List;

public interface ChallengeRepository {

    Challenge getChallenge(int id);

    void save(Challenge challenge);

    List<Challenge> all();

}
