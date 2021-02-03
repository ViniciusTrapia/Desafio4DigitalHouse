package com.example.desafio4digitalhouse_firebase

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.desafio4digitalhouse_firebase.databinding.ActivityEditGameBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class EditGameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditGameBinding

    private var edited: GamesFirestore? = null


    private val firebaseFirestore by lazy {
        Firebase.firestore
    }

    private val firebaseAuth by lazy {
        Firebase.auth
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        edited = intent.getParcelableExtra("editGame")


        var asEditableName = Editable.Factory.getInstance().newEditable(edited?.name)
        var asEditableCreated = Editable.Factory.getInstance().newEditable(edited?.created)
        var asEditableDescription = Editable.Factory.getInstance().newEditable(edited?.description)


        binding.tilEditNameGame.editText?.text = asEditableName
        binding.tilEditCreatedAt.editText?.text = asEditableCreated
        binding.tilEditDescription.editText?.text = asEditableDescription



        Glide.with(binding.root).load(edited?.image).into(binding.civGameEditPhoto)



        setupObservablesEdit(this)


    }

    fun setupObservablesEdit(
        context: Context
    ) {
        var id = edited?.gameID

        val intent = Intent(context, HomeActivity::class.java)
        binding.btEditGame.setOnClickListener {
            val gameDoc = firebaseFirestore.collection("games").document(edited?.gameID!!)
            val extras: Bundle? = intent.extras
            extras?.putString("done", "game")

            val game = hashMapOf(
                "name" to binding.tilEditNameGame.editText?.text.toString(),
                "created" to binding.tilEditCreatedAt.editText?.text.toString(),
                "description" to binding.tilEditDescription.editText?.text.toString(),
                "userId" to firebaseAuth.currentUser?.uid,
                "image" to edited?.image,
                "gameID" to id


            )

            gameDoc.set(game)
                .addOnSuccessListener {
                    ContextCompat.startActivity(context, intent, extras)
                    Toast.makeText(context, "Salvo com sucesso", Toast.LENGTH_SHORT).show()
                }.addOnFailureListener {
                    Toast.makeText(context, it.localizedMessage, Toast.LENGTH_SHORT).show()
                }
        }
    }
}