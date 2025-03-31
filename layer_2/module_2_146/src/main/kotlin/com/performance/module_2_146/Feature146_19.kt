package com.performance.module_2_146

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature146Repository2 {
    private val dataSource = Feature146DataSource2()
    private val mapper = Feature146DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
