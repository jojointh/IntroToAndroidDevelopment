package com.skooldio.booklist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(var bookList: List<Book>) : RecyclerView.Adapter<BookViewHolder>() {
    private var onItemClick: ((Book) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_book, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int = bookList.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.setIsbn(book.isbn)
        holder.setTitle(book.title)
        holder.setAuthor(book.author)
        holder.setPages(book.pages)
        holder.setOnClickListener { onItemClick?.invoke(book) }
    }

    fun setOnItemClickListener(onItemClick: ((Book) -> Unit)?) {
        this.onItemClick = onItemClick
    }
}
