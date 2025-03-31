package com.performance.module_2_217

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature217Repository0 {
    private val dataSource = Feature217DataSource0()
    private val mapper = Feature217DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
