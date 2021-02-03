package com.example.desafio4digitalhouse_firebase

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import kotlinx.parcelize.Parcelize


@Parcelize
data class GamesFirestore(
    val name: String? = null,
    val created: String? = null,
    val description: String? = null,
    val userId: String? = null,
    val image: String? = null,
    val gameID: String? = null

) : Parcelable {

    companion object {
        var DIFF_CALLBACK: DiffUtil.ItemCallback<GamesFirestore> =
            object : DiffUtil.ItemCallback<GamesFirestore>() {
                override fun areItemsTheSame(
                    oldItem: GamesFirestore,
                    newItem: GamesFirestore
                ): Boolean {
                    return oldItem.gameID == newItem.gameID
                }

                override fun areContentsTheSame(
                    oldItem: GamesFirestore,
                    newItem: GamesFirestore
                ): Boolean {
                    return oldItem.gameID == newItem.gameID
                }
            }
    }
}