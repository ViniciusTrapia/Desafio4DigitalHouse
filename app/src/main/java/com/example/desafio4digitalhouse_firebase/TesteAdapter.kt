package com.example.desafio4digitalhouse_firebase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.desafio4digitalhouse_firebase.TesteAdapter.TesteAdapterVH
import com.example.desafio4digitalhouse_firebase.databinding.HomeCardItemBinding

class TesteAdapter(
    private var gameList: MutableList<GamesFirestore> = mutableListOf(),
    private val onItemClicked: (GamesFirestore?) -> Unit
) : RecyclerView.Adapter<TesteAdapterVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TesteAdapterVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = HomeCardItemBinding.inflate(layoutInflater, parent, false)
        return TesteAdapterVH(binding)
    }

    override fun onBindViewHolder(holder: TesteAdapterVH, position: Int) {
        holder.bind(gameList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }


    class TesteAdapterVH(
        private val binding: HomeCardItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(game: GamesFirestore, onItemClicked: (GamesFirestore) -> Unit) = with(binding) {
            binding.tvCardItemName.text = game?.name
            binding.year.text = game?.created
            Glide.with(itemView.context).load(game?.image).into(binding.ivCardItem)



            itemView.setOnClickListener {
                onItemClicked(game)
            }
        }

    }
}