package com.example.formation_ddd_zenika.ports;

import com.example.formation_ddd_zenika.domains.models.Signalement;
import com.example.formation_ddd_zenika.shared.annotations.Repository;

@Repository
public interface SignalementRepository {
    Integer compterSignalements(Integer avisId);

    void save(Signalement signalement);
}
