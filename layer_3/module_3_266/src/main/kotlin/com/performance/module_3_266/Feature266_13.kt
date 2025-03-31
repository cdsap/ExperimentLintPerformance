package com.performance.module_3_266

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature266Repository0 {
    private val dataSource = Feature266DataSource0()
    private val mapper = Feature266DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
