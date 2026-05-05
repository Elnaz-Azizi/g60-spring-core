package se.lexicon.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "se.lexicon.*")// @Repository, @Service, @Controller, @Component
public class AnnotationWalletAppConfig {
}
