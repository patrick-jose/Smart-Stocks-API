package com.smartstocks.smartstockscoreapi.domains.riskprofile;

public enum RiskProfileName {
    CONSERVADOR(1, "Conservador"),
    AGRESSIVO(2, "Agressivo"),
    MODERADO(3, "Moderado");

    private final int id;
    private final String name;

    RiskProfileName(int id, String name) {
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