package com.example.formation_ddd_zenika.infrastructure.adapters;

import com.example.formation_ddd_zenika.domains.models.Avis;
import com.example.formation_ddd_zenika.domains.models.StatutAvis;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-23T18:02:46+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.11 (Debian)"
)
@Component
public class AvisMapperImpl implements AvisMapper {

    @Override
    public AvisEntity AvisToAvisEntity(Avis avis) {
        if ( avis == null ) {
            return null;
        }

        Integer id = null;
        String texte = null;
        double note = 0.0d;
        String utilisateur = null;
        String dateCreation = null;
        Boolean captcha = null;
        Boolean caché = null;
        StatutAvis statutAvis = null;
        boolean tag = false;

        AvisEntity avisEntity = new AvisEntity( id, texte, note, utilisateur, dateCreation, captcha, caché, statutAvis, tag );

        return avisEntity;
    }
}
