package com.chrisvasqm.androidbasics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.chrisvasqm.androidbasics.R
import com.chrisvasqm.androidbasics.model.Book
import kotlinx.android.synthetic.main.list_item.view.*

class BookAdapter(context: Context, books: List<Book>)
    : ArrayAdapter<Book>(context, 0, books) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rootView = convertView
                ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        val book = getItem(position)
        rootView.textTitle.text = book.title
        rootView.textAuthor.text = book.authors.first()

        return rootView
    }
}