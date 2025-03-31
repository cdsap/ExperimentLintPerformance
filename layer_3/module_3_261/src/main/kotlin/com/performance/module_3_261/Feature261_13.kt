package com.performance.module_3_261

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature261Repository0 {
    private val dataSource = Feature261DataSource0()
    private val mapper = Feature261DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
