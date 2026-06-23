package com.example.formation_ddd_zenika.application;

import com.example.formation_ddd_zenika.domains.models.Avis;
import com.example.formation_ddd_zenika.domains.ports.AvisRepository;
import com.example.formation_ddd_zenika.application.shared.annotations.ApplicationService;

@ApplicationService
public class AvisService {

    AvisRepository avisRepository;

    public void soumettreAvis(Avis avis) {
       avisRepository.save(avis);
    }

    public void invaliderAvis(Avis avis) {

    }


}
