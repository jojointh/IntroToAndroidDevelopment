package com.skooldio.booklist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skooldio.booklist.vo.Book
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            val isbn = editTextIsbn.text.toString()
            val title = editTextTitle.text.toString()
            val author = editTextAuthor.text.toString()
            val pages = editTextPages.text.toString().toIntOrNull() ?: 0
            val book = Book(isbn, title, author, pages)

            val intent = Intent(this, BookInfoActivity::class.java)
            intent.putExtra("book", book)
            startActivity(intent)
        }
    }
}
