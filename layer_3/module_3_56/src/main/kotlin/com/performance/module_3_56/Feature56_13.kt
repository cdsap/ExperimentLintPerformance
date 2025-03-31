package com.performance.module_3_56

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature56Repository0 {
    private val dataSource = Feature56DataSource0()
    private val mapper = Feature56DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
