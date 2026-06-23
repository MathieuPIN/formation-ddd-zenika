package com.example.formation_ddd_zenika.ports;


import com.example.formation_ddd_zenika.domains.models.Avis;
import com.example.formation_ddd_zenika.shared.annotations.Repository;

@Repository
public interface AvisRepository {

     void save (Avis avis);
}

