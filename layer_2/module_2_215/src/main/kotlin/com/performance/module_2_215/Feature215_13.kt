package com.performance.module_2_215

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature215Repository0 {
    private val dataSource = Feature215DataSource0()
    private val mapper = Feature215DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
