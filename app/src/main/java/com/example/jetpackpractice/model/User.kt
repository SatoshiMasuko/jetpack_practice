package com.example.jetpackpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity

data class User(
//    @ColumnInfo(name = "user_description")
//    @SerializedName("description")
    val description: String?,
//    @ColumnInfo(name = "user_facebookId")
//    @SerializedName("facebook_id")
    val facebookId: String?,
//    @ColumnInfo(name = "user_followeesCount")
//    @SerializedName("followees_count")
    val followeesCount: Int,
//    @ColumnInfo(name = "user_followersCount")
//    @SerializedName("followers_count")
    val followersCount: Int,
//    @ColumnInfo(name = "user_githubLoginName")
//    @SerializedName("github_login_name")
    val github_login_name: String?,
//    @ColumnInfo(name = "user_id")
//    @SerializedName("id")
    val id: String,
//    @ColumnInfo(name = "user_items_count")
//    @SerializedName("items_count")
    val items_count: Int,
//    @ColumnInfo(name = "user_linkedin_id")
//    @SerializedName("linledin_id")
    val linkedin_id: String?,
//    @ColumnInfo(name = "user_location")
//    @SerializedName("location")
    val location: String?,
//    @ColumnInfo(name = "user_name")
//    @SerializedName("name")
    val name: String?,
//    @ColumnInfo(name = "user_organization")
//    @SerializedName("organization")
    val organization: String?,
//    @ColumnInfo(name = "user_permanent_id")
//    @SerializedName("permanent_id")
    val permanent_id: Int?,
//    @ColumnInfo(name = "user_profile_image_url")
//    @SerializedName("profile_image_url")
    val profile_image_url: String?,
//    @ColumnInfo(name = "user_twitter_screen_name")
//    @SerializedName("twitter_screen_name")
    val twitter_screen_name: String?,
//    @ColumnInfo(name = "user_website_url")
//    @SerializedName("website_url")
    val website_url: String?
)