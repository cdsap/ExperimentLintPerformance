package com.performance.module_4_82

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature82Repository1 {
    private val dataSource = Feature82DataSource1()
    private val mapper = Feature82DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
