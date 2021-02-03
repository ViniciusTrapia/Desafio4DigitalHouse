package com.example.desafio4digitalhouse_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.desafio4digitalhouse_firebase.databinding.ActivityRegisterBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    private val firebaseAuth by lazy {
        Firebase.auth
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signUp()

        supportActionBar?.hide()


    }

    private fun signUp() {
        binding.btCreateAccount.setOnClickListener {
            firebaseAuth.createUserWithEmailAndPassword(
                binding.tilEmail.editText?.text.toString(),
                binding.tilPassword.editText?.text.toString()
            )
                .addOnSuccessListener {
                    binding.tilName.editText?.setText(it.user?.displayName)
                }
                .addOnFailureListener {
                    Toast.makeText(this@RegisterActivity, it.localizedMessage, Toast.LENGTH_SHORT)
                        .show()
                }

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}