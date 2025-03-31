package com.performance.module_4_278

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature278Repository0 {
    private val dataSource = Feature278DataSource0()
    private val mapper = Feature278DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
