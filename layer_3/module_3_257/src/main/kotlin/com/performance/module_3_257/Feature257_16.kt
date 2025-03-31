package com.performance.module_3_257

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature257Repository1 {
    private val dataSource = Feature257DataSource1()
    private val mapper = Feature257DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
