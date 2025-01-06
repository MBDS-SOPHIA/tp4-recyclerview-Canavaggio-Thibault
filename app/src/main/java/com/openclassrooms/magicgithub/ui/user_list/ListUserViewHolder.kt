package com.openclassrooms.magicgithub.ui.user_list

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.model.User


class ListUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var avatar: ImageView = itemView.findViewById(R.id.item_list_user_avatar)
    private val username: TextView = itemView.findViewById(R.id.item_list_user_username)
    private val deleteButton: ImageButton = itemView.findViewById(R.id.item_list_user_delete_button)

    fun bind(user: User, callback: UserListAdapter.Listener) {
        updateBackground(user.isActive)

        Glide.with(itemView.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(avatar)
        username.text = user.login
        deleteButton.setOnClickListener { callback.onClickDelete(user) }
    }

    private fun updateBackground(isActive: Boolean) {
        itemView.post {
            itemView.setBackgroundColor(
                if (isActive) {
                    ContextCompat.getColor(itemView.context, android.R.color.white)
                } else {
                    ContextCompat.getColor(itemView.context, android.R.color.holo_red_light)
                }
            )
        }
    }
}