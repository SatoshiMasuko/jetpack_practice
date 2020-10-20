package com.example.jetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Issues(
//    @ColumnInfo(name = "article_id")
//    @SerializedName("id")
    val id: String?,
//    @ColumnInfo(name = "article_title")
//    @SerializedName("title")
    val title: String?,
//    @ColumnInfo(name = "article_body")
//    @SerializedName("body")
    val body: String?,
//    @ColumnInfo(name = "article_url")
//    @SerializedName("url")
    val url: String?,
//    @ColumnInfo(name = "article_comments_count")
//    @SerializedName("comments_count")
    val comments_count: Int?,
//    @ColumnInfo(name = "article_likes_count")
//    @SerializedName("likes_count")
    val likes_count: Int?,
//    @ColumnInfo(name = "article_created_at")
//    @SerializedName("created_at")
    val created_at: String?,
//    @ColumnInfo(name = "article_user")
//    @SerializedName("user")
    val user: User?,
){
//    @PrimaryKey(autoGenerate = true)
//    var uuid: Int = 0
}