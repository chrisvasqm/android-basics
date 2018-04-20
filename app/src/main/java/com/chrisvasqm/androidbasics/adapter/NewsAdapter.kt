package com.chrisvasqm.androidbasics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.chrisvasqm.androidbasics.R
import com.chrisvasqm.androidbasics.model.Article
import kotlinx.android.synthetic.main.list_item.view.*

class NewsAdapter(context: Context, news: List<Article>) : ArrayAdapter<Article>(context, 0, news) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rootView = convertView
                ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        val article = getItem(position)

        rootView.textTitle.text = article.title
        rootView.textSection.text = article.section
        rootView.textDate.text = formatDate(article.date)

        return rootView
    }

    private fun formatDate(date: String): String {
        return date.substring(0, 10)
    }
}