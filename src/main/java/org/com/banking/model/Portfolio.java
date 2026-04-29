package org.com.banking.model;

public class Portfolio {

    private String portfolioId;
    private String businessDate;

    public Portfolio() {}

    public Portfolio(String portfolioId, String businessDate)
    {
        this.portfolioId = portfolioId;
        this.businessDate = businessDate;
    }

    public String getPortfolioId()
    {
        return portfolioId;
    }
    public void setPortfolioID(String portfolioId)
    {
        this.portfolioId = portfolioId;
    }
    public String getBusinessDate()
    {
        return businessDate;
    }
    public void setBusinessDate()
    {
        this.businessDate = businessDate;
    }
}
