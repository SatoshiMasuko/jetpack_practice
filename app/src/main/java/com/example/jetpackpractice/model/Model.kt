package com.example.jetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Issues(
    @ColumnInfo(name = "issue_id")
    @SerializedName("id")
    val issueId:String?,
    @ColumnInfo(name = "issue_title")
    @SerializedName("title")
    val issueTitle:String?,
    @ColumnInfo(name = "issue_body")
    @SerializedName("body")
    val issueBody:String?,
    @ColumnInfo(name = "issue_url")
    @SerializedName("url")
    val issueUrl:String?,
    @ColumnInfo(name = "issue_comments_count")
    @SerializedName("comments_count")
    val issueCommentsCount:Int?,
    @ColumnInfo(name = "issue_likes_count")
    @SerializedName("likes_count")
    val issueLikeCount:Int?,
    @ColumnInfo(name = "issue_created_at")
    @SerializedName("created_at")
    val issueCreatedAt:Int?,
    @ColumnInfo(name = "issue_user")
    @SerializedName("user")
    val issueUser:User?,


//    val id: String?,
//    val title: String?,
//    val body: String?,
//    val url: String?,
//    val comments_count: Int?,
//    val likes_count: Int?,
//    val created_at: String?,
//    val user: User?,

){
    @PrimaryKey(autoGenerate = true)
    var uuid: Int = 0
}