package com.performance.module_2_157

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature157Repository2 {
    private val dataSource = Feature157DataSource2()
    private val mapper = Feature157DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
