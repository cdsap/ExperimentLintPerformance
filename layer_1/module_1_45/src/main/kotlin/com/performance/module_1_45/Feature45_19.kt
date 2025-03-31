package com.performance.module_1_45

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature45Repository2 {
    private val dataSource = Feature45DataSource2()
    private val mapper = Feature45DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
