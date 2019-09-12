package be.nmine.challenges.domain.challenge;

public class Challenge {

    public String title;

    private  Challenge(String title) {
        this.title = title;
    }

    public static Challenge from(String challengeTitle) {
        return new Challenge(challengeTitle);
    }
}
