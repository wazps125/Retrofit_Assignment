package com.example.myapplication.api


import com.example.myapplication.model.Photo
import com.example.myapplication.model.User
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitConfiguration {
    @GET("users")
    fun getUsers(): Call<List<User>>
    @GET("photos")
    fun getPhotos(): Call<List<Photo>>

    @GET("user/{userId}")
    fun getUser(@Path("userId") id: String): Call<User>

    companion object{
        val API_URL = "https://jsonplaceholder.typicode.com"
        fun create() : RetrofitConfiguration{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(API_URL)
                .build()
            return retrofit.create(RetrofitConfiguration::class.java)

        }

    }
}