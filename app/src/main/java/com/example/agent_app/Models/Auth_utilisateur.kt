package com.example.agent_app.Models

data class Auth_utilisateur (
    val idUtilisateur: Int,
    val type: String,
    val adresseEmail: String,
    val motDePasse: String
)