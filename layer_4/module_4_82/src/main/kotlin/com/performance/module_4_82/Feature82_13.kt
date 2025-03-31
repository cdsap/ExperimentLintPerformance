package com.performance.module_4_82

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature82Repository0 {
    private val dataSource = Feature82DataSource0()
    private val mapper = Feature82DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
