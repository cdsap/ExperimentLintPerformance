package com.performance.module_0_88

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature88Repository2 {
    private val dataSource = Feature88DataSource2()
    private val mapper = Feature88DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
