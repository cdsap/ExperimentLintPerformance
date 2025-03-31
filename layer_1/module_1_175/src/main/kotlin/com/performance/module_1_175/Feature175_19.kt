package com.performance.module_1_175

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature175Repository2 {
    private val dataSource = Feature175DataSource2()
    private val mapper = Feature175DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
