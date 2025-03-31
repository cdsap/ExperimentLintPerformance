package com.performance.module_3_266

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature266Repository2 {
    private val dataSource = Feature266DataSource2()
    private val mapper = Feature266DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
