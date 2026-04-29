package org.com.banking.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.com.banking.model.Portfolio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "Portfolio APIs", description = "Operations related to portfolios")
@RestController
public class PortfolioController {

    @GetMapping("/portfolios")
    public List<Portfolio> getPortfoliosByDate(@RequestParam
                                               String businessDate)
    {
        List<Portfolio> portfolios = new ArrayList<>();

        portfolios.add( new Portfolio("PF0001", businessDate));
        portfolios.add(new Portfolio("PF0002", businessDate));

        return portfolios;
    }

}
