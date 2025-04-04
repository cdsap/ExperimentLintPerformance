package com.performance.module_0_76

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature76Repository2 {
    private val dataSource = Feature76DataSource2()
    private val mapper = Feature76DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
