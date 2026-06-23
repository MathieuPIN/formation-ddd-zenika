package com.example.formation_ddd_zenika.domains.models;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static java.util.Objects.requireNonNull;

@NoArgsConstructor
@Getter
@Setter
public class Signalement {

    @NotNull
    private RaisonSignalement raisonSignalement;

    @NotNull
    private Integer avisId;

    @NotNull
    private LocalDateTime dateCreation;

    @NotNull
    private StatutSignalement statutSignalement;

    public static Signalement creerNouveau(Integer avisId, RaisonSignalement raison) {
        requireNonNull(avisId, "Un signalement doit obligatoirement être lié à un avis.");

        requireNonNull(raison, "La raison du signalement est obligatoire.");

        Signalement signalement = new Signalement();
        signalement.avisId = avisId;
        signalement.raisonSignalement = raison;
        signalement.statutSignalement = StatutSignalement.EN_ATTENTE;
        signalement.dateCreation = LocalDateTime.now();

        return signalement;
    }

    public void traiterSignalement() {
        if (this.statutSignalement == StatutSignalement.TRAITE) {
            throw new IllegalStateException("Impossible d'approuver un signalement déjà traité.");
        }
        this.statutSignalement = StatutSignalement.TRAITE;
    }

}
