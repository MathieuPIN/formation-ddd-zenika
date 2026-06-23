package com.example.formation_ddd_zenika.domains.models;

public enum StatutAvis {

    INVALID ("Invalide"),

    VALID ("Valide");

    private final String label;

    StatutAvis(String label) {
        this.label = label;
    }
}
