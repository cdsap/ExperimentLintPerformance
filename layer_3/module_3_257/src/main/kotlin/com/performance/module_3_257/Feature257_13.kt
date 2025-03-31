package com.performance.module_3_257

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature257Repository0 {
    private val dataSource = Feature257DataSource0()
    private val mapper = Feature257DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
