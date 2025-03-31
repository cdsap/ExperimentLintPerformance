package com.performance.module_5_88

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature88Repository1 {
    private val dataSource = Feature88DataSource1()
    private val mapper = Feature88DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
