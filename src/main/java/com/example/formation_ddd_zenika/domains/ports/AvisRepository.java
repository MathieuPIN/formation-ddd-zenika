package com.example.formation_ddd_zenika.domains.ports;


import com.example.formation_ddd_zenika.domains.models.Avis;
import com.example.formation_ddd_zenika.application.shared.annotations.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AvisRepository {

     void save (Avis avis);
}

