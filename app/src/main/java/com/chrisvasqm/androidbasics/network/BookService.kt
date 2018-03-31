package com.chrisvasqm.androidbasics.network

import com.chrisvasqm.androidbasics.model.BookData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("/books/v1/volumes")
    fun getBookByQuery(@Query("q") query: String, @Query("maxResult") maxResult: Int = 20): Call<BookData>

}
