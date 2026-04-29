package org.com.banking.Service;

import org.com.banking.model.Portfolio;
import org.com.banking.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository repository;

    public List<Portfolio> getPortfoliosByDate (String businessDate)
    {
        return repository.findByBusinessDate(businessDate);
    }

    public List<Portfolio> getAllPortfolios ()
    {
        return repository.findAll();
    }



}
