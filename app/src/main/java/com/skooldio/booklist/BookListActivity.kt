package com.skooldio.booklist

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.skooldio.booklist.api.BookApiManager
import com.skooldio.booklist.vo.Book
import com.skooldio.booklist.vo.Books
import kotlinx.android.synthetic.main.activity_book_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BookListActivity : AppCompatActivity() {
    private var adapter = BookAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        setupRecyclerView()
        getBookListFromApi()
        showLoading()
    }

    private fun setupRecyclerView() {
        adapter.setOnItemClickListener(onItemClick)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this@BookListActivity)
    }

    private fun getBookListFromApi() {
        BookApiManager.get().getAllBooks().enqueue(object : Callback<Books> {
            override fun onResponse(call: Call<Books>?, response: Response<Books>?) {
                val books: Books? = response?.body()
                val bookList: List<Book>? = books?.books
                updateBookList(bookList)
                hideLoading()
            }

            override fun onFailure(call: Call<Books>?, t: Throwable?) {
                // Do something
            }
        })
    }

    private fun updateBookList(bookList: List<Book>?) {
        adapter.setBookList(bookList)
    }

    private fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    private val onItemClick = { book: Book ->
        Toast.makeText(this, "${book.title}", Toast.LENGTH_SHORT).show()
    }
}
