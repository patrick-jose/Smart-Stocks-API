package com.smartstocks.smartstockscoreapi.domains.userterm;

public enum UserTermName {
    CURTO(1, "Curto"),
    CURTO_MEDIO(2, "Curto-Médio"),
    MEDIO(3, "Médio"),
    MEDIO_LONGO(4, "Médio-Longo"),
    LONGO(5, "Longo");

    private final int id;
    private final String name;

    UserTermName(int id, String name) {
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