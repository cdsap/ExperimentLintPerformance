package com.performance.module_0_82

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature82Repository2 {
    private val dataSource = Feature82DataSource2()
    private val mapper = Feature82DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
