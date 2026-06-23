package com.example.formation_ddd_zenika.domains;

import com.example.formation_ddd_zenika.domains.models.Avis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AvisTest {

//    @Test
//    void testGivenAvisWhenCaptchaValideThenAvisPublié() {
//
//        // Given
//        Avis avis = Avis.build("Test", 5.0, "C'etait un super test", Boolean.TRUE);
//        // When
//        avis.publier();
//        // Then
//        Assertions.assertEquals(1, avis.getId());
//        Assertions.assertEquals(LocalDateTime.of(2026, 6, 23, 10, 57), avis.getDateCreation());
//    }
//
//    @Test
//    void testGivenAvisWhenCaptchaNonValideThenAvisPublieAvecTagRobot() {
//        // Given
//        Avis avis = Avis.build("Test", 5.0, "C'etait un super test", Boolean.FALSE);
//        // When
//        avis.publier();
//        // Then
//        Assertions.assertEquals(1, avis.getId());
//        Assertions.assertEquals(LocalDateTime.of(2026, 6, 23, 10, 57), avis.getDateCreation());
//        Assertions.assertEquals("robot", avis.getTags().getFirst());
//    }
}
