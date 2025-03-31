package com.performance.module_0_5

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature5Repository2 {
    private val dataSource = Feature5DataSource2()
    private val mapper = Feature5DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
