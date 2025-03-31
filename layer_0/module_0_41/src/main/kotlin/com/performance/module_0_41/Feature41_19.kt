package com.performance.module_0_41

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature41Repository2 {
    private val dataSource = Feature41DataSource2()
    private val mapper = Feature41DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
