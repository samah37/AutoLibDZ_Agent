package com.example.agent_app.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.agent_app.AgentRepository
import com.example.agent_app.Models.Auth_utilisateur

class AgentViewModel(private val agentRepository: AgentRepository) : ViewModel(){
    val thisAgent : MutableLiveData<Auth_utilisateur> = agentRepository.thisUser
    fun getAgent(email:String){
        agentRepository.getAgent(email)
    }


}