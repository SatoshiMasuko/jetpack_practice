package com.example.jetpackpractice.model

import com.example.jetpackpractice.Prefix
import io.reactivex.Single
import retrofit2.http.GET

interface Api {
    @GET(Prefix.API_URL)
    fun getApi(): Single<List<Issues>>
}