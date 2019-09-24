package be.nmine.challenges.configuration;

import be.nmine.challenges.adapters.ChallengeRepositoryInMemory;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
import be.nmine.challenges.repository.ChallengeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RepositoriesConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public ChallengeRepository challengeRepository() {
        return new ChallengeRepositoryInMemory();
    }

    @Bean
    @Scope("cucumber-glue")
    public CreateChallengeHandler createChallengeHandler() {
        return new CreateChallengeHandler(challengeRepository());
    }

}
