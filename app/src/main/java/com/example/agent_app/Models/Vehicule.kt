package com.example.agent_app.Models

data class Vehicule (
    val idVehicule : Int ? = null,
    val matricule: Int ? = null,
    val categorieVehicule: String? = null,
    val marqueVehicule : String ? = null,
    val modeleVehicule: String ? = null,
    val typeCarburant: String ? = null,
    val prixUnitaireHeure: Float ? = null,
    val prixUnitaireJour:   Float ? = null,
    val idBorne: Int ? = null,
    val couleurVehicule: Float? = null,
    val longitude: Float? = null,
    val lattitude: Float? = null
)