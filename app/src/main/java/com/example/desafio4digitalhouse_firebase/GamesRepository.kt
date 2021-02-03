package com.example.desafio4digitalhouse_firebase

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.desafio4digitalhouse_firebase.databinding.ActivityEditGameBinding
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase


class GamesRepository {


    private val firebaseAuth by lazy {
        Firebase.auth
    }

    private val firebaseFirestore by lazy {
        Firebase.firestore
    }

    var listGames = mutableListOf<GamesFirestore?>()

    private lateinit var binding: ActivityEditGameBinding

    fun getUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }


    fun getGames(): Task<QuerySnapshot>? {
        return firebaseAuth.currentUser?.let {
            val docRef = firebaseFirestore.collection("games")
            docRef.get().addOnSuccessListener {
                it.documents.forEach {
                    val game = it.toObject<GamesFirestore>()
                    listGames.add(game)
                    return@addOnSuccessListener
                }
                // binding.tvTeste.text = listGames.size.toString()
            }.addOnFailureListener {
                it.localizedMessage
            }
        }
    }


}







