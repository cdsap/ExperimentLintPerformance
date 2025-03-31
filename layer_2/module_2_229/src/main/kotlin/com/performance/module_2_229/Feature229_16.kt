package com.performance.module_2_229

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature229Repository1 {
    private val dataSource = Feature229DataSource1()
    private val mapper = Feature229DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
