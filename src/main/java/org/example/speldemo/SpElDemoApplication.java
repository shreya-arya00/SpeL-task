package org.example.speldemo;

import org.example.speldemo.entitiies.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties
public class SpElDemoApplication implements CommandLineRunner {

    private final ApplicationContext applicationContext;
    private final Environment environment;

    public SpElDemoApplication(ApplicationContext applicationContext, Environment environment) {
        this.applicationContext = applicationContext;
        this.environment = environment;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpElDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Test test = applicationContext.getBean(Test.class);
        System.out.println(test);
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
