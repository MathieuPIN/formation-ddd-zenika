package com.example.formation_ddd_zenika.domains.ports;

import com.example.formation_ddd_zenika.domains.models.Signalement;
import com.example.formation_ddd_zenika.application.shared.annotations.Repository;

@Repository
public interface SignalementRepository {
    Integer compterSignalements(Integer avisId);

    void save(Signalement signalement);
}
