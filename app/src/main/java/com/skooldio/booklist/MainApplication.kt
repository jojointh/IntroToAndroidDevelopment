package com.skooldio.booklist

import android.app.Application
import com.skooldio.booklist.db.DatabaseManager

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DatabaseManager.init(applicationContext)
    }
}
