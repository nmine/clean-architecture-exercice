package be.nmine.challenges.domain.challenge;

import java.util.Objects;

public class Challenge {

    public final String title;
    public final String category;

    public Challenge(String challengeTitle, String category) {
        this.title = challengeTitle;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return Objects.equals(title, challenge.title) &&
                Objects.equals(category, challenge.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, category);
    }


    public static final class ChallengeBuilder {
        public String title;
        public String category;

        private ChallengeBuilder() {
        }

        public static ChallengeBuilder aChallenge() {
            return new ChallengeBuilder();
        }

        public ChallengeBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ChallengeBuilder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Challenge build() {
            Challenge challenge = new Challenge(title, category);
            return challenge;
        }
    }
}
