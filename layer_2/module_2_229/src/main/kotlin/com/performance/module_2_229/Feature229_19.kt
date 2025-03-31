package com.performance.module_2_229

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature229Repository2 {
    private val dataSource = Feature229DataSource2()
    private val mapper = Feature229DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
