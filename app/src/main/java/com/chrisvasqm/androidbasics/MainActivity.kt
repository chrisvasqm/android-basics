package com.chrisvasqm.androidbasics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.chrisvasqm.androidbasics.adapter.NewsAdapter
import com.chrisvasqm.androidbasics.model.Article
import com.chrisvasqm.androidbasics.model.Data
import com.chrisvasqm.androidbasics.network.NewsService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var call: Call<Data>
    private val retrofit = Retrofit.Builder()
            .baseUrl("http://content.guardianapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListView()

        listView.setOnItemClickListener { _, _, position, _ ->
            val item = listView.getItemAtPosition(position) as Article
            val webArticle = Intent(Intent.ACTION_VIEW, Uri.parse(item.url))
            startActivity(webArticle)
        }
    }

    private fun setupListView() {
        listView.emptyView = textEmptyList
        val service = retrofit.create(NewsService::class.java)
        call = service.getAll()
        call.enqueue(object : Callback<Data> {
            override fun onFailure(call: Call<Data>, t: Throwable) {
                Toast.makeText(applicationContext, "Error: Network issue.", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Data>?, response: Response<Data>) {
                if (response.isSuccessful) getData(response.body())
            }
        })
    }

    private fun getData(data: Data?) {
        val articles = data?.response?.articles
        val adapter = articles?.let { NewsAdapter(applicationContext, it) }
        listView.adapter = adapter
        progressBar.visibility = View.GONE
        textEmptyList.visibility = View.GONE
    }
}
