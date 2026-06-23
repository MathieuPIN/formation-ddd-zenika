package com.example.formation_ddd_zenika.infrastructure.adapters;

import com.example.formation_ddd_zenika.domains.models.StatutAvis;
import jakarta.persistence.*;

@Entity
@Table(name = "avis")
public record AvisEntity(
    @Id
    @Column(name = "id")
    Integer id,

    @Column(name = "texte", nullable = false)
    String texte,

    @Column(name = "note", nullable = false)
    double note,

    @Column(name = "utilisateur", nullable = false)
    String utilisateur,

    @Column(name = "date_creation", nullable = false)
    String dateCreation,

    @Column(name = "captcha", nullable = false)
    Boolean captcha,

    @Column(name = "cache", nullable = false)
    Boolean caché,

    @Column(name = "statut_avis", nullable = false)
    StatutAvis statutAvis,

    @Column(name = "tags", nullable = false)
    boolean tag
) {}
