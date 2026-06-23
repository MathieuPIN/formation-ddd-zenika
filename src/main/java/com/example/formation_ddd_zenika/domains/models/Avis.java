package com.example.formation_ddd_zenika.domains.models;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Avis {

    private Integer id;

    @NonNull
    private String utilisateur;

    private double note;

    @NonNull
    private String texte;

    private LocalDateTime dateCreation;

    @NonNull
    private Boolean captcha;

    @NonNull
    private List<String> tags;

    private Avis() {}

    public static Avis build(@NotNull String utilisateur, double note, @NotNull String texte, @NotNull Boolean captcha) {
        Avis avis = new Avis();
        avis.setUtilisateur(utilisateur);
        avis.setNote(note);
        avis.setTexte(texte);
        avis.setCaptcha(captcha);
        avis.setDateCreation(LocalDateTime.of(2026, 6, 23, 10, 57));
        avis.setTags(new ArrayList<>());

        return avis;
    }

    public void publier() {
        if(!captcha) {
            tags.add("robot");
        }
        dateCreation = LocalDateTime.of(2026, 6, 23, 10, 57);
        id = 1;
    }

}
