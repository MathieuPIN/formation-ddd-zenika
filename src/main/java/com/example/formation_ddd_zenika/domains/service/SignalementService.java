package com.example.formation_ddd_zenika.domains.service;

import com.example.formation_ddd_zenika.domains.models.Avis;
import com.example.formation_ddd_zenika.domains.models.RaisonSignalement;
import com.example.formation_ddd_zenika.domains.models.Signalement;
import com.example.formation_ddd_zenika.ports.SignalementRepository;
import com.example.formation_ddd_zenika.shared.annotations.DomainService;

import static com.example.formation_ddd_zenika.domains.models.Signalement.creerNouveau;

@DomainService
public class SignalementService {
    private static final int SEUIL_SIGNALEMENTS = 10;
    private final SignalementRepository signalementRepository;

    public SignalementService(SignalementRepository signalementRepository) {
        this.signalementRepository = signalementRepository;
    }

    public void signalerAvis(Avis avis, RaisonSignalement raisonSignalement) {
        Signalement signalement = creerNouveau(avis.getId(), raisonSignalement);
        signalementRepository.save(signalement);
    }

    public void filtrerAvis(Avis avis) {
        if (signalementRepository.compterSignalements(avis.getId()) >= SEUIL_SIGNALEMENTS) {
            avis.cacherAvis();
        }
    }


}
