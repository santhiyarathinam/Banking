package org.com.banking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "portfolio")
public class Portfolio {

    @Id
    private String id;

    private String portfolioId;
    private String businessDate;

    public Portfolio() {}

    public Portfolio(String portfolioId, String businessDate) {
        this.portfolioId = portfolioId;
        this.businessDate = businessDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }
}