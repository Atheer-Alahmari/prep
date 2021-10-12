package com.example.prep

import retrofit2.Call
import retrofit2.http.*
interface APIInterface {
    @GET("/celebrities/")
    fun getcelebrity(): Call<ArrayList<Celebrity>>


    @POST("/celebrities/")
    fun addcelebrity(@Body userData: Celebrity): Call<Celebrity>

    @PUT("/celebrities/{id}")
    fun updatecelebrityr(@Path("id") id:Int, @Body userData: Celebrity): Call<Celebrity>

    @DELETE ("/celebrities/{id}")
    fun deletecelebrity(@Path("id") id : Int ) :Call<Void>

}