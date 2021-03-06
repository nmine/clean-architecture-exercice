package be.nmine.challenges.domain.challenge;

import be.nmine.challenges.documentation.Builder;
import be.nmine.challenges.documentation.BusinessDomain;
import be.nmine.challenges.documentation.Glossary;
import be.nmine.challenges.documentation.GuidedTour;

import java.util.Objects;

import static be.nmine.challenges.documentation.Domain.ALLOCATION;

@GuidedTour(rank = 3,
        description = "Business object",
        name = "BusinessRuleCreateChallenge")
/**
 A action to repeat every day created by a user of the application
 */
@Glossary
@BusinessDomain(value = ALLOCATION)
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

    @Builder
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
