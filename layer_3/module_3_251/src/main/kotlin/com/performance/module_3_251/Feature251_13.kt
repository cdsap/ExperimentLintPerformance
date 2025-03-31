package com.performance.module_3_251

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature251Repository0 {
    private val dataSource = Feature251DataSource0()
    private val mapper = Feature251DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
