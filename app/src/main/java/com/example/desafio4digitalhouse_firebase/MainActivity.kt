package com.example.desafio4digitalhouse_firebase

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.example.desafio4digitalhouse_firebase.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val firebaseAuth by lazy {
        Firebase.auth
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val user = firebaseAuth.currentUser

        var emailSaved = getSharedPreferences("SharedPref", Context.MODE_PRIVATE).getString("emailUser", "")
        var passSaved = getSharedPreferences("SharedPref", Context.MODE_PRIVATE).getString("passUser", "")
        var checkSaved = getSharedPreferences("SharedPref", Context.MODE_PRIVATE).getBoolean("check", false)
        Log.d("TesteSharedPref", "Email: ${emailSaved} password: ${passSaved} checkStatus: ${checkSaved}")



        var emailAsEditable = Editable.Factory.getInstance().newEditable(emailSaved)
        var passAsEditable = Editable.Factory.getInstance().newEditable(passSaved)
        var emptyAsEditable = Editable.Factory.getInstance().newEditable("")

        val sharedPreferences: SharedPreferences =
            binding.root.context.getSharedPreferences(
                "SharedPref",
                Context.MODE_PRIVATE
            )
        val editor = sharedPreferences.edit()




        editor.putBoolean("check", true)



       binding.cbLogin.setOnCheckedChangeListener { buttonView, isChecked ->
           editor.putBoolean("check", true)
           editor.commit()
           if(binding.cbLogin.isChecked)
           binding.tilEmail.editText?.text = emailAsEditable
           binding.tilPassword.editText?.text = passAsEditable

       }


        binding.btCreate.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btLogin.setOnClickListener {
            firebaseAuth.signInWithEmailAndPassword(
                binding.tilEmail.editText?.text.toString(),
                binding.tilPassword.editText?.text.toString()
            )
                .addOnSuccessListener {
                    val sharedPreferences: SharedPreferences =
                        binding.root.context.getSharedPreferences(
                            "SharedPref",
                            Context.MODE_PRIVATE
                        )
                    val editor = sharedPreferences.edit()
                    editor.putString("emailUser", binding.tilEmail.editText?.text.toString())
                    editor.putString("passUser", binding.tilPassword.editText?.text.toString())
                    editor.commit()


                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("User", user)
                    startActivity(intent)
                }.addOnFailureListener {
                    Toast.makeText(this@MainActivity, it.localizedMessage, Toast.LENGTH_SHORT)
                        .show()
                }


        }





    }
}