package com.performance.module_0_99

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature99Repository2 {
    private val dataSource = Feature99DataSource2()
    private val mapper = Feature99DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
