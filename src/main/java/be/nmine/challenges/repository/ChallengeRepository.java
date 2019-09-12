package be.nmine.challenges.repository;

import be.nmine.challenges.domain.challenge.Challenge;

public interface ChallengeRepository {

    Challenge getChallenge(int id);


}
