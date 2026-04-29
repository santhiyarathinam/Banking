package org.com.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "org.com.banking.repository")
public class BankingApplication {
    public static void main (String[] args)
    {
        SpringApplication.run(BankingApplication.class, args);
    }
}
