package com.chrisvasqm.androidbasics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.chrisvasqm.androidbasics.adapter.BookAdapter
import com.chrisvasqm.androidbasics.model.BookData
import com.chrisvasqm.androidbasics.network.BookService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private val retrofit = Retrofit.Builder()
            .baseUrl("  https://www.googleapis.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView.emptyView = emptyState

        btnSearch.setOnClickListener {
            val query = editSearch.text.toString()
            searchFor(query)
        }
    }

    private fun searchFor(query: String) {
        val service = retrofit.create(BookService::class.java)
        val call = service.getBookByQuery(query)

        call.enqueue(object : Callback<BookData> {
            override fun onResponse(call: Call<BookData>?, response: Response<BookData>?) {
                val volumes = response?.body()?.items
                val books = volumes?.map { it.volumeInfo }
                val adapter = books?.let { BookAdapter(applicationContext, it) }
                listView.adapter = adapter
            }

            override fun onFailure(call: Call<BookData>?, t: Throwable?) {
                Toast.makeText(
                        applicationContext,
                        "Error: Could not perform the search",
                        Toast.LENGTH_SHORT).show()
            }
        })
    }
}
