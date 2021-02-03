package com.example.desafio4digitalhouse_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.desafio4digitalhouse_firebase.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val gamesRepo: GamesRepository = GamesRepository()
    private var clicked: GamesFirestore? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        clicked = intent.getParcelableExtra("game")

        Glide.with(binding.root).load(clicked?.image).into(binding.ivDetails)
        binding.tvDetailsName.text = clicked?.name
        binding.tvNameImageDetails.text = clicked?.name
        binding.tvDetailsDate.text = clicked?.created
        binding.tvDetailsDescription.text = clicked?.description


        binding.backBt.setOnClickListener {
            onBackPressed()
        }

        binding.fabEdit.setOnClickListener {
            val intent = Intent(this, EditGameActivity::class.java)
            intent.putExtra("editGame", clicked)
            startActivity(intent)
        }


    }

}