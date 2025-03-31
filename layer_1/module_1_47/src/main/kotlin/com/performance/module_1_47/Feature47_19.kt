package com.performance.module_1_47

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature47Repository2 {
    private val dataSource = Feature47DataSource2()
    private val mapper = Feature47DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
