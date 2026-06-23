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
    private boolean captcha;

    @NotNull
    private boolean tag;

    @NotNull
    private boolean caché;

    private Avis() {}

    public static Avis build(@NotNull String utilisateur, double note, @NotNull String texte, boolean captcha) {
        Avis avis = new Avis();

        avis.utilisateur = utilisateur;
        avis.note = note;
        avis.texte = texte;
        avis.captcha = captcha;
        avis.dateCreation = LocalDateTime.now();
        avis.tag = false;
        avis.caché = false;
        avis.statutAvis = StatutAvis.VALID;

        return avis;
    }

    public void cacherAvis() {
        this.caché = true;
    }
}
