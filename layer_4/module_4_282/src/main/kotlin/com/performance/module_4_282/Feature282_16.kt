package com.performance.module_4_282

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature282Repository1 {
    private val dataSource = Feature282DataSource1()
    private val mapper = Feature282DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
