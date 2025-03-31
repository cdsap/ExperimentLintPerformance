package com.performance.module_4_282

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature282Repository2 {
    private val dataSource = Feature282DataSource2()
    private val mapper = Feature282DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
