package com.performance.module_2_146

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature146Repository1 {
    private val dataSource = Feature146DataSource1()
    private val mapper = Feature146DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
