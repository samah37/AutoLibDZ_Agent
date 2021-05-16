package com.example.agent_app.Services

import com.example.agent_app.Models.Auth_utilisateur
import retrofit2.Response
import retrofit2.http.*


interface AuthApiService {
    @GET("user/{email}")
   fun getUserByEmail(@Path("email") email : String): Response<Auth_utilisateur>
}