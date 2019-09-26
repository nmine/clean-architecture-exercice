package acceptance.configuration;

import be.nmine.challenges.domain.repository.ChallengeRepository;
import be.nmine.challenges.infrastructure.ChallengeRepositoryInMemory;
import be.nmine.challenges.application.usecases.CreateChallengeHandler;
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
