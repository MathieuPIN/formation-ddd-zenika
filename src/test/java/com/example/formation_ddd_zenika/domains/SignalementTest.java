package com.example.formation_ddd_zenika.domains;

import com.example.formation_ddd_zenika.domains.models.RaisonSignalement;
import com.example.formation_ddd_zenika.domains.models.Signalement;
import com.example.formation_ddd_zenika.domains.models.StatutSignalement;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.assertj.core.api.Assertions.assertThat;

public class SignalementTest {

    @Test
    void doitCreerUnSignalementValide() {
        Integer avisId = 1;
        RaisonSignalement raison = RaisonSignalement.SPAM;

        Signalement signalement = Signalement.creerNouveau(avisId, raison);

        assertThat(signalement).isNotNull();
        assertThat(signalement.getAvisId()).isEqualTo(avisId);
        assertThat(signalement.getRaisonSignalement()).isEqualTo(raison);
        assertThat(signalement.getStatutSignalement()).isEqualTo(StatutSignalement.EN_ATTENTE);
        assertThat(signalement.getDateCreation()).isBeforeOrEqualTo(LocalDateTime.now());
    }

    @Test
    void doitPasserLeStatutATraiteApresTraitement() {
        Signalement signalement = Signalement.creerNouveau(1, RaisonSignalement.SPAM);

        signalement.traiterSignalement();

        assertThat(signalement.getStatutSignalement()).isEqualTo(StatutSignalement.TRAITE);
    }

}