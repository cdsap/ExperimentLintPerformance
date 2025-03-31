package com.performance.module_3_180

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature180Repository0 {
    private val dataSource = Feature180DataSource0()
    private val mapper = Feature180DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
