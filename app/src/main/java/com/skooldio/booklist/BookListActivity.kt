package com.skooldio.booklist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        val bookList = mutableListOf(
            Book("1933988673", "Unlocking Android", "W. Frank Ableson", 416),
            Book("1935182080", "Hello! Python", "Anthony Briggs", 350),
            Book("1617291269", "iOS in Practice", "Bear P. Cahill", 325),
            Book("1930110545", ".NET Multithreading", "Alan Dennis", 360),
            Book("1884777597", "Software Requirements", "Benjamin L. Kovitz", 448)
        )

        val adapter = BookAdapter(bookList)
        // TODO Call setOnItemClickListener from adapter
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    // TODO Create function to show the book title when item clicked
}
