package com.smartstocks.smartstockscoreapi.domains.benchmark;

public enum BenchmarkName {
    CDI(1, "CDI"),
    SELIC(2, "Selic"),
    IPCA(3, "IPCA"),
    IBOVESPA(4, "Ibovespa"),
    IFIX(5, "IFIX"),
    SUNO30(6, "Suno 30"),
    IPAX(7, "IPAX"),
    SP500(8, "S&P500"),
    NASDAQ(9, "Nasdaq"),
    DOWJONES(10, "Dow Jones"),
    FTSE_NAREIT(11, "FTSE Nareit");

    private final int id;
    private final String name;

    BenchmarkName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}