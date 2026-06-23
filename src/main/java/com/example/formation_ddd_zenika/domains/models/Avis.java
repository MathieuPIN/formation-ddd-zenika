package com.example.formation_ddd_zenika.domains.models;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Avis {

    private Integer id;

    @NotNull
    private String utilisateur;

    @NotNull
    private StatutAvis statutAvis;

    private double note;

    @NotNull
    private String texte;

    private LocalDateTime dateCreation;

    @NotNull
    private Boolean captcha;

    @NotNull
    private List<String> tags;

    @NotNull
    private boolean caché;

    private Avis() {}

    public static Avis build(@NotNull String utilisateur, double note, @NotNull String texte, @NotNull Boolean captcha) {
        Avis avis = new Avis();

        avis.utilisateur = utilisateur;
        avis.note = note;
        avis.texte = texte;
        avis.captcha = captcha;
        avis.dateCreation = LocalDateTime.now();
        avis.tags = new ArrayList<>();
        avis.caché = false;
        avis.statutAvis = StatutAvis.VALID;

        return avis;
    }

    public void cacherAvis() {
        this.caché = true;
    }
}
