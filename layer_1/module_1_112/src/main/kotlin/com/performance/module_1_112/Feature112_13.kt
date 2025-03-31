package com.performance.module_1_112

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature112Repository0 {
    private val dataSource = Feature112DataSource0()
    private val mapper = Feature112DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
