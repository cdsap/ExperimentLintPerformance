package com.performance.module_2_217

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature217Repository2 {
    private val dataSource = Feature217DataSource2()
    private val mapper = Feature217DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
