package com.performance.module_4_83

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature83Repository0 {
    private val dataSource = Feature83DataSource0()
    private val mapper = Feature83DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
