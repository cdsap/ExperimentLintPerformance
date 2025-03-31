package com.performance.module_4_280

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature280Repository2 {
    private val dataSource = Feature280DataSource2()
    private val mapper = Feature280DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
