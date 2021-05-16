package com.example.agent_app

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class loginAgent : AppCompatActivity() {
    val MIN_PASSWD_LENGTH: Int=3


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_agent)
        var button = findViewById<Button>(R.id.login_button)
        var Email = findViewById<EditText>(R.id.email)
        var Password = findViewById<EditText>(R.id.password)

        button.setOnClickListener{
           Validation(Email.text.toString(), Password.text.toString())

        }
    }
    fun Validation(Email: String, Mdp: String){
        if (Email== ""){
            Toast.makeText(this, "Entrer l'email", Toast.LENGTH_SHORT).show()
        }
        else {
            if(Mdp==""){
                Toast.makeText(this, "Entrer le mot de passe", Toast.LENGTH_SHORT).show()
            }
            else{
                if(Mdp.length< MIN_PASSWD_LENGTH){
                    Toast.makeText(this, "Mot de passe incorrect", Toast.LENGTH_SHORT).show()
                }
                else{
                    if ((Email=="admin@gmail.com") && (Mdp == "admin")){
                        val settings = getSharedPreferences(
                            "mysettings",
                            Context.MODE_PRIVATE
                        )

                        val editor = settings.edit()
                        editor.putString("email", Email)
                        editor.commit()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this, "Mot de passe ou Email incorrect", Toast.LENGTH_SHORT).show()
                    }

                }

            }

        }

    }
}