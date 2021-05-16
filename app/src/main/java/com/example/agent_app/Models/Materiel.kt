package com.example.agent_app.Models

data class Materiel(
    val idMateriel: Int? = null,
    val nomMateriel: String? = null,
    val quantite: Int? = null,
    val prixUnitaire: Float? = null,
    val description: String? = null,
    val idTache: Int? = null,
    val parentIdMateriel: Int ? = null
)