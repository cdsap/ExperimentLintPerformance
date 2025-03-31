package com.performance.module_0_65

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature65Repository2 {
    private val dataSource = Feature65DataSource2()
    private val mapper = Feature65DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
