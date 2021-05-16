package com.example.agent_app.Models

import java.util.*

data class Panne (
     val idPanne : Int? = null,
     val dateNotification: Date? = null,
     val dateReparationPanne: Date? = null,
     val etat: String? = null,
     val Description : String? = null,
     val numChassis: Int? = null,
     val idAgentEnvoyeNotif: Int? = null,
     val idAgentTraitePanne: Int? = null,
     val niveauSecurity: String? = null
 )