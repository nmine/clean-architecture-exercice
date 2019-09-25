package be.nmine.challenges.configuration;

import be.nmine.challenges.repository.ChallengeRepository;
import be.nmine.challenges.repository.ChallengeRepositoryInMemory;
import be.nmine.challenges.usecases.CreateChallengeHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ContextConfigurationTesting {
    @Bean
    public ChallengeRepository challengeRepository() {
        return new ChallengeRepositoryInMemory();
    }

    @Bean
    public CreateChallengeHandler createChallengeHandler() {
        return new CreateChallengeHandler(challengeRepository());
    }
}
