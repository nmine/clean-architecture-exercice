package be.nmine.challenges.infrastructure.dto;

import be.nmine.challenges.domain.challenge.Challenge;

import static be.nmine.challenges.domain.challenge.Challenge.ChallengeBuilder.aChallenge;

public class ChallengeDTOFactory {

    public static ChallengeDTO from(Challenge challenge) {
        ChallengeDTO challengeDTO = new ChallengeDTO();
        challengeDTO.setCategory(challenge.category);
        challengeDTO.setTitle(challenge.title);
        return challengeDTO;
    }

    public static ChallengeDTO from(String title, String category) {
        ChallengeDTO challengeDTO = new ChallengeDTO();
        challengeDTO.setCategory(category);
        challengeDTO.setTitle(category);
        return challengeDTO;
    }

    public static Challenge from(ChallengeDTO challengeDTO) {
        return aChallenge()
                .withTitle(challengeDTO.getTitle())
                .withCategory(challengeDTO.getCategory()).build();
    }
}
