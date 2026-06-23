package com.example.formation_ddd_zenika.domains.models;

import lombok.Getter;

@Getter
public enum StatutSignalement {

    EN_ATTENTE("En attente"),

    TRAITE ("Traité");

    private final String label;

    StatutSignalement(String label) {
        this.label = label;
    }
}