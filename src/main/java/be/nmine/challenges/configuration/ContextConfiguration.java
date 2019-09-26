package be.nmine.challenges.configuration;

import be.nmine.challenges.domain.repository.ChallengeRepository;
import be.nmine.challenges.infrastructure.ChallengeRepositoryInMemory;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ContextConfiguration {
    @Bean
    public ChallengeRepository challengeRepository() {
        return new ChallengeRepositoryInMemory();
    }

    @Bean
    public CreateChallengeHandler createChallengeHandler() {
        return new CreateChallengeHandler(challengeRepository());
    }
}
