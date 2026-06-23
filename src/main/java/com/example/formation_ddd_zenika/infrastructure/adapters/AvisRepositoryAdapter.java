package com.example.formation_ddd_zenika.infrastructure.adapters;

import com.example.formation_ddd_zenika.domains.models.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AvisRepositoryAdapter implements com.example.formation_ddd_zenika.domains.ports.AvisRepository {

    @Autowired
    private AvisRepository jpaRepository;

    @Autowired
    private AvisMapper mapper;

    @Override
    public void save(Avis avis) {
        AvisEntity entity = mapper.AvisToAvisEntity(avis);
        jpaRepository.save(entity);
    }
}
