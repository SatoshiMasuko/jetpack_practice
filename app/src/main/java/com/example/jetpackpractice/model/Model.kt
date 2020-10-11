package com.example.jetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Issues(
    val id: String?,
    val title: String?,
    val body: String?,
    val url: String?,
    val comments_count: Int?,
    val likes_count: Int?,
    val created_at: String?,
    val user: User?,
)