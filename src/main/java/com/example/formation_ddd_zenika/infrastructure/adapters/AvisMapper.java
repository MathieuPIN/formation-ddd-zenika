package com.example.formation_ddd_zenika.infrastructure.adapters;

import com.example.formation_ddd_zenika.domains.models.Avis;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AvisMapper {
    
    AvisEntity AvisToAvisEntity(Avis avis);
}
