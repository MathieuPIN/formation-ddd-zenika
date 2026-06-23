package com.example.formation_ddd_zenika.infrastructure.adapters;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends com.example.formation_ddd_zenika.domains.ports.AvisRepository, ListCrudRepository<AvisEntity, Integer> {

     AvisEntity save(AvisEntity avis);
}
