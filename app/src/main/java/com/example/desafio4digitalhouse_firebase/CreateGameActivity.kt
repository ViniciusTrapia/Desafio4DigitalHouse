package com.example.desafio4digitalhouse_firebase

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import com.example.desafio4digitalhouse_firebase.databinding.ActivityCreateGameBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import java.io.File

class CreateGameActivity : AppCompatActivity() {

    private val pickImage = 100
    private var imageUri: Uri? = null

    private lateinit var binding: ActivityCreateGameBinding

    private val firebaseFirestore by lazy {
        Firebase.firestore
    }

    private val firebaseAuth by lazy {
        Firebase.auth
    }

    private val storageRef by lazy {
        Firebase.storage.reference
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupObservables()
        loadPhoto()
    }


    private fun setupObservables() {
        val intent = Intent(this, HomeActivity::class.java)
        binding.btSaveGame.setOnClickListener {
         val gameDoc =   firebaseFirestore.collection("games").document()

            val filePath = storageRef.child("${gameDoc.id}.jpg")
            imageUri?.let { it1 ->
                filePath.putFile(it1).addOnSuccessListener {
                    filePath.downloadUrl.addOnSuccessListener { uri ->

                        val game = hashMapOf(
                                "name" to binding.tilNameGame.editText?.text.toString(),
                                "created" to binding.tilCreatedAt.editText?.text.toString(),
                                "description" to binding.tilDescription.editText?.text.toString(),
                                "userId" to firebaseAuth.currentUser?.uid,
                                "image" to uri.toString(),
                                "gameID" to gameDoc.id

                        )
                        gameDoc.set(game, SetOptions.merge())
                                .addOnSuccessListener {
                                    startActivity(intent)
                                    Toast.makeText(this, "Salvo com sucesso", Toast.LENGTH_SHORT).show()
                                }.addOnFailureListener {
                                    Toast.makeText(this, it.localizedMessage, Toast.LENGTH_SHORT).show()
                                }
                    }.addOnFailureListener {
                        Toast.makeText(this, it.localizedMessage, Toast.LENGTH_SHORT).show()
                    }
                } .addOnFailureListener {
                    Toast.makeText(this, it.localizedMessage, Toast.LENGTH_SHORT).show()
                }
            }


        }
    }


    private fun loadPhoto() {
        binding.civGamePhoto.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            binding.civGamePhoto.setImageURI(imageUri)
        }


    }


}