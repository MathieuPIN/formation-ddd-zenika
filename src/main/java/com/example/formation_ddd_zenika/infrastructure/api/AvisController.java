package com.example.formation_ddd_zenika.infrastructure.api;

import com.example.formation_ddd_zenika.application.AvisService;
import com.example.formation_ddd_zenika.domains.models.Avis;
import com.example.formation_ddd_zenika.infrastructure.command.AvisCommand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvisController {

    private AvisService avisService;

    public AvisController(AvisService avisService) {
        this.avisService = avisService;
    }

    @PostMapping("/avis")
    public void soumettreAvis(@RequestBody AvisCommand avisCommand) {
        Avis avis = Avis.build(avisCommand.utilisateur(), avisCommand.note(), avisCommand.texte(), avisCommand.captcha());
        avisService.soumettreAvis(avis);
    }
}
