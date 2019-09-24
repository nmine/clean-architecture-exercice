package be.nmine.challenges.configuration;

import cucumber.api.java8.En;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        RepositoriesConfiguration.class})
class ContextConfigurationTesting implements En {

}
