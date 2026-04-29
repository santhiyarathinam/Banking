package org.com.banking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.com.banking.model.Portfolio;

import java.util.List;

public interface PortfolioRepository extends MongoRepository<Portfolio, String>
{
    List<Portfolio> findByBusinessDate(String businessDate);

    List<Portfolio> findAll();
}
