package com.performance.module_4_76

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature76Repository0 {
    private val dataSource = Feature76DataSource0()
    private val mapper = Feature76DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
