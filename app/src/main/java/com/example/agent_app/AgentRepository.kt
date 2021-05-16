package com.example.agent_app

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.agent_app.Clients.AuthApiClient
import com.example.agent_app.Models.Auth_utilisateur
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AgentRepository {
    val thisUser = MutableLiveData<Auth_utilisateur>()
   fun getAgent(email:String){
          try {
                val response = AuthApiClient.authApiService.getUserByEmail(email)

                if (response.isSuccessful && response.body() != null) {
                    thisUser.value = response.body()

                }

          } catch (e: Exception) {

          }

    }
}