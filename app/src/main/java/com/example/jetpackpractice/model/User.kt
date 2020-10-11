package com.example.jetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity

data class User(
    val description: String?,
    val facebookId: String?,
    val followeesCount: Int,
    val followersCount: Int,
    val github_login_name: String?,
    val id: String,
    val items_count: Int,
    val linkedin_id: String?,
    val location: String?,
    val name: String?,
    val organization: String?,
    val permanent_id: Int?,
    val profile_image_url: String?,
    val twitter_screen_name: String?,
    val website_url: String?
)