package org.com.banking.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.com.banking.Service.PortfolioService;
import org.com.banking.model.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "Portfolio APIs", description = "Operations related to portfolios")
@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @GetMapping("/portfolios")
    public List<Portfolio> getPortfoliosByDate(@RequestParam
                                               String businessDate)
    {
        if (businessDate == null) {
            throw new IllegalArgumentException("businessDate is required");
        }
        return service.getPortfoliosByDate(businessDate);
    }

    @GetMapping("/all")
    public List<Portfolio> getAllPortfolios() {
        return service.getAllPortfolios();
    }

}
