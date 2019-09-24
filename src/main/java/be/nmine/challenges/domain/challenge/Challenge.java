package be.nmine.challenges.domain.challenge;

public class Challenge {

    public String title;
    public String category;

    private  Challenge(String challengeTitle, String category) {
        this.title = challengeTitle;
        this.category = category;
    }

    public static Challenge from(String challengeTitle,String category) {
        return new Challenge(challengeTitle,category);
    }
}
