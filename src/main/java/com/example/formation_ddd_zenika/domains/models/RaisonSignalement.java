package com.example.formation_ddd_zenika.domains.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RaisonSignalement {
    HORS_SUJET(
            "Hors sujet",
            "L'avis ne concerne pas une visite dans cet établissement ni l'utilisation de ses services."
    ),
    SPAM(
            "Spam",
            "L'avis a été publié par un robot ou un compte fictif, ou comporte des annonces et des promotions."
    ),
    CONFLIT_INTERETS(
            "Conflit d'intérêts",
            "L'avis a été rédigé par une personne affiliée à l'établissement ou à un concurrent."
    ),
    GROSSIERETES(
            "Grossièretés",
            "L'avis contient des insultes ou du langage pornographique ou à caractère sexuel explicite."
    ),
    DANGEREUX(
            "Dangereux",
            "L'avis contient des contenus qui encouragent ou promeuvent l'automutilation, l'usage abusif de substances/objets dangereux, ou des actes de violence."
    ),
    INTIMIDATION_HARCELEMENT(
            "Intimidation ou harcèlement",
            "L'avis attaque personnellement un individu particulier."
    ),
    DISCRIMINATION_HAINE(
            "Discrimination ou incitation à la haine",
            "L'avis contient du langage portant atteinte à une personne ou à un groupe d'individus en raison de leur identité."
    ),
    INFORMATIONS_PERSONNELLES(
            "Informations personnelles",
            "L'avis contient des informations personnelles telles qu'une adresse ou un numéro de téléphone."
    ),
    PAS_UTILE(
            "Pas utile",
            "L'avis n'aide pas les utilisateurs à savoir si ce lieu les intéressera."
    );

    private final String label;
    private final String description;


}
