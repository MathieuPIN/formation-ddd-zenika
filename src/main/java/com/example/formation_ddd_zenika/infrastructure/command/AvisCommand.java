package com.example.formation_ddd_zenika.infrastructure.command;

import jakarta.validation.constraints.NotNull;

public record AvisCommand(@NotNull String utilisateur, double note, @NotNull String texte, boolean captcha) {
}
