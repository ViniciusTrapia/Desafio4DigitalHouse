package com.example.desafio4digitalhouse_firebase

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio4digitalhouse_firebase.databinding.ActivityHomeBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class HomeActivity : AppCompatActivity() {


    private lateinit var binding: ActivityHomeBinding
    var userGames = mutableListOf<GamesFirestore>()

    private val gamesRepo: GamesRepository = GamesRepository()

    private val recyclerView: RecyclerView by lazy {
        binding.rvHome
    }

    private val firebaseAuth by lazy {
        Firebase.auth
    }

    private val firebaseFirestore by lazy {
        Firebase.firestore
    }


    var listGames = mutableListOf<GamesFirestore>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        var games = mutableListOf<GamesFirestore>()

        // binding.tvTeste.text = firebaseAuth.currentUser?.email

        binding.btCreateGame.setOnClickListener {
            intent = Intent(this, CreateGameActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.animation_slide_in_up, R.anim.slide_out_up)
        }

        var query = mutableListOf<GamesFirestore>()

        binding.svHome.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
            //    do something on text submit
                        return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
           //     do something when text changes
                query.clear()
                listGames.forEach {
                    if (newText != null && it.name?.contains(newText) == true) {
                        query.add(it)
                    }
                }
                populateRecycler(query)

                return false
            }
        })

    }


    override fun onResume() {
        super.onResume()



        gamesRepo.getGames()?.addOnCompleteListener {
            if (it.isSuccessful) {
                listGames = it.result?.toObjects(GamesFirestore::class.java) ?: mutableListOf()
                listGames.forEach {
                    if (it?.userId == firebaseAuth.currentUser?.uid) {
                        if (!userGames.contains(it)) {
                            userGames.add(it)
                        }
                    }

                }

                populateRecycler(userGames)

            } else {

            }
        }

    }


    fun populateRecycler(
        query: MutableList<GamesFirestore>
    ) {
        recyclerView.apply {
            layoutManager = GridLayoutManager(this@HomeActivity, 2)
            adapter = TesteAdapter(query) { game ->
                val intent = Intent(this@HomeActivity, DetailActivity::class.java)
                intent.putExtra("game", game)
                startActivity(intent)
            }

        }
    }
}