package com.skooldio.booklist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.layout_book.*

class BookViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun setIsbn(isbn: String?) {
        textViewIsbn.text = isbn ?: "-"
    }

    fun setTitle(title: String?) {
        textViewTitle.text = title ?: "-"
    }

    fun setAuthor(author: String?) {
        textViewAuthor.text = author ?: "-"
    }

    fun setPages(pages: Int) {
        textViewPages.text = "$pages"
    }

    fun setOnClickListener(onClick: () -> Unit) {
        itemView.setOnClickListener { onClick() }
    }
}
