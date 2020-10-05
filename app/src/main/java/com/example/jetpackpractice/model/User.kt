package com.example.jetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity

data class User(

    @ColumnInfo(name = "user_description")
    @SerializedName("description")
    val description: String?,

    @ColumnInfo(name = "user_facebook_id")
    @SerializedName("facebook_id")
    val facebookId: String?,

    @ColumnInfo(name = "user_followees_count")
    @SerializedName("followees_count")
    val followeesCount: Int,

    @ColumnInfo(name = "user_followers_count")
    @SerializedName("followers_count")
    val followersCount: Int,

    @ColumnInfo(name = "user_github_login_name")
    @SerializedName("github_login_name")
    val github_login_name: String?,

    @ColumnInfo(name = "user_id")
    @SerializedName("id")
    val id: String,

    @ColumnInfo(name = "user_id")
    @SerializedName("id")
    val items_count: Int,

    @ColumnInfo(name = "user_id")
    @SerializedName("id")
    val linkedin_id: String?,

    @ColumnInfo(name = "user_id")
    @SerializedName("id")
    val location: String?,

    @ColumnInfo(name = "user_id")
    @SerializedName("id")
    val name: String?,

    @ColumnInfo(name = "issue_id")
    @SerializedName("id")
    val organization: String?,

    @ColumnInfo(name = "issue_permanent_id")
    @SerializedName("permanent_id")
    val permanent_id: Int?,

    @ColumnInfo(name = "issue_profile_image_url")
    @SerializedName("profile_image_url")
    val profile_image_url: String?,

    @ColumnInfo(name = "issue_twitter_screen_name")
    @SerializedName("twitter_screen_name")
    val twitter_screen_name: String?,

    @ColumnInfo(name = "issue_website_url")
    @SerializedName("website_url")
    val website_url: String?
)