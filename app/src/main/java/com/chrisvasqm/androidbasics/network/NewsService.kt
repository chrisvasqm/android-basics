package com.chrisvasqm.androidbasics.network

import com.chrisvasqm.androidbasics.model.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("search")
    fun getAll(@Query("q") query: String = "debates", @Query("api-key") key: String = "test"): Call<Data>

}